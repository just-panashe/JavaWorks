import java.io.IOException;


    class HR {
        public static void main(String[] args) throws IOException {
            Staff employee = new Staff();
            employee.initialize1();
            employee.print1();
            employee.initialize();
            employee.print();
            Person person = new Person();
            person.initialize();
            person.print();
        }
    }