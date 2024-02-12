package Fusi.Green2.service;

import Fusi.Green2.User.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);

    public List<User> getUssers();
}
