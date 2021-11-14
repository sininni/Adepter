package ukrainian;

public class DataBase extends БазаДаних{
    public String getUserData() {
        return отриматиДаніКористувача();
    }

    public String getStatisticMethod() {
        return отриматиСтатистичніДані();
    }
}
