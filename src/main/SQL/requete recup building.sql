SELECT * FROM Decks 
		JOIN Buildings ON Decks.deckId = Buildings.deckId 
		LEFT JOIN Categories ON Buildings.categoryId = Categories.categoryId 
		LEFT JOIN CardsLocation on Buildings.cardLocationID = CardsLocation.cardLocationId
WHERE Decks.deckId = 4;