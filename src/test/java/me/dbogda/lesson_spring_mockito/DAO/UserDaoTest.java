package me.dbogda.lesson_spring_mockito.DAO;

import me.dbogda.lesson_spring_mockito.DAO.impl.UserDaoImpl;
import me.dbogda.lesson_spring_mockito.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserDaoTest {

    private final UserDaoImpl userDao = new UserDaoImpl();

    @Test
    void shouldReturnUserByNameFromList() {
        Assertions.assertEquals(new User("Ivan", "Ivanov"), userDao.getUserByName("Ivan"));
    }

    @Test
    void shouldReturnNullIfUserIsNotExist() {
        Assertions.assertNotNull(userDao.getUserByName("Petr"));
    }
}