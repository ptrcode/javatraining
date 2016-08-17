package Chapter9OOPS.coupling.good;

/**
 * Created by papu bhattacharya on 12/8/16.
 */
class ShoppingCartEntry {
    //change the variable etc , dont need to change main program
    float pricedummy;
    int quantity;

    public float getTotalPrice() {
        return pricedummy * quantity;
    }
}

class CartContents {
    //change in any other structure dont make difference
    ShoppingCartEntry[] items;

    public float getTotalPrice() {
        float totalPrice = 0;
        for (ShoppingCartEntry item : items) {
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}

class Order {
    private CartContents cart;
    private float salesTax;

    public Order(CartContents cart, float salesTax) {
        this.cart = cart;
        this.salesTax = salesTax;
    }

    public float totalPrice() {
        return cart.getTotalPrice() * (1.0f + salesTax);
    }
}

public class CouplingExamplesSolution {

}
