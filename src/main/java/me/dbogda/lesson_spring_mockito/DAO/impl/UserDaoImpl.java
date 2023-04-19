package me.dbogda.lesson_spring_mockito.DAO.impl;

import me.dbogda.lesson_spring_mockito.DAO.UserDao;
import me.dbogda.lesson_spring_mockito.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    private final List<User> userList;

    public UserDaoImpl () {
        this.userList = new ArrayList<>();
        userList.add(new User("Ivan", "Ivanov"));
        userList.add(new User("Petr", "Petrov"));
        userList.add(new User("Maria", "Ivanova"));
    }

    @Override
    public User getUserByName(String name) {
        for (User user : userList) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> findAllUsers () {
        return userList;
    }

    @Override
    public boolean checkUsersExist(User user) {
        return userList.contains(user);
    }
}
