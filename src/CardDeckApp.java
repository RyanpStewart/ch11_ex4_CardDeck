public class CardDeckApp {

	public static void main(String[] args) {
		System.out.println("DECK");
		String[] deck = getDeck();
		displayCards(deck);

		System.out.println("SHUFFLED DECK");
		shuffleDeck(deck);
		displayCards(deck);

		int count = 2;
		System.out.println("HAND OF " + count + " CARDS");
		String[] hand = dealCards(deck, count);
		displayCards(hand);
	}

	private static String[] getDeck() {
		String[] deck = new String[52];
		// add code that creates deck here

		String[] suits = { "Spades", "Hearts", "Clubs", "Diamonds" };
		String[] ranks = { "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
				"Queen", "King" };

		int index = 0;

		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < ranks.length; j++) {
				String card = ranks[j] + " of " + suits[i];
				deck[index] = card;
				index++;
			}
		}

		// SECOND WAY OF CODING SAME PROBLEM

//        int i = 0;
//        
//        for (String suit : suits) {
//        	for (String rank : ranks) {
//        		deck[i] = rank + " of " + suit;
//        		i++;
//        	}
//        }

		return deck;
	}

	private static void displayCards(String[] cards) {
		// add code that displays cards here

		for (String card : cards ) {
			System.out.print("|" + card);
		}
		System.out.println("|");
		
		
		
		
	}

	private static void shuffleDeck(String[] deck) {

		// add code that shuffles the deck here
		for (String card : deck) {
			int randomIndex = (int) (Math.random() * deck.length - 1);
			
			String tempCard = deck[randomIndex];
			deck[randomIndex] = card;
			card = tempCard;
		}
	
	}

	private static String[] dealCards(String[] deck, int count) {
		String[] hand = new String[count];
		hand[0] = deck[0];
		hand[1] = deck[1];
		return hand;
	}
}