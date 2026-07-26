package exercise3;

public class SortingCustomerOrders {

    static void bubbleSort(Order[] orders) {
        for (int i = 0; i < orders.length - 1; i++) {
            for (int j = 0; j < orders.length - i - 1; j++) {
                if (orders[j].totalPrice > orders[j + 1].totalPrice) {
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    static void quickSort(Order[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(Order[] arr, int low, int high) {
        double pivot = arr[high].totalPrice;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].totalPrice < pivot) {
                i++;
                Order temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Order temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    static void display(Order[] orders) {
        for (Order o : orders)
            System.out.println(o);
    }

    public static void main(String[] args) {

        Order[] orders = {
                new Order(101, "Deepika", 3000),
                new Order(102, "Rahul", 1500),
                new Order(103, "Anjali", 5000),
                new Order(104, "Kiran", 2500)
        };

        System.out.println("Bubble Sort:");
        bubbleSort(orders);
        display(orders);

        orders = new Order[]{
                new Order(101, "Deepika", 3000),
                new Order(102, "Rahul", 1500),
                new Order(103, "Anjali", 5000),
                new Order(104, "Kiran", 2500)
        };

        System.out.println("\nQuick Sort:");
        quickSort(orders, 0, orders.length - 1);
        display(orders);
    }
}