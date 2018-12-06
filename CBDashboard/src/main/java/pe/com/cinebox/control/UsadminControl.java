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
import pe.com.cinebox.modelo.GloUsadmin;
import pe.com.cinebox.servicio.global.SucursalServicioI;
import pe.com.cinebox.servicio.global.UsadminServicioI;

/**
 *
 * @author pandely
 */
@Controller
public class UsadminControl {
    //@Autowired
    //private MessageSource messageSource;
    @Autowired
    UsadminServicioI usadminServicio;
    @Autowired
    SucursalServicioI sucursalServicio;

    @RequestMapping(value = {"/usadmins" }, method = RequestMethod.GET)    
    public ModelAndView inicioEntidad(Locale locale, Map<String,Object> model){
            List<GloUsadmin> lista=usadminServicio.listarEntidad();
            model.put("listUsadmin", lista);       
        return new ModelAndView("global/mainUsadmin");
    }   
    
    @RequestMapping(value = "/formulario-usadmin", method = RequestMethod.GET)
    public ModelAndView irFormulario(@ModelAttribute("modeloUsadmin")GloUsadmin entidad,
            BindingResult result, Model model){        
            model.addAttribute("listUsadmin", sucursalServicio.listarEntidad());
        return new ModelAndView("global/formUsadmin");
    }
    
    /*
    @RequestMapping(value = {"/buscar-usadmin"}, method = RequestMethod.POST)
    public  ModelAndView buscarEntidad(Locale locale, Map<String,Object> model, HttpServletRequest r){
            String dato=r.getParameter("dato");
            List<GloUsadmin> lista = usadminServicio.listarEntidadDato("1");
            model.put("listUsadmin", lista);  
        return new ModelAndView("global/mainUsadmin");
    }
    */
    
    @RequestMapping(value = {"/editar-usadmin" }, method = RequestMethod.GET)
    public ModelAndView editarEntidad(HttpServletRequest r, Model model){
            int idEntidad=Integer.parseInt(r.getParameter("id"));
            model.addAttribute("modeloUsadmin", usadminServicio.buscarEntidadId(idEntidad));            
            model.addAttribute("listSucursal", sucursalServicio.listarEntidad());
        return new ModelAndView("global/formUsadmin");
    } 
    
    @RequestMapping(value = "/guardar-usadmin", method = RequestMethod.POST)
    public ModelAndView guardarEntidad(@ModelAttribute("modeloUsadmin")GloUsadmin entidad,
        BindingResult result, HttpServletRequest r){
            try{
            if(entidad.getIdAdmin()==null)
                usadminServicio.guardarEntidad(entidad);
            else
                usadminServicio.modificarEntidad(entidad);
        return new ModelAndView(new RedirectView("/usadmins"));
            } catch (Exception e) {    
        return new ModelAndView(new RedirectView("/formulario-usadmin"));
            }    
    }        
    
    @RequestMapping(value = {"/eliminar-usadmin" }, method = RequestMethod.GET)
    public ModelAndView eliminarEntidad(HttpServletRequest r){
            int idEntidad=Integer.parseInt(r.getParameter("id"));
            usadminServicio.eliminarEntidad(idEntidad);
        return new ModelAndView(new RedirectView("/usadmins"));
    }
}
