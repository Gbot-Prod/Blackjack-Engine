import java.util.Scanner;


public class App {   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cards cards = new Cards();
        Player player = new Player();
        Dealer dealer = new Dealer();
        Bank bank = new Bank();

        System.out.println("Wanna play Blackjack?");
        String gameStartChoice = scanner.nextLine();

        if (gameStartChoice.toUpperCase().equals("YES")) {
            while (true) { 
                cards.fillDeck();
                cards.shuffleDeck();
                bank.showBank();
                bank.betAmount();

                dealer.dealerDraws(cards.returnDeck());
                cards.returnCardValues(dealer.getDealerHand());
                player.playerDrawTwo(cards.returnDeck());
                cards.returnCardValues(player.getPlayerHand());

                System.out.println("Will you Hit?");
                String hitChoice = scanner.nextLine();

                if (!hitChoice.toUpperCase().equals("YES")) {
                    int playerSum = cards.returnTotalHandValue(player.getPlayerHand());
                    int dealerSum = cards.returnTotalHandValue(dealer.getDealerHand());
            
                    if (playerSum > dealerSum) {
                        System.out.println("you win!");
                    } else {
                        System.out.println("you lose!");
                    }
                }
            }
        } 



        scanner.close();
    }
}
 