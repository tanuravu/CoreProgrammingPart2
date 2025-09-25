import java.util.*;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getInfo() {
        return name;
    }
}

class Department {
    private String deptName;
    private List<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public void showEmployees() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            System.out.println(" - " + e.getInfo());
        }
    }
}

class Company {
    private String companyName;
    private List<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void showCompany() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.showEmployees();
        }
    }
}

public class MainCompany {
    public static void main(String[] args) {
        Company comp = new Company("TechSoft");

        Department d1 = new Department("IT");
        Department d2 = new Department("HR");

        d1.addEmployee(new Employee("Tanvi"));
        d1.addEmployee(new Employee("Sneha"));
        d2.addEmployee(new Employee("Taran"));

        comp.addDepartment(d1);
        comp.addDepartment(d2);

        comp.showCompany();
    }
}
