package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable {

    private static final long serialVersionUID = 1l;

    private Integer id;
    private String name;
    private String email;
    private Date birhDate;
    private Double BaseSalary;

    private Department department;

    public  Seller(){

    }

    public Seller(Integer id, String name, String email, Date birhDate, Double baseSalary, Department department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birhDate = birhDate;
        BaseSalary = baseSalary;
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

    public Date getBirhDate() {
        return birhDate;
    }

    public void setBirhDate(Date birhDate) {
        this.birhDate = birhDate;
    }

    public Double getBaseSalary() {
        return BaseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        BaseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Seller)) return false;
        Seller seller = (Seller) o;
        return getId().equals(seller.getId()) && Objects.equals(getName(), seller.getName()) && Objects.equals(getEmail(), seller.getEmail()) && Objects.equals(getBirhDate(), seller.getBirhDate()) && Objects.equals(getBaseSalary(), seller.getBaseSalary()) && Objects.equals(getDepartment(), seller.getDepartment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birhDate=" + birhDate +
                ", BaseSalary=" + BaseSalary +
                ", department=" + department +
                '}';
    }
}
