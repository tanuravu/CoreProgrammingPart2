package Inheritance.HybridInheritance;

// Superclass
class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayPerson() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

// Interface
interface Worker {
    void performDuties();
}

// Subclass Chef
class Chef extends Person implements Worker {
    String specialty;

    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println("Chef " + name + " is cooking " + specialty + ".");
    }
}

// Subclass Waiter
class Waiter extends Person implements Worker {
    int tablesAssigned;

    Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter " + name + " is serving " + tablesAssigned + " tables.");
    }
}

// Main Class
public class RestaurantSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Ravi", 101, "Italian Cuisine");
        Waiter waiter = new Waiter("Amit", 102, 5);

        chef.displayPerson();
        chef.performDuties();

        waiter.displayPerson();
        waiter.performDuties();
    }
}
