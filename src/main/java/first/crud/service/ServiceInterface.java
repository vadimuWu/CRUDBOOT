package first.crud.service;

import first.crud.model.Person;

import java.util.List;

public interface ServiceInterface {
    List<Person> index();

    Person show(int id);

    void save(Person person);

    void delete(int id);
}
