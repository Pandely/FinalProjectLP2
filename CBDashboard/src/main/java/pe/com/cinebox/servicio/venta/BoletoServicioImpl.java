package pe.com.cinebox.servicio.venta;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.com.cinebox.modelo.VentBoleto;
import pe.com.cinebox.dao.venta.BoletoDaoI;

/**
 *
 * @author Student
 */
@Service
@Transactional
public class BoletoServicioImpl implements BoletoServicioI {
    
    @Autowired
    public BoletoDaoI dao;

    @Override
    public VentBoleto buscarEntidadId(int id){return dao.buscarEntidadId(id);}

    @Override
    public void guardarEntidad(VentBoleto entidad){dao.guardarEntidad(entidad);}
}
