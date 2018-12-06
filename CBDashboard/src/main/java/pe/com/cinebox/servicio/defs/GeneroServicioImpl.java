package pe.com.cinebox.servicio.defs;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.com.cinebox.modelo.DefGenero;
import pe.com.cinebox.dao.defs.GeneroDaoI;

/**
 *
 * @author HEBERT
 */
@Service
@Transactional
public class GeneroServicioImpl implements GeneroServicioI {
    
    @Autowired
    public GeneroDaoI dao;
    
    @Override
    public List<DefGenero> listarEntidad(){ return dao.listarEntidad();}
}
