package pe.com.cinebox.control;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
import java.util.Locale;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
//import org.springframework.context.MessageSource;
import org.springframework.web.servlet.view.RedirectView;
import pe.com.cinebox.modelo.GloSala;
import pe.com.cinebox.servicio.defs.FormatoServicioI;
import pe.com.cinebox.servicio.global.SalaServicioI;

/**
 *
 * @author pandely
 */
@Controller
public class SalaControl {
    //@Autowired
    //private MessageSource messageSource;
    @Autowired
    SalaServicioI salaServicio;    
    @Autowired
    FormatoServicioI formatoServicio;

    @RequestMapping(value = {"/salas" }, method = RequestMethod.GET)    
    public ModelAndView inicioEntidad(Locale locale, Map<String,Object> model){
            List<GloSala> lista=salaServicio.listarEntidadDato("1");
            model.put("listSala", lista);       
        return new ModelAndView("global/mainSala");
    }   
    
    @RequestMapping(value = "/formulario-sala", method = RequestMethod.GET)
    public ModelAndView irFormulario(@ModelAttribute("modeloSala")GloSala entidad,
            BindingResult result, Model model){        
            model.addAttribute("listFormato", formatoServicio.listarEntidad());
        return new ModelAndView("global/formSala");
    }
    
    /*
    @RequestMapping(value = {"/buscar-sala"}, method = RequestMethod.POST)
    public  ModelAndView buscarEntidad(Locale locale, Map<String,Object> model, HttpServletRequest r){
            String dato=r.getParameter("dato");
            List<GloSala> lista = salaServicio.listarEntidadDato(dato);
            model.put("listSala", lista);  
        return new ModelAndView("global/mainSala");
    }
    */
    
    @RequestMapping(value = {"/editar-sala" }, method = RequestMethod.GET)
    public ModelAndView editarEntidad(HttpServletRequest r, Model model){
            int idEntidad=Integer.parseInt(r.getParameter("id"));
            model.addAttribute("modeloSala", salaServicio.buscarEntidadId(idEntidad));
            model.addAttribute("listFormato", formatoServicio.listarEntidad());
        return new ModelAndView("global/formSala");
    } 
    
    @RequestMapping(value = "/guardar-sala", method = RequestMethod.POST)
    public ModelAndView guardarEntidad(@ModelAttribute("modeloSala")GloSala entidad,
        BindingResult result, HttpServletRequest r){
            try{
            if(entidad.getIdSala()==null)
                salaServicio.guardarEntidad(entidad);
            else
                salaServicio.modificarEntidad(entidad);
        return new ModelAndView(new RedirectView("/salas"));
            } catch (Exception e) {    
        return new ModelAndView(new RedirectView("/formulario-sala"));
            }    
    }        
    
    @RequestMapping(value = {"/eliminar-sala" }, method = RequestMethod.GET)
    public ModelAndView eliminarEntidad(HttpServletRequest r){
            int idEntidad=Integer.parseInt(r.getParameter("id"));
            salaServicio.eliminarEntidad(idEntidad);
        return new ModelAndView(new RedirectView("/salas"));
    }
}
