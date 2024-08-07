import java.util.Random;


public class HeadsOrTails{
    public static void main(String[] args) {
      
        String[] outcomes = {"Heads", "Tails"};
        int headsCount = 0;
        int tailsCount = 0;

        System.out.println("Tossing a coin...");
        for (int i = 0; i < 3; i++) {
            String result = outcomes[new Random().nextInt(2)];
            System.out.println("Round " + (i + 1) + ": " + result);
            if (result.equals("Heads")) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }
        
        System.out.println("Heads " + headsCount + ",Tails " + tailsCount);
    }
}
