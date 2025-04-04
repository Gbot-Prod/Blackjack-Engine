
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Stack;

public class Cards {
    public Stack<String> deck = new Stack<>();
    public HashMap<String, Integer> deckValues = new HashMap<>();

    public Stack<String> fillDeck() {
        HeartSuit heartsSuit = new HeartSuit();
        ClubSuit clubsSuit = new ClubSuit();
        SpadeSuit spadesSuit = new SpadeSuit();
        DiamondSuit diamondsSuit = new DiamondSuit();

        ArrayList<String> clubs = new ArrayList<>(clubsSuit.fillSuit());
        ArrayList<String> spades = new ArrayList<>(spadesSuit.fillSuit());
        ArrayList<String> hearts = new ArrayList<>(heartsSuit.fillSuit());
        ArrayList<String> diamonds = new ArrayList<>(diamondsSuit.fillSuit());
        HashMap<String, Integer> clubValues = new HashMap<>(clubsSuit.initializeCardValues());
        HashMap<String, Integer> spadeValues = new HashMap<>(spadesSuit.initializeCardValues());
        HashMap<String, Integer> heartValues = new HashMap<>(heartsSuit.initializeCardValues());
        HashMap<String, Integer> diamondValues = new HashMap<>(diamondsSuit.initializeCardValues());

        deck.addAll(clubs);
        deck.addAll(spades);
        deck.addAll(hearts);
        deck.addAll(diamonds);
        deckValues.putAll(clubValues);
        deckValues.putAll(spadeValues);
        deckValues.putAll(heartValues);
        deckValues.putAll(diamondValues);

        System.out.println("New deck initialized");
        return deck;
    }

    public void shuffleDeck() {
        if (!deck.isEmpty()) {
            Collections.shuffle(deck);
            System.out.println("Deck has been shuffled");
        } else {
            System.out.println("Deck is empty");
        }
    }

    public void showDeck() {
        if (deck.isEmpty()) {
            System.out.println("Deck is empty");
            return;
        } 
        System.out.println(deck);
    }

    public Stack<String> returnDeck() {
        return deck;
    }

    public ArrayList<Integer> returnCardValues(ArrayList<String> cards) {
        ArrayList<Integer> inputCardValues = new ArrayList<>();
        
        if (deckValues.isEmpty()) {
            System.out.println("Deck is empty.");
            return inputCardValues;
        }

        for (int i = 0; i < cards.size(); i++) {
            inputCardValues.add(deckValues.get(cards.get(i)));
        }

        System.out.println(inputCardValues);
        return inputCardValues;
    }

    public int returnTotalHandValue (ArrayList<String> cards) {
        int totalHandValue = 0;

        if (deckValues.isEmpty()) {
            System.out.println("Deck is empty.");
            return 0;
        }

        for (int i = 0; i < cards.size(); i++) {
            totalHandValue += deckValues.get(cards.get(i));
        }

        System.out.println(totalHandValue);
        return totalHandValue;
    }


    class HeartSuit {
        ArrayList<String> heartsSuit = new ArrayList<>();
        HashMap<String, Integer> cardValue = new HashMap<>();

        public ArrayList<String> fillSuit() {
            heartsSuit.add("Ace of hearts");
            heartsSuit.add("2 of hearts");
            heartsSuit.add("3 of hearts");
            heartsSuit.add("4 of hearts");
            heartsSuit.add("5 of hearts");
            heartsSuit.add("6 of hearts");
            heartsSuit.add("7 of hearts");
            heartsSuit.add("8 of hearts");
            heartsSuit.add("9 of hearts");
            heartsSuit.add("10 of hearts");
            heartsSuit.add("Jack of hearts");
            heartsSuit.add("Queen of hearts");
            heartsSuit.add("King of hearts");

            return heartsSuit;
        }

        public HashMap<String, Integer> initializeCardValues() {
            cardValue.put("Ace of hearts", 1);
            cardValue.put("2 of hearts", 2);
            cardValue.put("3 of hearts", 3);
            cardValue.put("4 of hearts", 4);
            cardValue.put("5 of hearts", 5);
            cardValue.put("6 of hearts", 6);
            cardValue.put("7 of hearts", 7);
            cardValue.put("8 of hearts", 8);
            cardValue.put("9 of hearts", 9);
            cardValue.put("10 of hearts", 10);
            cardValue.put("Jack of hearts", 10);
            cardValue.put("Queen of hearts", 10);
            cardValue.put("King of hearts", 10);

            return cardValue;
        }
    }
    class ClubSuit {
        ArrayList<String> clubsSuit = new ArrayList<>();
        HashMap<String, Integer> cardValue = new HashMap<>();

        public ArrayList<String> fillSuit() {
            clubsSuit.add("Ace of clubs");
            clubsSuit.add("2 of clubs");
            clubsSuit.add("3 of clubs");
            clubsSuit.add("4 of clubs");
            clubsSuit.add("5 of clubs");
            clubsSuit.add("6 of clubs");
            clubsSuit.add("7 of clubs");
            clubsSuit.add("8 of clubs");
            clubsSuit.add("9 of clubs");
            clubsSuit.add("10 of clubs");
            clubsSuit.add("Jack of clubs");
            clubsSuit.add("Queen of clubs");
            clubsSuit.add("King of clubs");

            return clubsSuit;
        }

        public HashMap<String, Integer> initializeCardValues() {
            cardValue.put("Ace of clubs", 1);
            cardValue.put("2 of clubs", 2);
            cardValue.put("3 of clubs", 3);
            cardValue.put("4 of clubs", 4);
            cardValue.put("5 of clubs", 5);
            cardValue.put("6 of clubs", 6);
            cardValue.put("7 of clubs", 7);
            cardValue.put("8 of clubs", 8);
            cardValue.put("9 of clubs", 9);
            cardValue.put("10 of clubs", 10);
            cardValue.put("Jack of clubs", 10);
            cardValue.put("Queen of clubs", 10);
            cardValue.put("King of clubs", 10);

            return cardValue;
        }
    }
    class SpadeSuit {
        ArrayList<String> spadesSuit = new ArrayList<>();
        HashMap<String, Integer> cardValue = new HashMap<>();

        public ArrayList<String> fillSuit() {
            spadesSuit.add("Ace of spades");
            spadesSuit.add("2 of spades");
            spadesSuit.add("3 of spades");
            spadesSuit.add("4 of spades");
            spadesSuit.add("5 of spades");
            spadesSuit.add("6 of spades");
            spadesSuit.add("7 of spades");
            spadesSuit.add("8 of spades");
            spadesSuit.add("9 of spades");
            spadesSuit.add("10 of spades");
            spadesSuit.add("Jack of spades");
            spadesSuit.add("Queen of spades");
            spadesSuit.add("King of spades");

            return spadesSuit;
        }

        public HashMap<String, Integer> initializeCardValues() {
            cardValue.put("Ace of spades", 1);
            cardValue.put("2 of spades", 2);
            cardValue.put("3 of spades", 3);
            cardValue.put("4 of spades", 4);
            cardValue.put("5 of spades", 5);
            cardValue.put("6 of spades", 6);
            cardValue.put("7 of spades", 7);
            cardValue.put("8 of spades", 8);
            cardValue.put("9 of spades", 9);
            cardValue.put("10 of spades", 10);
            cardValue.put("Jack of spades", 10);
            cardValue.put("Queen of spades", 10);
            cardValue.put("King of spades", 10);

            return cardValue;
        }
    }
    class DiamondSuit {
        ArrayList<String> diamondsSuit = new ArrayList<>();
        HashMap<String, Integer> cardValue = new HashMap<>();

        public ArrayList<String> fillSuit() {
            diamondsSuit.add("Ace of diamonds");
            diamondsSuit.add("2 of diamonds");
            diamondsSuit.add("3 of diamonds");
            diamondsSuit.add("4 of diamonds");
            diamondsSuit.add("5 of diamonds");
            diamondsSuit.add("6 of diamonds");
            diamondsSuit.add("7 of diamonds");
            diamondsSuit.add("8 of diamonds");
            diamondsSuit.add("9 of diamonds");
            diamondsSuit.add("10 of diamonds");
            diamondsSuit.add("Jack of diamonds");
            diamondsSuit.add("Queen of diamonds");
            diamondsSuit.add("King of diamonds");

            return diamondsSuit;
        }

        public HashMap<String, Integer> initializeCardValues() {
            cardValue.put("Ace of diamonds", 1);
            cardValue.put("2 of diamonds", 2);
            cardValue.put("3 of diamonds", 3);
            cardValue.put("4 of diamonds", 4);
            cardValue.put("5 of diamonds", 5);
            cardValue.put("6 of diamonds", 6);
            cardValue.put("7 of diamonds", 7);
            cardValue.put("8 of diamonds", 8);
            cardValue.put("9 of diamonds", 9);
            cardValue.put("10 of diamonds", 10);
            cardValue.put("Jack of diamonds", 10);
            cardValue.put("Queen of diamonds", 10);
            cardValue.put("King of diamonds", 10);

            return cardValue;
        }
    }
}