package pe.com.cinebox.servicio.global;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.com.cinebox.modelo.GloMerienda;
import pe.com.cinebox.dao.global.MeriendaDaoI;

/**
 *
 * @author Student
 */
@Service
@Transactional
public class MeriendaServicioImpl implements MeriendaServicioI {
    
    @Autowired
    public MeriendaDaoI dao;
    
    @Override
    public List<GloMerienda> listarEntidad(){ return dao.listarEntidad();}
    
    @Override
    public List<GloMerienda> listarEntidadDato(String dato){ return dao.listarEntidadDato(dato); }

    @Override
    public GloMerienda buscarEntidadId(int id){return dao.buscarEntidadId(id);}

    @Override
    public void guardarEntidad(GloMerienda entidad){dao.guardarEntidad(entidad);}

    @Override
    public void eliminarEntidad(int id){dao.eliminarEntidad(id);}

    @Override
    public void modificarEntidad(GloMerienda entidad){dao.modificarEntidad(entidad);}
}
