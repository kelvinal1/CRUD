package m5b.CRUD.repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import m5b.CRUD.modelos.persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepositorio extends MongoRepository<persona,String> {
}
