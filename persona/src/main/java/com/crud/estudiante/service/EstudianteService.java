package com.crud.estudiante.service;

import com.crud.estudiante.interfaceService.IestudianteService;
import com.crud.estudiante.interfaces.IEstudiante;
import com.crud.estudiante.modelo.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService implements IestudianteService {
    @Autowired
    private IEstudiante data;

    @Override
    public List<Estudiante> listar() {
        return (List<Estudiante>)data.findAll();
    }

    @Override
    public Optional<Estudiante> listarId(int id) {
        return Optional.empty();
    }

    @Override
    public int save(Estudiante p) {
        int res = 0;
        Estudiante persona = data.save(p);
        if(!persona.equals(null)){
            res = 1;
        }
        return res;
    }

    @Override
    public void delete(int id) {

    }
}
