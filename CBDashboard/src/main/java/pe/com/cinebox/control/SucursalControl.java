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
import pe.com.cinebox.modelo.GloSucursal;
import pe.com.cinebox.servicio.defs.CiudadServicioI;
import pe.com.cinebox.servicio.global.SucursalServicioI;

/**
 *
 * @author pandely
 */
@Controller
public class SucursalControl {
    //@Autowired
    //private MessageSource messageSource;
    @Autowired
    SucursalServicioI sucursalServicio;    
    @Autowired
    CiudadServicioI ciudadServicio;

    @RequestMapping(value = {"/sucursales" }, method = RequestMethod.GET)    
    public ModelAndView inicioEntidad(Locale locale, Map<String,Object> model){
            List<GloSucursal> lista=sucursalServicio.listarEntidad();
            model.put("listSucursal", lista);       
        return new ModelAndView("global/mainSucursal");
    }   
    
    @RequestMapping(value = "/formulario-sucursal", method = RequestMethod.GET)
    public ModelAndView irFormulario(@ModelAttribute("modeloSucursal")GloSucursal entidad,
            BindingResult result, Model model){        
            model.addAttribute("listCiudad", ciudadServicio.listarEntidad());
        return new ModelAndView("global/formSucursal");
    }
    
    /*
    @RequestMapping(value = {"/buscar-sucursal"}, method = RequestMethod.POST)
    public  ModelAndView buscarEntidad(Locale locale, Map<String,Object> model, HttpServletRequest r){
            String dato=r.getParameter("dato");
            List<GloSucursal> lista = salaServicio.listarEntidadDato(dato);
            model.put("listSucursal", lista);  
        return new ModelAndView("global/mainSucursal");
    }
    */
    
    @RequestMapping(value = {"/editar-sucursal" }, method = RequestMethod.GET)
    public ModelAndView editarEntidad(HttpServletRequest r, Model model){
            int idEntidad=Integer.parseInt(r.getParameter("id"));
            model.addAttribute("modeloSucursal", sucursalServicio.buscarEntidadId(idEntidad));
            model.addAttribute("listCiudad", ciudadServicio.listarEntidad());
        return new ModelAndView("global/formSucursal");
    } 
    
    @RequestMapping(value = "/guardar-sucursal", method = RequestMethod.POST)
    public ModelAndView guardarEntidad(@ModelAttribute("modeloSucursal")GloSucursal entidad,
        BindingResult result, HttpServletRequest r){
            try{
            if(entidad.getIdSucursal()==null)
                sucursalServicio.guardarEntidad(entidad);
            else
                sucursalServicio.modificarEntidad(entidad);
        return new ModelAndView(new RedirectView("/sucursales"));
            } catch (Exception e) {    
        return new ModelAndView(new RedirectView("/formulario-sucursal"));
            }    
    }        
    
    @RequestMapping(value = {"/eliminar-sucursal" }, method = RequestMethod.GET)
    public ModelAndView eliminarEntidad(HttpServletRequest r){
            int idEntidad=Integer.parseInt(r.getParameter("id"));
            sucursalServicio.eliminarEntidad(idEntidad);
        return new ModelAndView(new RedirectView("/sucursales"));
    }
}
