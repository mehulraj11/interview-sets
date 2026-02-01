import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random rand = new Random();
        
        // Generate number in range 1 to 25
        int randomNum = rand.nextInt(25) + 1;  
        // nextInt(25) gives 0–24, so +1 shifts it to 1–25
        
        System.out.println("Random number: " + randomNum);
    }
}
