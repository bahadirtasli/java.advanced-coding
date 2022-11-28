package org.sda.java19.util;

import org.sda.java19.model.Currency;
import org.sda.java19.model.Product;
import org.sda.java19.model.ProductCategory;
import org.sda.java19.model.Warehouse;

import java.math.BigDecimal;
import java.util.List;

/**
 * An acting database to store the values
 *
 * @author Vinod John
 */
public class Data {
    public static Warehouse WAREHOUSE = null;

    public static List<Product> getInitialProducts() {
        Product product = new Product();
        product.setName("Apple");
        product.setProductCategory(ProductCategory.FOOD);
        product.setPrice(BigDecimal.ONE);
        product.setQuantity(100);
        product.setAvailable(true);
        product.setCurrency(Currency.EUR);

        Product product1 = new Product();
        product1.setName("Black dotted Shirt");
        product1.setProductCategory(ProductCategory.CLOTHING);
        product1.setPrice(BigDecimal.valueOf(22.34));
        product1.setQuantity(25);
        product1.setAvailable(true);
        product1.setCurrency(Currency.EUR);

        Product pliers =new Product();
        pliers.setName("Pliers");
        pliers.setPrice(BigDecimal.valueOf(15));
        pliers.setProductCategory(ProductCategory.HARDWARE);

        Product scissors =new Product();
        scissors.setName("Scissors");
        scissors.setPrice(BigDecimal.valueOf(10));
        pliers.setProductCategory(ProductCategory.HARDWARE);

        Product axe = new Product();
        axe.setName("Axe");
        axe.setPrice(BigDecimal.valueOf(5));
        pliers.setProductCategory(ProductCategory.HARDWARE);

        Product food1 = new Product();
        food1.setName("Food1");
        food1.setPrice(BigDecimal.valueOf(15));
        food1.setProductCategory(ProductCategory.FOOD);

        Product food2 = new Product();
        food2.setName("Food2");
        food2.setPrice(BigDecimal.valueOf(10));
        food2.setProductCategory(ProductCategory.FOOD);

        Product food3 = new Product();
        food3.setName("Food3");
        food3.setPrice(BigDecimal.valueOf(5));
        food3.setProductCategory(ProductCategory.FOOD);

        Product pants = new Product();
        pants.setName("Pants");
        pants.setPrice(BigDecimal.valueOf(15));
        pants.setProductCategory(ProductCategory.CLOTHING);

        Product thsirt = new Product();
        thsirt.setName("thsirt");
        thsirt.setPrice(BigDecimal.valueOf(10));
        thsirt.setProductCategory(ProductCategory.CLOTHING);

        Product jacket = new Product();
        jacket.setName("Jacket");
        jacket.setPrice(BigDecimal.valueOf(5));
        jacket.setProductCategory(ProductCategory.CLOTHING);

        return List.of(product, product1);
    }
}