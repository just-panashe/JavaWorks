public class UseFinally {
    public static void generateException(int what) {
        int t;
        int numbers[] = new int[2];
        System.out.println("Input value " + what);
        try{
            switch(what){
                case 0:
                    t = 10/what;
                    break;
                case 1:
                    numbers[4] = 4;
                    break;
                case 2:
                    return;
            }
        }
        catch(ArithmeticException e){
            System.out.println("You cannot divide by zero");
            return;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("There is no such index in the array");
        }
        finally {
            System.out.println("This code will always be used");
        }
    }
}
