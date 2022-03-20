package m5b.CRUD.controladores;

import m5b.CRUD.repositorios.PersonaRepositorio;
import m5b.CRUD.modelos.persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.DELETE,RequestMethod.POST,RequestMethod.PUT})
@RequestMapping("/api/personas")
public class PersonaController {

    @Autowired
    PersonaRepositorio personaRepositorio;

    @GetMapping("/ListaPersonas")
    public List<persona> ListaPersonas(){
        return  personaRepositorio.findAll();
    }

    @PostMapping("/CrearPersona")
    public persona CrearPersona(@RequestBody persona newPersona){
        return personaRepositorio.insert(newPersona);
    }

    @PutMapping("/EditarPersona/{id}")
    public persona EditarPersona(@PathVariable String id,@RequestBody persona newPersona){
        return personaRepositorio.findById(id).map(persona -> {
            persona.setCorreo(newPersona.getCorreo());
            persona.setGenero(newPersona.getGenero());
            persona.setNombres(newPersona.getNombres());
            persona.setTelefono(newPersona.getTelefono());
            persona.setFecha_nacimiento(newPersona.getFecha_nacimiento());
            return personaRepositorio.save(persona);
        }).orElseGet(
                ()->{
                    return  new persona();
                }
        );
    }

    @DeleteMapping("/BorrarPersona/{id}")
    public void BorrarPersona(@PathVariable String id){
        personaRepositorio.deleteById(id);

    }

}
