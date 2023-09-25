package io.artisancodes.springhibernatedemo.entity.dao;

import io.artisancodes.springhibernatedemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl implements StudentDAO {

    // define the field for entity manager
    private final EntityManager entityManager;

    // inject entity manager using constructor
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // implement save method
    // add transaction annotation since we are performing an update
    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }
}
