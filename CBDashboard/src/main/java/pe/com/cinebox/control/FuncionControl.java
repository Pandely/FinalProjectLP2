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
import pe.com.cinebox.modelo.GloFuncion;
import pe.com.cinebox.servicio.defs.FormatoServicioI;
import pe.com.cinebox.servicio.global.FuncionServicioI;
import pe.com.cinebox.servicio.global.PeliculaServicioI;
import pe.com.cinebox.servicio.global.SalaServicioI;

/**
 *
 * @author pandely
 */
@Controller
public class FuncionControl {
    //@Autowired
    //private MessageSource messageSource;
    @Autowired
    FuncionServicioI funcionServicio;
    @Autowired
    PeliculaServicioI peliculaServicio;
    @Autowired
    SalaServicioI salaServicio;
    @Autowired
    FormatoServicioI formatoServicio;

    @RequestMapping(value = {"/funciones" }, method = RequestMethod.GET)    
    public ModelAndView inicioEntidad(Locale locale, Map<String,Object> model){
            List<GloFuncion> lista=funcionServicio.listarEntidadDato(1, 1);
            model.put("listFuncion", lista);       
        return new ModelAndView("global/mainFuncion");
    }   
    
    @RequestMapping(value = "/formulario-funcion", method = RequestMethod.GET)
    public ModelAndView irFormulario(@ModelAttribute("modeloFuncion")GloFuncion entidad,
            BindingResult result, Model model){        
            model.addAttribute("listPelicula", peliculaServicio.listarEntidad());
            model.addAttribute("listSala", salaServicio.listarEntidadDato("1"));
            model.addAttribute("listFormato", formatoServicio.listarEntidad());
        return new ModelAndView("global/formFuncion");
    }
    /*
    @RequestMapping(value = {"/buscar-funcion"}, method = RequestMethod.POST)
    public  ModelAndView buscarEntidad(Locale locale, Map<String,Object> model, HttpServletRequest r){
            String dato=r.getParameter("dato");
            List<GloFuncion> lista = funcionServicio.listarEntidadDato(1,1);
            model.put("listFuncion", lista);  
        return new ModelAndView("global/mainFuncion");
    }
    */
    @RequestMapping(value = {"/editar-funcion" }, method = RequestMethod.GET)
    public ModelAndView editarEntidad(HttpServletRequest r, Model model){
            int idEntidad=Integer.parseInt(r.getParameter("id"));
            model.addAttribute("modeloFuncion", funcionServicio.buscarEntidadId(idEntidad));            
            model.addAttribute("listPelicula", peliculaServicio.listarEntidad());
            model.addAttribute("listSala", salaServicio.listarEntidadDato("1"));
            model.addAttribute("listFormato", formatoServicio.listarEntidad());
        return new ModelAndView("global/formFuncion");
    } 
    
    @RequestMapping(value = "/guardar-funcion", method = RequestMethod.POST)
    public ModelAndView guardarEntidad(@ModelAttribute("modeloFuncion")GloFuncion entidad,
        BindingResult result, HttpServletRequest r){
            try{
            if(entidad.getIdFuncion()==null)
                funcionServicio.guardarEntidad(entidad);
            else
                funcionServicio.modificarEntidad(entidad);
        return new ModelAndView(new RedirectView("/funciones"));
            } catch (Exception e) {    
        return new ModelAndView(new RedirectView("/formulario-funcion"));
            }    
    }        
    
    @RequestMapping(value = {"/eliminar-funcion" }, method = RequestMethod.GET)
    public ModelAndView eliminarEntidad(HttpServletRequest r){
            int idEntidad=Integer.parseInt(r.getParameter("id"));
            funcionServicio.eliminarEntidad(idEntidad);
        return new ModelAndView(new RedirectView("/funciones"));
    }
}
