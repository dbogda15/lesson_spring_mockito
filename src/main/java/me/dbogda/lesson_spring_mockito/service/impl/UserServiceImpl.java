package me.dbogda.lesson_spring_mockito.service.impl;

import me.dbogda.lesson_spring_mockito.DAO.UserDao;
import me.dbogda.lesson_spring_mockito.model.User;
import me.dbogda.lesson_spring_mockito.service.UserService;

public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl (UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean checkUsersExist(User user) {
       return userDao.checkUsersExist(user);
    }
}
