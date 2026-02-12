package banking.application;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataStorage {

    private static final String FILE_PATH = "users.txt";

    public static void saveUsers(List<User> users) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (User user : users) {
                writer.write(user.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving users.");
        }
    }

    public static List<User> loadUsers() {
        List<User> users = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                users.add(User.fromString(line));
            }
        } catch (FileNotFoundException e) {
            System.out.println("No user data found. Creating new file.");
        } catch (IOException e) {
            System.out.println("Error reading user data.");
        }
        return users;
    }
}
