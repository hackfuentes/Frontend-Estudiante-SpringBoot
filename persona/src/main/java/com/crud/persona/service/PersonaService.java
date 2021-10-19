package com.crud.persona.service;

import com.crud.persona.interfaceService.IpersonaService;
import com.crud.persona.interfaces.IPersona;
import com.crud.persona.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService implements IpersonaService {
    @Autowired
    private IPersona data;

    @Override
    public List<Persona> listar() {

        return (List<Persona>)data.findAll();
    }

    @Override
    public Optional<Persona> listarCodsis(int codsis) {

        return data.findById(codsis);
    }

    @Override
    public int save(Persona p) {

        int res = 0;
        Persona persona =data.save(p);
        if(!persona.equals(null)){
            res = 1;
        }
        return res;
    }

    @Override
    public void delete(int codsis) {
        data.deleteById(codsis);
    }
}
