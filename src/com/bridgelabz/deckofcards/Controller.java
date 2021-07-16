package com.bridgelabz.deckofcards;

public class Controller {
	
public static String [] name = new String[4];
	
	public static void main(String[] args) 
	{
		System.out.println(name.length);
		for (int playerNumber = 0; name.length > playerNumber; playerNumber++) 
		{
			System.out.print("Enter Player "+(playerNumber+1)+"'s Name: ");
			name[playerNumber] = Utility.inputString();
			
		}
		
		for (int playerNumber = 0; name.length > playerNumber; playerNumber++) 
		{
			DeckOfCards.alotShuffledCards(playerNumber+1);
			System.out.print(name[playerNumber]+"'s Cards: ");
			DeckOfCards.printPlayersCards(playerNumber+1);
		}
		
		
	}

}
