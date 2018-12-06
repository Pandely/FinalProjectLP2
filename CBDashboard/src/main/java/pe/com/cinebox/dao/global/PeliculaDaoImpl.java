package pe.com.cinebox.dao.global;

import org.springframework.stereotype.Repository;
import pe.com.cinebox.SysDataAccess;
import pe.com.cinebox.modelo.GloPelicula;
import java.util.List;

/**
 *
 * @author HEBERT
 */
@Repository
public class PeliculaDaoImpl extends SysDataAccess<Integer, GloPelicula> implements PeliculaDaoI {
    
    @SuppressWarnings("unchecked")
    
    @Override
    public List<GloPelicula> listarEntidad(){ return getListAll(); }

    @Override
    public List<GloPelicula> listarEntidadDato(String dato){
        return (List<GloPelicula>)sessionFactory.getCurrentSession()
            .createQuery("SELECT p from GloPelicula p WHERE p.nombre LIKE ?1")
            .setParameter(1,"%"+dato+"%")
            .list();
    }
    
    @Override
    public List<GloPelicula> getCarteleraSede(int dato){
        return (List<GloPelicula>)sessionFactory.getCurrentSession()
            .createQuery("SELECT p.idPelicula from GloCarteleraPelicula p WHERE "
                        + "p.idSucursal.idSucursal = ?1 AND (CURRENT_DATE BETWEEN p.fechaInicio AND p.fechaFin)")
            .setParameter(1,dato)
            .list();
    }
    
    @Override
    public GloPelicula buscarEntidadId(int id){ return getById(id); }

    @Override
    public void guardarEntidad(GloPelicula entidad){ savev(entidad); }

    @Override
    public void eliminarEntidad(int id){ delete(id); }

    @Override
    public void modificarEntidad(GloPelicula entidad){ update(entidad); }
}
