import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class alphaOrder{

    public static void main(String[] args) {
        TreeSet<String> employees = new TreeSet<>();

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

        for (String employee : employees) {
            System.out.println(employee);
        }
    }
}

