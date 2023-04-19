package me.dbogda.lesson_spring_mockito.service;

import me.dbogda.lesson_spring_mockito.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    boolean checkUsersExist(User user);
}
