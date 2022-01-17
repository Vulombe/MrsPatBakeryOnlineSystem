package za.co.bakery.dbao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import za.co.bakery.domain.Category;
import za.co.bakery.domain.Product;
import za.co.bakery.domain.Recipe;

/**
 *
 * @author StuartLittles
 */
public class ProductViewDAOImpl implements ProductViewDAO{
    
    private Connection connect = null;
    
    
    @Override
    public List<Product> getProduct(Category choice) {
            PreparedStatement statement;
            List<Product> choices = null;
        try {
            statement = connect.prepareStatement("***");
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                choices.add(new Product(rs.getInt("ProductID"),
                        rs.getString("name"),
                        rs.getString("picture"),
                        rs.getDouble("price"),
                        rs.getString("category"),
                        rs.getString("warning"),
                        rs.getString("description"),
                        rs.getInt("recipe")));
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return choices;
    }
    
}
