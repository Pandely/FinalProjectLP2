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
import pe.com.cinebox.modelo.GloPelicula;
import pe.com.cinebox.servicio.defs.CategoriaServicioI;
import pe.com.cinebox.servicio.defs.GeneroServicioI;
import pe.com.cinebox.servicio.global.PeliculaServicioI;

/**
 *
 * @author pandely
 */
@Controller
public class PeliculaControl {
    //@Autowired
    //private MessageSource messageSource;
    @Autowired
    PeliculaServicioI peliculaServicio;
    @Autowired
    GeneroServicioI generoServicio;
    @Autowired
    CategoriaServicioI categoriaServicio;

    @RequestMapping(value = {"/peliculas" }, method = RequestMethod.GET)    
    public ModelAndView inicioEntidad(Locale locale, Map<String,Object> model){
            List<GloPelicula> lista=peliculaServicio.listarEntidad();
            model.put("listPelicula", lista);       
        return new ModelAndView("global/mainPelicula");
    }   
    
    @RequestMapping(value = "/formulario-pelicula", method = RequestMethod.GET)
    public ModelAndView irFormulario(@ModelAttribute("modeloPelicula")GloPelicula entidad,
            BindingResult result, Model model){        
            model.addAttribute("listGenero", generoServicio.listarEntidad());
            model.addAttribute("listCategoria", categoriaServicio.listarEntidad());
        return new ModelAndView("global/formPelicula");
    }
    
    @RequestMapping(value = {"/buscar-pelicula"}, method = RequestMethod.POST)
    public  ModelAndView buscarEntidad(Locale locale, Map<String,Object> model, HttpServletRequest r){
            String dato=r.getParameter("dato");
            List<GloPelicula> lista = peliculaServicio.listarEntidadDato(dato);
            model.put("listPelicula", lista);  
        return new ModelAndView("global/mainPelicula");
    }
    
    @RequestMapping(value = {"/editar-pelicula" }, method = RequestMethod.GET)
    public ModelAndView editarEntidad(HttpServletRequest r, Model model){
            int idEntidad=Integer.parseInt(r.getParameter("id"));
            model.addAttribute("modeloPelicula", peliculaServicio.buscarEntidadId(idEntidad));
            model.addAttribute("listGenero", generoServicio.listarEntidad());
            model.addAttribute("listCategoria", categoriaServicio.listarEntidad());
        return new ModelAndView("global/formPelicula");
    } 
    
    @RequestMapping(value = "/guardar-pelicula", method = RequestMethod.POST)
    public ModelAndView guardarEntidad(@ModelAttribute("modeloPelicula")GloPelicula entidad,
        BindingResult result, HttpServletRequest r){
            try{
            if(entidad.getIdPelicula()==null)
                peliculaServicio.guardarEntidad(entidad);
            else
                peliculaServicio.modificarEntidad(entidad);
        return new ModelAndView(new RedirectView("/peliculas"));
            } catch (Exception e) {    
        return new ModelAndView(new RedirectView("/formulario-pelicula"));
            }    
    }        
    
    @RequestMapping(value = {"/eliminar-pelicula" }, method = RequestMethod.GET)
    public ModelAndView eliminarEntidad(HttpServletRequest r){
            int idEntidad=Integer.parseInt(r.getParameter("id"));
            peliculaServicio.eliminarEntidad(idEntidad);
        return new ModelAndView(new RedirectView("/peliculas"));
    }
}
