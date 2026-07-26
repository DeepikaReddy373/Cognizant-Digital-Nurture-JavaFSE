public class SearchDemo {

    public static Product linearSearch(Product[] products, String key) {

        for(Product p : products) {
            if(p.productName.equalsIgnoreCase(key)) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String key) {

        int low = 0;
        int high = products.length - 1;

        while(low <= high) {

            int mid = (low + high) / 2;

            int result =
                products[mid].productName.compareToIgnoreCase(key);

            if(result == 0)
                return products[mid];

            if(result < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
            new Product(1,"Laptop","Electronics"),
            new Product(2,"Mobile","Electronics"),
            new Product(3,"Tablet","Electronics")
        };

        Product p = linearSearch(products,"Mobile");

        if(p != null)
            System.out.println("Found: " + p.productName);
    }
}