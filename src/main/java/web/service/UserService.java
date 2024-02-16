package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    void save (User user);

    List<User> getAllUsers();

    User getUser(Long id);

    void deleteUser (Long id);

}
