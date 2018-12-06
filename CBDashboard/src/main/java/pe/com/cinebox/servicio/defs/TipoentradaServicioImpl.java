package pe.com.cinebox.servicio.defs;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.com.cinebox.modelo.DefTipoEntrada;
import pe.com.cinebox.dao.defs.TipoentradaDaoI;

/**
 *
 * @author Student
 */
@Service
@Transactional
public class TipoentradaServicioImpl implements TipoentradaServicioI {
    
    @Autowired
    public TipoentradaDaoI dao;
    
    @Override
    public List<DefTipoEntrada> listarEntidad(){ return dao.listarEntidad();}
}
