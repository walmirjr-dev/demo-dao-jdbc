package model.dao.impl;

import db.DB;
import db.DbException;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.sql.*;
import java.util.List;

public class DepartmentDaoJDBC implements DepartmentDao {

    private Connection conn;

    public DepartmentDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Department department) {
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement("INSERT INTO department (name) values (?)",
                    Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, department.getName());

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    department.setId(rs.getInt(1));
                }
                DB.closeResultSet(rs);
            }else {
                throw new DbException("Erro ao inserir o registro");
            }

        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }finally {
            DB.closeStatement(ps);
        }
    }

    @Override
    public void update(Department department) {
        PreparedStatement ps = null;

        try{
            ps = conn.prepareStatement("UPDATE department set Name = ? WHERE Id = ?",
                    Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, department.getName());
            ps.setInt(2, department.getId());

            ps.executeUpdate();

        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }finally {
            DB.closeStatement(ps);
        }
    }

    @Override
    public void deleteById(Integer id) {
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement("DELETE FROM department WHERE Id = ?");

            ps.setInt(1, id);
            ps.executeUpdate();

        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }finally {
            DB.closeStatement(ps);
        }
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
