package ukrainian;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReportBuilderTest {

    private БазаДаних dataBase;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        dataBase = new DataBase();
    }

    @Test
    void test() {
        ReportBuilder rb = new ReportBuilder(dataBase);
        assertTrue(rb.getDb().equals(dataBase));
    }
}