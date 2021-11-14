package ukrainian;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorizationTest {

    private DataBase dataBase;
    @BeforeEach
    void setUp() {
        dataBase = new DataBase();
    }

    @Test
    void authorize() {
        Authorization authorization2 = new Authorization();
        Авторизація authorization = new Authorization();
        assertTrue(authorization.авторизуватися(dataBase));
        assertTrue(authorization2.authorize(dataBase));
    }
}