package pe.com.cinebox.api.global;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.cinebox.modelo.VentBoleto;
import pe.com.cinebox.servicio.venta.BoletoServicioI;

/**
 *
 * @author hebertcb
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class BoletoApi {
    
    @Autowired
    BoletoServicioI boletoServicio;

   
    
/*
    @GetMapping("/sucursal")
    public List<GloSucursal> getAllEntidad() {
            System.out.println("Get all Categoria Producto...");
            List<GloSucursal> entidad = new ArrayList<>();
            sucursalServicio.listarEntidad().forEach(entidad::add);
        return entidad;
    }*/
    @PostMapping(value = "/sucursal/post")
    public VentBoleto postEntidadt(@RequestBody VentBoleto entidad) {
            boletoServicio.guardarEntidad(entidad);
        return entidad;
    }
/*
    @DeleteMapping("/sucursal/{id}")
    public ResponseEntity<String> deleteEntidad(@PathVariable("id") int id) {
            System.out.println("Delete Categoria Producto with ID = " + id + "...");
            sucursalServicio.eliminarEntidad(id);
        return new ResponseEntity<>("Rntidad has been deleted!", HttpStatus.OK);
    }



    @GetMapping(value = "/sucursal/dato/{nombre}")
    public List<GloSucursal> findEntidadDato(@PathVariable String nombre) {
            List<GloSucursal> catProduct = sucursalServicio.listarEntidadDato(nombre);
        return catProduct;
    }

    @PutMapping("/sucursal/{id}")
    public ResponseEntity<String> updateCategoriaProduct(@PathVariable("id") int id, @RequestBody GloSucursal entidad) {
            System.out.println("Update Entidad with ID = " + id + "...");

            try {
                sucursalServicio.guardarEntidad(entidad);
            return new ResponseEntity<>("Se Actualizo Correctamente", HttpStatus.OK);
            
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
    }
*/
}
