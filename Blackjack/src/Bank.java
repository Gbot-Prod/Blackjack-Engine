import java.util.Scanner;

public class Bank {
    Scanner sc = new Scanner(System.in);

    int playerBank = 2500;
    
    public int betAmount() {
        System.out.println("How much do you want to bet?");
        int playerBet = sc.nextInt();
        playerBank = playerBank - playerBet;
        return playerBet;
    }

    public void showBank() {
        System.out.println("Current player bank amount: " + playerBank);
    }
}
