package pe.com.cinebox.servicio.defs;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.com.cinebox.modelo.DefCiudad;
import pe.com.cinebox.dao.defs.CiudadDaoI;

/**
 *
 * @author HEBERT
 */
@Service
@Transactional
public class CiudadServicioImpl implements CiudadServicioI {
    
    @Autowired
    public CiudadDaoI dao;
    
    @Override
    public List<DefCiudad> listarEntidad(){ return dao.listarEntidad();}
}
