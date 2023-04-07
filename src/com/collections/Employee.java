package com.collections;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
    String name;
    Integer empId;
    Double salary;

    public Employee(String name, Integer empId, Double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(empId, employee.empId) && Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, empId, salary);
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                ", salary=" + salary +
                '}';
    }

//    @Override
//    public int compareTo(Employee that) {
//        return this.empId - that.empId;
//    }
    @Override
    public int compareTo(Employee that) {
        return this.name.compareTo(that.name);
    }
}
