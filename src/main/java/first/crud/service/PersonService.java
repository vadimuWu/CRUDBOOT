package first.crud.service;

import first.crud.dao.DAO;
import first.crud.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService implements ServiceInterface {

    private DAO dao;

    @Autowired
    public PersonService(DAO dao) {
        this.dao = dao;
    }

    @Override
    public List<Person> index() {
        return dao.findAll();
    }

    @Override
    public Person show(int id) {
        return dao.getOne(id);
    }

    @Override
    public void save(Person person){
        dao.save(person);
    }

    @Override
    public void delete(int id){
        dao.deleteById(id);
    }
}
