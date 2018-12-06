package pe.com.cinebox.servicio.defs;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.com.cinebox.modelo.DefTipoMerienda;
import pe.com.cinebox.dao.defs.TipomeriendaDaoI;

/**
 *
 * @author HEBERT
 */
@Service
@Transactional
public class TipomeriendaServicioImpl implements TipomeriendaServicioI {
    
    @Autowired
    public TipomeriendaDaoI dao;
    
    @Override
    public List<DefTipoMerienda> listarEntidad(){ return dao.listarEntidad();}
}
