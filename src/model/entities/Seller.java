package model.entities;

import java.io.Serializable;
import java.util.Date;

public class Seller implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    private String email;
    private Date birthDate;
    private Double baseSalary;

    private Department department;

    public Seller() {

    }

    public Seller(Integer id, String name, String email, Date birthDate, Double baseSalary, Department department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public Seller setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Seller setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Seller setEmail(String email) {
        this.email = email;
        return this;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Seller setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public Seller setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
        return this;
    }

    public Department getDepartment() {
        return department;
    }

    public Seller setDepartment(Department department) {
        this.department = department;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Seller seller)) return false;

        if (getId() != null ? !getId().equals(seller.getId()) : seller.getId() != null) return false;
        if (getName() != null ? !getName().equals(seller.getName()) : seller.getName() != null) return false;
        if (getEmail() != null ? !getEmail().equals(seller.getEmail()) : seller.getEmail() != null) return false;
        if (getBirthDate() != null ? !getBirthDate().equals(seller.getBirthDate()) : seller.getBirthDate() != null)
            return false;
        if (getBaseSalary() != null ? !getBaseSalary().equals(seller.getBaseSalary()) : seller.getBaseSalary() != null)
            return false;
        return getDepartment() != null ? getDepartment().equals(seller.getDepartment()) : seller.getDepartment() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
        result = 31 * result + (getBirthDate() != null ? getBirthDate().hashCode() : 0);
        result = 31 * result + (getBaseSalary() != null ? getBaseSalary().hashCode() : 0);
        result = 31 * result + (getDepartment() != null ? getDepartment().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                ", baseSalary=" + baseSalary +
                ", department=" + department +
                '}';
    }
}
