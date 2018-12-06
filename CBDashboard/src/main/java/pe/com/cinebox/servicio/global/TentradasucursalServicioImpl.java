package pe.com.cinebox.servicio.global;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.com.cinebox.modelo.GloTentradaSucursal;
import pe.com.cinebox.dao.global.TentradasucursalDaoI;

/**
 *
 * @author Student
 */
@Service
@Transactional
public class TentradasucursalServicioImpl implements TentradasucursalServicioI {
    
    @Autowired
    public TentradasucursalDaoI dao;

    @Override
    public List<GloTentradaSucursal> listarEntidadDato(String dato){ return dao.listarEntidadDato(dato);}

    @Override
    public void eliminarEntidad(int id){dao.eliminarEntidad(id);}

    @Override
    public void modificarEntidad(GloTentradaSucursal entidad){dao.modificarEntidad(entidad);}
}
