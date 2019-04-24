package sierra034.test;

import sierra034.objects.Product;
import sierra034.storage.Database;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        Product product = database.getByIndex(0);
        System.out.println(product);
    }
}
