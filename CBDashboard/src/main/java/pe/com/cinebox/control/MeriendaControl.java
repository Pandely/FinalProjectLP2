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
import pe.com.cinebox.modelo.GloMerienda;
import pe.com.cinebox.servicio.defs.TipomeriendaServicioI;
import pe.com.cinebox.servicio.global.MeriendaServicioI;

/**
 *
 * @author pandely
 */
@Controller
public class MeriendaControl {
    //@Autowired
    //private MessageSource messageSource;
    @Autowired
    MeriendaServicioI meriendaServicio;
    @Autowired
    TipomeriendaServicioI tipomeriendaServicio;

    @RequestMapping(value = {"/meriendas" }, method = RequestMethod.GET)    
    public ModelAndView inicioEntidad(Locale locale, Map<String,Object> model){
            List<GloMerienda> lista=meriendaServicio.listarEntidad();
            model.put("listMerienda", lista);       
        return new ModelAndView("global/mainMerienda");
    }   
    
    @RequestMapping(value = "/formulario-merienda", method = RequestMethod.GET)
    public ModelAndView irFormulario(@ModelAttribute("modeloMerienda")GloMerienda entidad,
            BindingResult result, Model model){        
            model.addAttribute("listTmerienda", tipomeriendaServicio.listarEntidad());
        return new ModelAndView("global/formMerienda");
    }
    
    @RequestMapping(value = {"/buscar-merienda"}, method = RequestMethod.POST)
    public  ModelAndView buscarEntidad(Locale locale, Map<String,Object> model, HttpServletRequest r){
            String dato=r.getParameter("dato");
            List<GloMerienda> lista = meriendaServicio.listarEntidadDato(dato);
            model.put("listMerienda", lista);  
        return new ModelAndView("global/mainMerienda");
    }
    
    @RequestMapping(value = {"/editar-merienda" }, method = RequestMethod.GET)
    public ModelAndView editarEntidad(HttpServletRequest r, Model model){
            int idEntidad=Integer.parseInt(r.getParameter("id"));
            model.addAttribute("modeloMerienda", meriendaServicio.buscarEntidadId(idEntidad));
            model.addAttribute("listTmerienda", tipomeriendaServicio.listarEntidad());
        return new ModelAndView("global/formMerienda");
    } 
    
    @RequestMapping(value = "/guardar-merienda", method = RequestMethod.POST)
    public ModelAndView guardarEntidad(@ModelAttribute("modeloMerienda")GloMerienda entidad,
        BindingResult result, HttpServletRequest r){
            try{
            if(entidad.getIdMerienda()==null)
                meriendaServicio.guardarEntidad(entidad);
            else
                meriendaServicio.modificarEntidad(entidad);
        return new ModelAndView(new RedirectView("/meriendas"));
            } catch (Exception e) {    
        return new ModelAndView(new RedirectView("/formulario-merienda"));
            }    
    }        
    
    @RequestMapping(value = {"/eliminar-merienda" }, method = RequestMethod.GET)
    public ModelAndView eliminarEntidad(HttpServletRequest r){
            int idEntidad=Integer.parseInt(r.getParameter("id"));
            meriendaServicio.eliminarEntidad(idEntidad);
        return new ModelAndView(new RedirectView("/meriendas"));
    }
}
