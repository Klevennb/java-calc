public class Throw {
    static void checkIfFits(int height, int width){
        if (height <= 45 && width <= 60) {
            throw new ArithmeticException("To Small: Will Fall Out");
        } else {
            System.out.println("Big Nuff"); 
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Weigh-In process!!");
        checkIfFits(100, 39); 
        System.out.println("Have a nice day.."); 
        }
    }
