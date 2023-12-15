import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class readList {

    public static void main(String[] args) {
        List employees = new ArrayList<>();

        try {
            File file = new File("employees.txt");

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                employees.add(line);
            }
            scanner.close();
        } catch (Exception e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        for (Object employee : employees) {
            System.out.println(employee);
        }
    }
}