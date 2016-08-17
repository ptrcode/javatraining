package Chapter9OOPS.coupling.bad;

/**
 * Created by papu bhattacharya on 12/8/16.
 */
class ShoppingCartEntry {
    public float price;
    /*change to following , u will have issue
    public float todaysPrice;*/
    public int quantity;
}

class ShoppingCart {
    public ShoppingCartEntry[] items;
    /*change to this , you will have issue
    public ArrayList<ShoppingCartEntry> items;*/
}

class Order {
    private ShoppingCart cart;
    private float salesTax;

    public Order(ShoppingCart cart, float salesTax) {
        this.cart = cart;
        this.salesTax = salesTax;
    }

    // This method know the internal details of ShoppingCartEntry and
    // ShoppingCart classes. If there is any change in any of those
    // classes, this method also needs to change.
    public float orderTotalPrice() {
        float cartTotalPrice = 0;
        for (int i = 0; i < cart.items.length; i++) {
            cartTotalPrice += cart.items[i].price * cart.items[i].quantity;
        }
        cartTotalPrice += cartTotalPrice * salesTax;
        return cartTotalPrice;
    }
}

public class CouplingExamplesProblem {

}
