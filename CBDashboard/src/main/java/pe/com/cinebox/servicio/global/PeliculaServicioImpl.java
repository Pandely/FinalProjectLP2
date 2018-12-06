package pe.com.cinebox.servicio.global;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.com.cinebox.modelo.GloPelicula;
import pe.com.cinebox.dao.global.PeliculaDaoI;

/**
 *
 * @author Student
 */
@Service
@Transactional
public class PeliculaServicioImpl implements PeliculaServicioI {
    
    @Autowired
    public PeliculaDaoI dao;
    
    @Override
    public List<GloPelicula> listarEntidad(){ return dao.listarEntidad();}

    @Override
    public List<GloPelicula> listarEntidadDato(String dato){ return dao.listarEntidadDato(dato);}
    
    @Override
    public List<GloPelicula> getCarteleraSede(int dato){return dao.getCarteleraSede(dato);}
    
    @Override
    public GloPelicula buscarEntidadId(int id){return dao.buscarEntidadId(id);}

    @Override
    public void guardarEntidad(GloPelicula entidad){dao.guardarEntidad(entidad);}

    @Override
    public void eliminarEntidad(int id){dao.eliminarEntidad(id);}

    @Override
    public void modificarEntidad(GloPelicula entidad){dao.modificarEntidad(entidad);}
}
