package sierra034.storage;

import sierra034.objects.Meat;
import sierra034.objects.Potato;
import sierra034.objects.Product;
import sierra034.objects.Rice;

public class Database {

    private Product[] products;

    public Database() {
        products = new Product[3];
        Product potato = new Potato("Sabanera");
        Product rice = new Rice("Una marca");
        Product meat = new Meat("Lomo fino");

        products[0] = potato;
        products[1] = rice;
        products[2] = meat;
    }

    public Product getByIndex(int i) {
        if(i < 0 || i > 2) {
            System.out.println("Índice no válido!");
            return null;
        }

        return this.products[i];
    }

    public Product[] getAll() {
        return this.products;
    }
}
