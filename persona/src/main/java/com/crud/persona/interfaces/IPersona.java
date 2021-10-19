package com.crud.persona.interfaces;

import com.crud.persona.modelo.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersona extends CrudRepository<Persona, Integer>{
}
