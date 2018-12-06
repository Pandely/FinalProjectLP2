package pe.com.cinebox.dao.global;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.com.cinebox.SysDataAccess;
import pe.com.cinebox.modelo.GloCarteleraPelicula;
/**
 *
 * @author HEBERT
 */
@Repository
public class CartelerapeliculaDaoImpl extends SysDataAccess<Integer, GloCarteleraPelicula> implements CartelerapeliculaDaoI {
    
    @SuppressWarnings("unchecked")
    
    @Override
    public List<GloCarteleraPelicula> listarEntidadDato(String dato){
        int dato2 = Integer.parseInt(dato);
        return (List<GloCarteleraPelicula>)sessionFactory.getCurrentSession()
                .createQuery("SELECT p from GloCarteleraPelicula p WHERE p.idSucursal.idSucursal = ?1 ")
                .setParameter(1, dato2)
                .list(); 
    }

    @Override
    public void guardarEntidad(GloCarteleraPelicula entidad){ savev(entidad); }
    
    @Override
    public void eliminarEntidad(int id){ delete(id); }

    @Override
    public void modificarEntidad(GloCarteleraPelicula entidad){ update(entidad); }

}
