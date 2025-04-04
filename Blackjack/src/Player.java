import java.util.ArrayList;
import java.util.Stack;

public class Player {
    Cards cards = new Cards();
    Dealer dealer = new Dealer();
    ArrayList<String> playerHand = new ArrayList<>();
    ArrayList<Integer> playerHandValues = new ArrayList<>();
    int sumValue;

    public ArrayList<String> playerDrawTwo(Stack<String> currentDeck) {
        if (playerHand.size() == 2) {
            System.out.println("you already have two cards");
            return playerHand;
        }

        playerHand.add(currentDeck.pop());
        playerHand.add(currentDeck.pop());

        System.out.println(playerHand);
        return playerHand;
    }

    public ArrayList<String> playerHit(Stack<String> currentDeck) {
        playerHand.add(currentDeck.pop());

        System.out.println("You draw one more, current hand is: " + playerHand);
        return playerHand;
    }

    public ArrayList<String> getPlayerHand() {
        return playerHand;
    }

    public int playerSum() {
        playerHandValues.addAll(cards.returnCardValues(playerHand));

        if (playerHandValues.isEmpty()) {
            System.out.println("Hand is empty");
            return 0;
        } 

        for (int i = 0; i < playerHandValues.size(); i++) {
            sumValue += playerHandValues.get(i);
        }

        return sumValue;
    }

    public boolean playerBlackjack() {
        if (playerSum() == 21) {
            System.out.println("Blackjack! You win!");
            return true;
        } else {
            return false;
        }
    }

    public void playerWinLose() {
        if (playerSum() > 21) {
            System.out.println("You bust!");
        }

        if (playerSum() <= 21 && playerSum() > dealer.dealerSum()) {
            System.out.println("Your hand's better! You win!");
        } else {
            System.out.println("Unlucky loss! Better luck next time!");
        }
    }
}
