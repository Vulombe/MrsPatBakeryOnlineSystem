package za.co.bakery.dbao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import za.co.bakery.domain.Category;
import za.co.bakery.domain.Product;
import za.co.bakery.domain.Role;
import za.co.bakery.domain.User;

/**
 *
 * @author Stuart Littles
 */
public class UserViewDAOImpl  implements UserViewDAO{

    private Connection connect = null;
    
    @Override
    public List<User> getUsers() {
        PreparedStatement statement;
            List<User> Users = null;
        try {
            statement = connect.prepareStatement("***");
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                Users.add(new User(rs.getInt("ID"),
                        rs.getString("title"),
                        rs.getString("firstName"),
                        rs.getString("lastName"), 
                        rs.getString("email"),
                        rs.getString("contactNumber"),
                        rs.getString("password"),
                        (Role) rs.getObject("User Role")));
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return Users;
    }
    
}
