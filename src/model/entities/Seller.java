package model.entities;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Seller implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    // Creating formatter to handle SQL DATETIME format
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private Integer id;
    private String name;
    private String email;
    private Double baseSalary;
    private LocalDate dateOfBirth;
    private Department department;

    public Seller() {}

    public Seller(Integer id, String name, String email, Double baseSalary, LocalDate dateOfBirth, Department department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.baseSalary = baseSalary;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public static DateTimeFormatter getDateFormatter() {
        return DATE_FORMATTER;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Seller seller = (Seller) o;
        return Objects.equals(id, seller.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", baseSalary=" + baseSalary +
                ", dateOfBirth=" + dateOfBirth +
                '}' +
                ", department=" + department;
    }
}
