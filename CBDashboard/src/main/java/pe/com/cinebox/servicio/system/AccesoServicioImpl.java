package pe.com.cinebox.servicio.system;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.com.cinebox.modelo.SysAcceso;
import pe.com.cinebox.dao.system.AccesoDaoI;

/**
 *
 * @author Student
 */
@Service
@Transactional
public class AccesoServicioImpl implements AccesoServicioI {
    
    @Autowired
    public AccesoDaoI dao;
    
    @Override
    public SysAcceso buscarEntidadId(int id){return dao.buscarEntidadId(id);}
}
