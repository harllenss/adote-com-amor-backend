package adote.com.amor.backend.repository;

import org.springframework.data.repository.CrudRepository;

import adote.com.amor.backend.domain.Animal;

public interface AnimalRepository extends CrudRepository<Animal, String> {

}
