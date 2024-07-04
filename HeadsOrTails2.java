import java.util.Scanner;

public class HeadsOrTails2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Who are you? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "！");
    }
}
