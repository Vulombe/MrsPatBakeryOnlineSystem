package za.co.bakery.dbao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import za.co.bakery.domain.Category;
import za.co.bakery.domain.Recipe;

/**
 *
 * @author Stuart Littles
 */
public class ProductAddDAOImpl implements ProductAddDAO{
    private Connection connect = null;

    @Override
    public boolean ProductAdd(String name, String picture, double price, Category category, String warning, String description, int recipeID){
           boolean isAdded = false;
            PreparedStatement statement;
       try {
          statement = connect.prepareStatement("INSERT INTO *** VALUES(name,picture,price,category,warning,description,recipie)");
            
            

        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
            return isAdded;
    }
    
    
}
