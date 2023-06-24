package co.com.ms.CursoSpring.service;

import co.com.ms.CursoSpring.domain.Persona;
import java.util.List;

public interface PersonaService {

    public List<Persona> listar();

    public void guardar(Persona persona);

    public void eliminar(Persona persona);

    public Persona encontrarPersona(Persona persona);
}
