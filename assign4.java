
package Assignment4;

public class Card implements Comparable<Card> {
    public static final String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
    public static final String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

    private int rank;
    private String suit;

    public int getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    @Override
    public int compareTo(Card other) {
        return Integer.compare(this.rank, other.rank);
    }

    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String toString() {
        return ranks[rank - 1] + " of " + suit;
    }
}
package Assignment4;

import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Deck {

    private Vector<Card> deck;

    public Deck() {
        deck = new Vector<Card>(52);
        createDeck();
    }

    public void createDeck() {
        for (int rank = 1; rank <= 13; rank++) {
            for (String suit : Card.suits) {
                Card card = new Card(rank, suit);
                deck.add(card);
            }
        }
    }

    public void displayDeck() {
        if(!deck.isEmpty()) {
            for (Card card : deck) {
                System.out.println(card.toString());
            }
        }
        else {
            System.out.println("The deck is empty. Cannot display");
        }

    }

    public void shuffleDeck() {
        if(!deck.isEmpty()) {
            Collections.shuffle(deck);
            System.out.println("Deck shuffled.");
        }
        else {
            System.out.println("The deck is empty. Cannot shuffle");
        }

    }

    public void drawCard() {
        if (!deck.isEmpty()) {
            Random random = new Random();
            int randomIndex = random.nextInt(deck.size());
            Card drawnCard = deck.remove(randomIndex);
            System.out.println("You drew: " + drawnCard.toString());
            // displayDeck();
            System.out.println("Length of vector after drawing the card: " + deck.size());
        } else {
            System.out.println("The deck is empty. Cannot draw a card.");
        }
    }


    public void emptyDeck() {
        if(!deck.isEmpty()) {
            deck.clear();
            System.out.println("Deck emptied.");
        }
        else {
            System.out.println("Deck is already emptied.");
        }

    }

    public void printCard() {
        if (!deck.isEmpty()) {
            System.out.print("Enter the index of the card to print (0-" + (deck.size() - 1) + "): ");
            Scanner input = new Scanner(System.in);
            int index = input.nextInt();
            if (index >= 0 && index < deck.size()) {
                System.out.println("Card at index " + index + ": " + deck.get(index).toString());
            } else {
                System.out.println("Invalid index.");
            }
        } else {
            System.out.println("The deck is empty. Cannot print a card.");
        }
    }

    public void sortCard() {
        if(!deck.isEmpty()) {
            Collections.sort(deck);
            System.out.println("Deck sorted based on rank.");
        }
        else {
            System.out.println("Deck is empty. Cannot sort.");
        }

    }

    public void compareCard() {
        if (deck.size() >= 2) {
            Random random = new Random();

            // Generate two random indices
            int index1 = random.nextInt(deck.size());
            int index2 = random.nextInt(deck.size());

            // Ensure the indices are different
            while (index2 == index1) {
                index2 = random.nextInt(deck.size());
            }

            // Get the two random cards
            Card card1 = deck.get(index1);
            Card card2 = deck.get(index2);

            System.out.println("Comparing two random cards:");
            System.out.println("Card 1: " + card1);
            System.out.println("Card 2: " + card2);

            int result = card1.compareTo(card2);
            if (result < 0) {
                System.out.println("Card 1 is lower in rank than Card 2.");
            } else if (result > 0) {
                System.out.println("Card 1 is higher in rank than Card 2.");
            } else {
                System.out.println("Card 1 and Card 2 have the same rank.");
            }
        } else {
            System.out.println("Not enough cards in the deck to compare.");
        }
    }

    public void sameCard() {
        if (deck.size() >= 2) {
            Random random = new Random();

            // Generate two random indices
            int index1 = random.nextInt(deck.size());
            int index2 = random.nextInt(deck.size());

            // Ensure the indices are different
            while (index2 == index1) {
                index2 = random.nextInt(deck.size());
            }

            // Get the two random cards
            Card card1 = deck.get(index1);
            Card card2 = deck.get(index2);

            System.out.println("Checking if two random cards are the same:");
            System.out.println("Card 1: " + card1);
            System.out.println("Card 2: " + card2);

            if (card1.getRank() == card2.getRank()) {
                System.out.println("Card 1 and Card 2 have the same rank.");
            } else {
                System.out.println("Card 1 and Card 2 have different ranks.");
            }
        } else {
            System.out.println("Not enough cards in the deck to check for sameness.");
        }
    }

    public void findCard(String suit, int rank) {
        if(!deck.isEmpty()) {
            for (Card card : deck) {
                if (card.getSuit().equalsIgnoreCase(suit) && card.getRank() == rank) {
                    System.out.println("Card is present");
                    return;
                }
            }
            System.out.println("Card not present");
            return;
        }
        else {
            System.out.println("Deck is empty");
        }

    }




    public void dealCard() {
        if (deck.size() >= 5) {
            System.out.println("Dealing a hand of 5 cards:");
            for (int i = 0; i < 5; i++) {
                Card dealtCard = deck.remove(0);
                System.out.println("Card " + (i + 1) + ": " + dealtCard);
            }
            //System.out.println("Deck after dealing: ");
            //displayDeck();
        } else {
            System.out.println("Not enough cards in the deck to deal a hand.");
        }
    }


    public void startMenu() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("***************************\n");
            System.out.println("1. Display the deck of cards");
            System.out.println("2. Shuffle the deck of cards");
            System.out.println("3. Draw a card from the deck");
            System.out.println("4. Empty the deck");
            System.out.println("5. Print a card from the deck");
            System.out.println("6. Compare two cards");
            System.out.println("7. Check if two cards are the same");
            System.out.println("8. Find card by rank and suit");
            System.out.println("9. Deal a hand of cards");
            System.out.println("10. Sort the deck");
            System.out.println("11. Quit");

            System.out.print("Enter your choice (1-11): ");
            int choice = input.nextInt();

            System.out.println("***************************\n");

            switch (choice) {
                case 1:
                    displayDeck();
                    break;
                case 2:
                    shuffleDeck();
                    break;
                case 3:
                    drawCard();
                    break;
                case 4:
                    emptyDeck();
                    break;
                case 5:
                    printCard();
                    break;
                case 6:
                    compareCard();
                    break;
                case 7:
                    sameCard();
                    break;
                case 8:
                    System.out.println("Enter rank : ");
                    int ran = input.nextInt();
                    System.out.print("Enter suit(Hearts, Diamonds, Clubs, Spades): ");
                    String sui = input.next();
                    findCard(sui,ran);
                    break;
                case 9:
                    dealCard();
                    break;
                case 10:
                    sortCard();
                    break;
                case 11:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}

package Assignment4;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.startMenu();
    }
}
