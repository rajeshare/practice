package streamApi;

import java.util.List;

class Employee22 {
    private int id;
    private String name;
    private double salary;
    private List<Address> addresses;

    // Constructor, Getters, Setters
    public Employee22(int id, String name, double salary, List<Address> addresses) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.addresses = addresses;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public List<Address> getAddresses() {
        return addresses;
    }
}
