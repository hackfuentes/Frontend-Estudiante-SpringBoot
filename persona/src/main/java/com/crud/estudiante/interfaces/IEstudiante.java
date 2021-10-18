package com.crud.estudiante.interfaces;

import com.crud.estudiante.modelo.Estudiante;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstudiante extends CrudRepository<Estudiante, Integer>{
}
