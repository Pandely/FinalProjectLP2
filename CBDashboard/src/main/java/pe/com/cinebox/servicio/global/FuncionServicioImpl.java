package pe.com.cinebox.servicio.global;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.com.cinebox.modelo.GloFuncion;
import pe.com.cinebox.dao.global.FuncionDaoI;

/**
 *
 * @author Student
 */
@Service
@Transactional
public class FuncionServicioImpl implements FuncionServicioI {
    
    @Autowired
    public FuncionDaoI dao;
    @Override
    public List<GloFuncion> listarEntidadDato(int dato, int dato2){ return dao.listarEntidadDato(dato, dato2); }

    @Override
    public GloFuncion buscarEntidadId(int id){return dao.buscarEntidadId(id);}

    @Override
    public void guardarEntidad(GloFuncion entidad){dao.guardarEntidad(entidad);}

    @Override
    public void modificarEntidad(GloFuncion entidad){dao.modificarEntidad(entidad);}

    @Override
    public void eliminarEntidad(int id) {dao.eliminarEntidad(id);}
}
