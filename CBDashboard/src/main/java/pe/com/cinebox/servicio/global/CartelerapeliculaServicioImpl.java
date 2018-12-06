package pe.com.cinebox.servicio.global;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.com.cinebox.modelo.GloCarteleraPelicula;
import pe.com.cinebox.dao.global.CartelerapeliculaDaoI;

/**
 *
 * @author Student
 */
@Service
@Transactional
public class CartelerapeliculaServicioImpl implements CartelerapeliculaServicioI {
    
    @Autowired
    public CartelerapeliculaDaoI dao;

    @Override
    public List<GloCarteleraPelicula> listarEntidadDato(String dato){ return dao.listarEntidadDato(dato);}

    @Override
    public void guardarEntidad(GloCarteleraPelicula entidad){dao.guardarEntidad(entidad);}

    @Override
    public void eliminarEntidad(int id){dao.eliminarEntidad(id);}

    @Override
    public void modificarEntidad(GloCarteleraPelicula entidad){dao.modificarEntidad(entidad);}
}
