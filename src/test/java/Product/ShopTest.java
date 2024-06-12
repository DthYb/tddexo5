package Product;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.example.Product.Product;
import com.example.Product.Shop;

public class ShopTest {

    private Product tartine;
    private Product jus;
    private Product nutella;

    public Shop setup(){
        List<Product> products = new ArrayList<Product>();
        this.tartine = new Product("pain de mie", 2, 10, "tartine");
        products.add(this.tartine);
        this.jus = new Product("Jus d'orange", 6, 6, "jus");
        products.add(this.jus);
        this.nutella = new Product("Pot", 4, 8, "nuttela");
        products.add(this.nutella);

        Shop shop = new Shop(products);
        return shop;
    }

    @Test
    public void whenSellInEquals0_QualityLowerTwiceFaster(){
        Shop shop = this.setup();
        shop.update(jus);

        assertEquals((Integer) 2, jus.getSellIn());
    }

}
