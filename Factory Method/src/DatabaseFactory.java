
// Factory class is responsible for "deciding" which object to create.
// It hides the logic of object creation from the user (Main class).
public class DatabaseFactory {

    // A static method that returns an object of type Database
    public static Database getDatabase(String type) {

        // If user asks for MySQL, create and return MySQLDatabase object
        if (type.equalsIgnoreCase("MYSQL")) {
            return new MySQLDatabase();

        // If user asks for PostgreSQL, create and return PostgreSQLDatabase object
        } else if (type.equalsIgnoreCase("POSTGRES")) {
            return new PostgreSQLDatabase();
        }

        // If type is unknown, throw an error
        throw new IllegalArgumentException("Unknown database type: " + type);
    }
}
