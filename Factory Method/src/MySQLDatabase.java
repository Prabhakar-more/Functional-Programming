
// This is one type of database: MySQL
// It "implements" the Database interface.
public class MySQLDatabase implements Database {
    @Override
    public void connect() {
        // This is the actual implementation for MySQL
        System.out.println("Connecting to MySQL database...");
    }
}
