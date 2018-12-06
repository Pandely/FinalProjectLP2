package pe.com.cinebox.servicio.global;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.com.cinebox.modelo.GloUsadmin;
import pe.com.cinebox.dao.global.UsadminDaoI;

/**
 *
 * @author Student
 */
@Service
@Transactional
public class UsadminServicioImpl implements UsadminServicioI {
    
    @Autowired
    public UsadminDaoI dao;

    @Override
    public List<GloUsadmin> listarEntidad(){ return dao.listarEntidad(); }
    
    @Override
    public List<GloUsadmin> listarEntidadDato(String dato){ return dao.listarEntidadDato(dato);}

    @Override
    public GloUsadmin buscarEntidadId(int id){return dao.buscarEntidadId(id);}

    @Override
    public void guardarEntidad(GloUsadmin entidad){dao.guardarEntidad(entidad);}

    @Override
    public void eliminarEntidad(int id){dao.eliminarEntidad(id);}

    @Override
    public void modificarEntidad(GloUsadmin entidad){dao.modificarEntidad(entidad);}
}
