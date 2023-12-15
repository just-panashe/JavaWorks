import java.io.File;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.io.File;
import java.util.ArrayList;


    public class noRepetition {

        public static void main(String[] args) {
            Set<String> employees = new HashSet<>();

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

