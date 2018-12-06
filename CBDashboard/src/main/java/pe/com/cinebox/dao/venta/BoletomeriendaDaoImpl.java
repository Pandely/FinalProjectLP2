package pe.com.cinebox.dao.venta;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.com.cinebox.SysDataAccess;
import pe.com.cinebox.modelo.VentBoletoMerienda;

/**
 *
 * @author HEBERT
 */
@Repository
public class BoletomeriendaDaoImpl extends SysDataAccess<Integer, VentBoletoMerienda> implements BoletomeriendaDaoI{
    
    @SuppressWarnings("unchecked")
    
    @Override
    public List<VentBoletoMerienda> listarEntidadDato(String dato){ 
        return (List<VentBoletoMerienda>)sessionFactory.getCurrentSession()
                .createQuery("SELECT p FROM VentBoletoMerienda p WHERE p.idBoleto = ?1")
                .setParameter(1, dato).list();
        }
    
    @Override
    public void guardarEntidad(VentBoletoMerienda entidad){ savev(entidad); }   
    
}
