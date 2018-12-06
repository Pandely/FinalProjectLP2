package pe.com.cinebox.servicio.global;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.com.cinebox.modelo.GloUscliente;
import pe.com.cinebox.dao.global.UsclienteDaoI;

/**
 *
 * @author Student
 */
@Service
@Transactional
public class UsclienteServicioImpl implements UsclienteServicioI {
    
    @Autowired
    public UsclienteDaoI dao;

    @Override
    public GloUscliente buscarEntidadId(int id){return dao.buscarEntidadId(id);}

    @Override
    public void guardarEntidad(GloUscliente entidad){dao.guardarEntidad(entidad);}

    @Override
    public void modificarEntidad(GloUscliente entidad){dao.modificarEntidad(entidad);}
}
