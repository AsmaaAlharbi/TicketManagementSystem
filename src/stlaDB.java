
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class stlaDB {

    public static void main(String[] args) {
        String ConnectionURL = "jdbc:mysql://localhost:3306";
        String username = "root";
        String password = "Asmaa123";
        String filePath = "EventList.txt";

        try {
            // Create connection
            Connection con = DriverManager.getConnection(ConnectionURL, username, password);

            // Create statement object
            Statement st = con.createStatement();

            // Create the 'STLAWorld' database
            st.executeUpdate("CREATE DATABASE " + "STLAWorld");
            System.out.println("Database created successfully");

            // Select the 'STLAWorld' database
            st.execute("USE STLAWorld");

            // Create the 'ticket' table
            String createTableSQL = "CREATE TABLE event ("
                    + "id INT PRIMARY KEY, "
                    + "name VARCHAR(255), "
                    + "price DECIMAL(10, 2))";
            st.executeUpdate(createTableSQL);
            System.out.println("Table 'event' created successfully");

            // Read data from EventList.txt file and insert it into the table
            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(", ");
                    if (values.length == 3) {
                        int id = Integer.parseInt(values[0].trim());
                        String name = values[1].trim();
                        double price = Double.parseDouble(values[2].trim());

                        // Insert data into ticket table
                        String insertSQL = "INSERT INTO event (id, name, price) VALUES ("
                                + id + ", '" + name + "', " + price + ")";
                        st.executeUpdate(insertSQL);
                    }
                }
            } catch (IOException e) {
                System.out.println("Error reading from file");
                e.printStackTrace();
            }

            System.out.println("Data inserted successfully");

            // Close connection
            con.close();
        } catch (SQLException s) {
            System.out.println("SQL statement is not executed!");
            s.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
