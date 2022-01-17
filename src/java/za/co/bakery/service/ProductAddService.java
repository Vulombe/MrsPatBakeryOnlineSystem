
package za.co.bakery.service;

import za.co.bakery.domain.Category;
import za.co.bakery.domain.Recipe;

/**
 *
 * @author Stuart Littles
 */
public interface ProductAddService {
    boolean ProductAdd(String name, String picture, double price, Category category, String warning, String description, int recipeID);   
}
