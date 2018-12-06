package pe.com.cinebox.dao.venta;

import org.springframework.stereotype.Repository;
import pe.com.cinebox.SysDataAccess;
import pe.com.cinebox.modelo.VentBoleto;

/**
 *
 * @author HEBERT
 */
@Repository
public class BoletoDaoImpl extends SysDataAccess<Integer, VentBoleto> implements BoletoDaoI {
    
    @SuppressWarnings("unchecked")

    @Override
    public VentBoleto buscarEntidadId(int id) { return getById(id); }

    @Override
    public void guardarEntidad(VentBoleto entidad) { savev(entidad); }
}
