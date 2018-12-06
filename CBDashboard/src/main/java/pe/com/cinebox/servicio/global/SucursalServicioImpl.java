package pe.com.cinebox.servicio.global;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.com.cinebox.modelo.GloSucursal;
import pe.com.cinebox.dao.global.SucursalDaoI;

/**
 *
 * @author Student
 */
@Service
@Transactional
public class SucursalServicioImpl implements SucursalServicioI {
    
    @Autowired
    public SucursalDaoI dao;
    
    @Override
    public List<GloSucursal> listarEntidad(){ return dao.listarEntidad();}

    @Override
    public List<GloSucursal> listarEntidadDato(String dato){ return dao.listarEntidadDato(dato);}

    @Override
    public GloSucursal buscarEntidadId(int id){return dao.buscarEntidadId(id);}

    @Override
    public void guardarEntidad(GloSucursal entidad){dao.guardarEntidad(entidad);}

    @Override
    public void eliminarEntidad(int id){dao.eliminarEntidad(id);}

    @Override
    public void modificarEntidad(GloSucursal entidad){dao.modificarEntidad(entidad);}
}
