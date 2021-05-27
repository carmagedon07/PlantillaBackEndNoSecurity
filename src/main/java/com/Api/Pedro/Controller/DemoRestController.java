package com.Api.Pedro.Controller;

import com.Api.Pedro.DTO.PersonaDTO1;
import com.Api.Pedro.Entities.Usuarios.Persona;
import com.Api.Pedro.Repository.Usuarios.PersonaRepository;
import com.Api.Pedro.Servicio.Implement.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class DemoRestController {

    @Autowired
    private PersonaRepository personaRepository;

    @Autowired
    private PersonaService personaService;

    @GetMapping("/1")
    public List<Persona> cons(){

        Persona per = new Persona();


        per.setName("pedro");
        per.setPrimerApellido("Caro");
        per.setFechaNacimiento("7 de abril");

        personaRepository.save(per);

        return personaRepository.findAll();
    }

    /*@PostMapping(path = "/2",consumes ={MediaType.APPLICATION_JSON_VALUE},
            produces ={MediaType.APPLICATION_JSON_VALUE}))*/
    @PostMapping(path="/2",consumes ={MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<PersonaDTO1> instPersona(@RequestBody PersonaDTO1 personaDTO1)
    {
        personaService.insertarPersonaDTO1(personaDTO1);

        return new ResponseEntity <PersonaDTO1>(personaDTO1,HttpStatus.OK);
    }
}
