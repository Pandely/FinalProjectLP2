package pe.com.cinebox.servicio.global;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.com.cinebox.modelo.GloSala;
import pe.com.cinebox.dao.global.SalaDaoI;

/**
 *
 * @author Student
 */
@Service
@Transactional
public class SalaServicioImpl implements SalaServicioI {
    
    @Autowired
    public SalaDaoI dao;

    @Override
    public List<GloSala> listarEntidadDato(String dato){ return dao.listarEntidadDato(dato);}

    @Override
    public GloSala buscarEntidadId(int id){ return dao.buscarEntidadId(id); }
    
    @Override
    public void guardarEntidad(GloSala entidad){dao.guardarEntidad(entidad);}

    @Override
    public void eliminarEntidad(int id){ dao.eliminarEntidad(id); }
    
    @Override
    public void modificarEntidad(GloSala entidad){dao.modificarEntidad(entidad);}
}
