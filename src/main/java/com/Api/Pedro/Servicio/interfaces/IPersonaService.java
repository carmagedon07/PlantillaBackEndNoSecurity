package com.Api.Pedro.Servicio.interfaces;

import com.Api.Pedro.DTO.PersonaDTO1;
import com.Api.Pedro.Entities.Usuarios.Persona;

public interface IPersonaService {

    public void insertarPersona(Persona pe);

    public void insertarPersonaDTO1(PersonaDTO1 pe);
}
