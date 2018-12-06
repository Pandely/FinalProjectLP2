package pe.com.cinebox.servicio.global;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.com.cinebox.modelo.GloMeriendaSucursal;
import pe.com.cinebox.dao.global.MeriendasucursalDaoI;

/**
 *
 * @author Student
 */
@Service
@Transactional
public class MeriendasucursalServicioImpl implements MeriendasucursalServicioI {
    
    @Autowired
    public MeriendasucursalDaoI dao;

    @Override
    public List<GloMeriendaSucursal> listarEntidadDato(String dato){ return dao.listarEntidadDato(dato);}

    @Override
    public void guardarEntidad(GloMeriendaSucursal entidad){dao.guardarEntidad(entidad);}

    @Override
    public void eliminarEntidad(int id){dao.eliminarEntidad(id);}

    @Override
    public void modificarEntidad(GloMeriendaSucursal entidad){dao.modificarEntidad(entidad);}
}
