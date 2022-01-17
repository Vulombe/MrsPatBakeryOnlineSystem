
package za.co.bakery.service;

import java.util.ArrayList;
import java.util.List;
import za.co.bakery.domain.Category;
import za.co.bakery.domain.Product;

/**
 *
 * @author StuartLittles
 */
public interface ProductViewService {
    List<Product> getProduct(Category choice);
}
