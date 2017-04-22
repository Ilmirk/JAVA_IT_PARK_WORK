/**
 * Created by Student18 on 17.04.2017.
 */
public class Order {
    private  Product[] products = new Product[10];
    private  int count = 0;

    public void addProduct(Product product){
        if(count<products.length){
            products[count] = product;
            count++;
        }else {
            Product[] temp = new Product[products.length*2];
            for(int i = 0; i < products.length; i++)
                temp[i] = products[i];
        }
        products
    }
}
