// Main class = where program starts
public class Main {
    public static void main(String[] args) {

        // Ask the factory for a "MySQL" database
        // The factory will decide which class to create
        Database db1 = DatabaseFactory.getDatabase("MYSQL");

        // We can now call connect() method
        // Even though db1 is of type Database (interface),
        // it will actually run MySQLDatabase.connect()
        db1.connect();

        // Ask for another database type
        Database db2 = DatabaseFactory.getDatabase("POSTGRES");

        // Again, we can call connect() without worrying about the class
        db2.connect();
    }
}

