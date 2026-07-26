package exercise4;

public class EmployeeManagementSystem {

    static Employee[] employees = new Employee[10];
    static int count = 0;

    static void add(Employee e) {
        employees[count++] = e;
    }

    static void search(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                System.out.println("Found: " + employees[i]);
                return;
            }
        }
        System.out.println("Employee Not Found");
    }

    static void display() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    static void delete(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                count--;
                break;
            }
        }
    }

    public static void main(String[] args) {

        add(new Employee(101, "Deepika", "Developer", 60000));
        add(new Employee(102, "Rahul", "Tester", 45000));
        add(new Employee(103, "Anjali", "Manager", 80000));

        System.out.println("Employees:");
        display();

        System.out.println("\nSearch:");
        search(102);

        delete(102);

        System.out.println("\nAfter Delete:");
        display();
    }
}