package me.dbogda.lesson_spring_mockito.DAO;

import me.dbogda.lesson_spring_mockito.model.User;

import java.util.List;

public interface UserDao {
    User getUserByName(String name);
    List<User> findAllUsers ();
    boolean checkUsersExist(User user);
}
