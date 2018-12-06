package pe.com.cinebox.servicio.system;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.com.cinebox.modelo.SysPerfil;
import pe.com.cinebox.dao.system.PerfilDaoI;

/**
 *
 * @author HEBERT
 */
@Service
@Transactional
public class PerfilServicioImpl implements PerfilServicioI {
    
    @Autowired
    public PerfilDaoI dao;
    
    @Override
    public List<SysPerfil> listarEntidad(){ return dao.listarEntidad();}
}
