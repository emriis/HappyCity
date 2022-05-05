-- CREATE DATABASE HappyCity;

-- USE HappyCity;

CREATE TABLE Categories( 
categoryId int PRIMARY KEY IDENTITY,
category varchar(50) NOT NULL,
color varchar(50) NOT NULL
);

CREATE TABLE CardsLocation( 
cardLocationId int PRIMARY KEY IDENTITY,
cardLocation varchar(50) NOT NULL
);

CREATE TABLE Decks (
deckId int PRIMARY KEY IDENTITY,
deckName varchar(50)
);

CREATE TABLE Buildings (
buildingId int PRIMARY KEY IDENTITY,
buildingName varchar(50) NOT NULL,
categoryId int FOREIGN KEY REFERENCES Categories(categoryId) NOT NULL,
cost int, 
people int,
hearts int,
income int,
cardLocationId int FOREIGN KEY REFERENCES CardsLocation(cardLocationId) NOT NULL,
deckId int FOREIGN KEY REFERENCES Decks(deckId) NOT NULL
);


CREATE TABLE Players( 
playerId int PRIMARY KEY IDENTITY,
playerName varchar(50) NOT NULL,
money int NOT NULL,
nextPlayer bit,
gameWinner bit
);

CREATE TABLE Games (
gameId int PRIMARY KEY IDENTITY,
bank int NOT NULL,
deckId int NOT NULL FOREIGN KEY REFERENCES Decks(deckId)
);

CREATE TABLE Players_Games (
playerId int FOREIGN KEY REFERENCES Players(playerId) NOT NULL,
gameId int FOREIGN KEY REFERENCES Games(gameId) NOT NULL
);

CREATE TABLE SpecialBuildingsRequirements (
SpecialBuildingRequirementId int PRIMARY KEY IDENTITY,
categoryId int FOREIGN KEY REFERENCES Categories(categoryId) NOT NULL,
NumberOfCards int 
);

CREATE TABLE Buildings_SpecialBuildingsRequirements (
buildingId int FOREIGN KEY REFERENCES Buildings(buildingId) NOT NULL,
SpecialBuildingRequirementId int FOREIGN KEY REFERENCES SpecialBuildingsRequirements(SpecialBuildingRequirementId) NOT NULL
);

--  DROP DATABASE HappyCity;