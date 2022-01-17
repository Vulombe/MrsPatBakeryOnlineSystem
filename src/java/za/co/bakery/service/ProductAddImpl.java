package za.co.bakery.service;

import za.co.bakery.dbao.ProductAddDAO;
import za.co.bakery.dbao.ProductAddDAOImpl;
import za.co.bakery.domain.Category;
import za.co.bakery.domain.Recipe;

/**
 *
 * @author Stuart Littles
 */
public class ProductAddImpl implements ProductAddService{
    private ProductAddDAO productAdd;
    
    public ProductAddImpl(){
        this.productAdd = new ProductAddDAOImpl();
    }


    @Override
    public boolean ProductAdd(String name, String picture, double price, Category category, String warning, String description, int recipeID) {
        return productAdd.ProductAdd(name, picture, price, category, warning, description, recipeID);
    }
    
}
