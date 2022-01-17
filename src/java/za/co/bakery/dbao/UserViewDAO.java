package za.co.bakery.dbao;

import java.util.List;
import za.co.bakery.domain.User;

/**
 *
 * @author Stuart Littles
 */
public interface UserViewDAO {
    List<User> getUsers();
}
