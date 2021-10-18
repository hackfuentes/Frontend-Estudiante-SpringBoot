package com.crud.estudiante.interfaceService;

import com.crud.estudiante.modelo.Estudiante;

import java.util.List;
import java.util.Optional;

public interface IestudianteService {
    public List<Estudiante> listar();
    public Optional<Estudiante> listarId(int id);
    public int save(Estudiante p);
    public void delete(int id);
}
