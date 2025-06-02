package model.dao.impl;

import model.dao.DepartmentDao;
import model.entities.Department;

import java.sql.Connection;
import java.util.List;

public class DepartmentDaoJDBC implements DepartmentDao {

    private Connection conn;

    public DepartmentDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Department department) {
        //TODO
    }

    @Override
    public void update(Department department) {
        //TODO
    }

    @Override
    public void deleteById(Integer id) {
        //TODO
    }

    @Override
    public Department findById(Integer id) {
        //TODO
        return null;
    }

    @Override
    public List<Department> findAll() {
        //TODO
        return List.of();
    }
}
