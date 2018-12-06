package pe.com.cinebox.servicio.defs;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.com.cinebox.modelo.DefFormato;
import pe.com.cinebox.dao.defs.FormatoDaoI;

/**
 *
 * @author HEBERT
 */
@Service
@Transactional
public class FormatoServicioImpl implements FormatoServicioI {
    
    @Autowired
    public FormatoDaoI dao;
    
    @Override
    public List<DefFormato> listarEntidad(){ return dao.listarEntidad();}
}
