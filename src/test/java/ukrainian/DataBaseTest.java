package ukrainian;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataBaseTest {

    private DataBase dataBase;
    private БазаДаних dataBase2;
    @BeforeEach
    void setUp() {
        dataBase = new DataBase();
        dataBase2 = new БазаДаних();
    }

    @Test
    void getUserData() {
        assertEquals(dataBase.getUserData(), dataBase2.отриматиДаніКористувача());
    }

    @Test
    void getStatisticMethod() {
        assertEquals(dataBase.getStatisticMethod(), dataBase2.отриматиСтатистичніДані());
    }
}