package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    void save (User user);

    List<User> getAllUsers();

    User getUser(Long id);

    void deleteUser (Long id);
}
