package com.crud.persona.interfaceService;

import com.crud.persona.modelo.Persona;

import java.util.List;
import java.util.Optional;

public interface IpersonaService {
    public List<Persona> listar();
    public Optional<Persona> listarCodsis(int codsis);
    public int save(Persona p);
    public void delete(int codsis);
}
