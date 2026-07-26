package exercise5;

public class TaskManagementSystem {

    static Task head = null;

    static void addTask(int id, String name, String status) {
        Task newTask = new Task(id, name, status);

        if (head == null) {
            head = newTask;
        } else {
            Task temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newTask;
        }
    }

    static void displayTasks() {
        Task temp = head;
        while (temp != null) {
            System.out.println(temp.taskId + " " + temp.taskName + " " + temp.status);
            temp = temp.next;
        }
    }

    static void searchTask(int id) {
        Task temp = head;
        while (temp != null) {
            if (temp.taskId == id) {
                System.out.println("Found: " + temp.taskName);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Task Not Found");
    }

    static void deleteTask(int id) {
        if (head == null) return;

        if (head.taskId == id) {
            head = head.next;
            return;
        }

        Task temp = head;

        while (temp.next != null && temp.next.taskId != id)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    public static void main(String[] args) {

        addTask(1, "Design UI", "Pending");
        addTask(2, "Write Code", "In Progress");
        addTask(3, "Testing", "Pending");

        System.out.println("Tasks:");
        displayTasks();

        searchTask(2);

        deleteTask(2);

        System.out.println("\nAfter Delete:");
        displayTasks();
    }
}