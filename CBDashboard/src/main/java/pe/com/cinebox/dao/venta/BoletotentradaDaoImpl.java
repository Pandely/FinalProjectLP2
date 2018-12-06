package pe.com.cinebox.dao.venta;

import org.springframework.stereotype.Repository;
import pe.com.cinebox.SysDataAccess;
import pe.com.cinebox.modelo.VentBoletoTentrada;
import java.util.List;

/**
 *
 * @author HEBERT
 */
@Repository
public class BoletotentradaDaoImpl extends SysDataAccess<Integer, VentBoletoTentrada> implements BoletotentradaDaoI {
    
    @SuppressWarnings("unchecked")
    
    @Override
    public List<VentBoletoTentrada> listarEntidadDato(String dato){ 
        return (List<VentBoletoTentrada>)sessionFactory.getCurrentSession()
            .createQuery("SELECT p from VentBoletoTentrada p WHERE p.idBoleto = ?1")
            .setParameter(1,dato)
            .list();
    }
    
    @Override
    public void guardarEntidad(VentBoletoTentrada entidad){ savev(entidad); }
}
