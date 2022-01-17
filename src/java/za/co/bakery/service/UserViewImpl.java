package za.co.bakery.service;

import java.util.List;
import za.co.bakery.dbao.UserViewDAO;
import za.co.bakery.dbao.UserViewDAOImpl;
import za.co.bakery.domain.User;

/**
 *
 * @author Stuart Littles
 */
public class UserViewImpl implements UserViewService{
    private UserViewDAO userDao;

    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }

    public UserViewImpl(UserViewDAO userDao) {
        this.userDao = new UserViewDAOImpl();
    }
    
}
