package pe.com.cinebox.servicio.venta;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.com.cinebox.modelo.VentBoletoMerienda;
import pe.com.cinebox.dao.venta.BoletomeriendaDaoI;

/**
 *
 * @author Student
 */
@Service
@Transactional
public class BoletomeriendaServicioImpl implements BoletomeriendaServicioI {
    
    @Autowired
    public BoletomeriendaDaoI dao;

    @Override
    public List<VentBoletoMerienda> listarEntidadDato(String dato){ return dao.listarEntidadDato(dato);}

    @Override
    public void guardarEntidad(VentBoletoMerienda entidad){dao.guardarEntidad(entidad);}
}
