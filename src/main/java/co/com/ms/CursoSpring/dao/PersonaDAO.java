package co.com.ms.CursoSpring.dao;

import co.com.ms.CursoSpring.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDAO extends CrudRepository<Persona, Long> {
}
