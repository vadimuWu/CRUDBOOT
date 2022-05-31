package first.crud.dao;

import first.crud.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DAO extends JpaRepository<Person, Integer> {
}
