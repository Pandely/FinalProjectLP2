package pe.com.cinebox.servicio.venta;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.com.cinebox.modelo.VentBoletoTentrada;
import pe.com.cinebox.dao.venta.BoletotentradaDaoI;

/**
 *
 * @author Student
 */
@Service
@Transactional
public class BoletotentradaServicioImpl implements BoletotentradaServicioI {
    
    @Autowired
    public BoletotentradaDaoI dao;
    
    @Override
    public List<VentBoletoTentrada> listarEntidadDato(String dato){ return dao.listarEntidadDato(dato);}

    @Override
    public void guardarEntidad(VentBoletoTentrada entidad){dao.guardarEntidad(entidad);}
}
