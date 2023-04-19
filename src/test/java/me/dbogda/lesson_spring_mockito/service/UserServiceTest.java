package me.dbogda.lesson_spring_mockito.service;

import me.dbogda.lesson_spring_mockito.DAO.impl.UserDaoImpl;
import me.dbogda.lesson_spring_mockito.model.User;
import me.dbogda.lesson_spring_mockito.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    User existingUser = new User("Ivan", "Ivanov");
    User nonExistentUser = new User("Olga", "Kurilenko");
    @Mock
    private UserDaoImpl userDao;

    @InjectMocks
    private UserServiceImpl out;

    @Test
    void shouldCheckThatUserExist() {
        when(userDao.checkUsersExist(existingUser)).thenReturn(true);
        Assertions.assertTrue(out.checkUsersExist(existingUser));
    }

    @Test
    void shouldCheckThatUserDoesNotExist () {
        when(userDao.checkUsersExist(nonExistentUser)).thenReturn(false);
        Assertions.assertFalse(out.checkUsersExist(nonExistentUser));
    }
}