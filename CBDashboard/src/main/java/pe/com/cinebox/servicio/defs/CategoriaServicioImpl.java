package pe.com.cinebox.servicio.defs;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.com.cinebox.modelo.DefCategoria;
import pe.com.cinebox.dao.defs.CategoriaDaoI;

/**
 *
 * @author HEBERT
 */
@Service
@Transactional
public class CategoriaServicioImpl implements CategoriaServicioI {
    
    @Autowired
    public CategoriaDaoI dao;
    
    @Override
    public List<DefCategoria> listarEntidad(){ return dao.listarEntidad(); }
}
