package com.example.builder;

public class Employee {

    private String name;
    private int age;
    private String department;
    private  double salary;
    private String city;

    public Employee(EmployeeBuilder employeeBuilder) {
        this.name = employeeBuilder.name;
        this.age = employeeBuilder.age;
        this.department = employeeBuilder.department;
        this.salary = employeeBuilder.salary;
        this.city = employeeBuilder.city;
    }

    public void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(department);
        System.out.println(salary);
        System.out.println(city);
    }



    static class EmployeeBuilder{
        private String name;
        private int age;
        private String department;
        private  double salary;
        private String city;


        public EmployeeBuilder setName(String name){
            this.name=name;
            return this;
        }

        public EmployeeBuilder setAge(int age){
            this.age=age;
            return this;
        }

        public EmployeeBuilder setDepartment(String department){
            this.department=department;
            return this;
        }

        public EmployeeBuilder setSalary(double salary){
            this.salary=salary;
            return this;
        }

        public EmployeeBuilder setCity(String city){
            this.city=city;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }

    }

}

class  Main{

    public static void main(String[] args) {

        Employee employee=new Employee.
                             EmployeeBuilder()
                .setName("Sathvik")
                .setAge(24)
                .setCity("Banglore")
                .setDepartment("Devolopment")
                .setSalary(100000)
                .build();
        employee.display();
    }



}
