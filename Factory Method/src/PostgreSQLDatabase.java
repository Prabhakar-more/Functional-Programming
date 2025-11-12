
// This is another type of database: PostgreSQL
// It also implements the same Database interface.
public class PostgreSQLDatabase implements Database {
    @Override
    public void connect() {
        // Actual implementation for PostgreSQL
        System.out.println("Connecting to PostgreSQL database...");
    }
}

