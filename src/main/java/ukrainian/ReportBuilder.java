package ukrainian;

public class ReportBuilder {
    private БазаДаних db;
    public ReportBuilder(БазаДаних db) {
        this.db = db;
    }

    public БазаДаних getDb() {
        return db;
    }
}
