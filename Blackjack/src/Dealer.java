import java.util.ArrayList;
import java.util.Stack;

public class Dealer {
    Cards cards = new Cards();
    ArrayList<String> dealerHand = new ArrayList<>();
    ArrayList<Integer> dealerHandValues = new ArrayList<>();
    int sumValue;

    public ArrayList<String> dealerDraws(Stack<String> currentDeck) {
        if (dealerHand.size() > 2) {
            return dealerHand;
        }

        dealerHand.add(currentDeck.pop());
        dealerHand.add(currentDeck.pop());

        System.out.println("Dealer draws: " + dealerHand);
        return dealerHand;
    }

    public int dealerSum() {
        
        dealerHandValues.addAll(cards.returnCardValues(dealerHand));
        
        if (dealerHandValues.isEmpty()) {
            return 0;
        }

        for (int i = 0; i < dealerHandValues.size(); i++) {
            sumValue += dealerHandValues.get(i);
        }
        
        return sumValue; 
    }

    public ArrayList<String> getDealerHand() {
        return dealerHand;
    }
}
