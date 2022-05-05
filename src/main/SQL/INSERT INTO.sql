USE HappyCity;

INSERT INTO CardsLocation (cardLocation)
VALUES
('Player1'),
('Player2'),
('Player3'),
('Player4'),
('Player5'),
('GenericPlayer'),
('Deck'),
('Available'),
('Discard');

INSERT INTO Categories (category,color)
VALUES
('Leisure','Orange'),
('Factory','Violet'),
('Public','Blue'),
('Shop','Yellow'),
('Home','Green'),
('Market','White'),
('Special','Pink');

INSERT INTO Decks (deckName)
VALUES
('StarterBuildings'),
('HomeBuildings'),
('Buildings'),
('SpecialBuildings');

INSERT INTO SpecialBuildingsRequirements (categoryId, NumberOfCards)
VALUES
(1,1),
(1,2),
(2,1),
(2,2),
(3,1),
(3,2),
(4,1),
(4,2),
(5,1),
(5,2);


INSERT INTO Buildings (buildingName,categoryId,cost,people,hearts,income,cardLocationId,deckId)
VALUES
-- Market
('Marché',6,0,0,0,1,6,1),

-- HomeBuilding
('Maison',5,1,1,0,0,7,2),
('Immeuble',5,3,2,0,0,7,2),
('Résidence de luxe',5,6,3,0,0,7,2),

--Buildings / Low Cost
('Maison hantée',1,1,-1,0,1,7,3),
('Usine',2,1,0,-1,1,7,3),
('Aciérie',2,1,0,-1,1,7,3),
('Ecole',3,2,0,1,0,7,3),
('Commissariat',3,2,0,1,0,7,3),
('Bibliothèque',3,2,1,0,0,7,3),
('Square',3,2,1,0,0,7,3),
('Epicerie',4,2,0,0,1,7,3),
('Magasin de chaussure',4,2,0,0,1,7,3),
('Patisserie',4,3,0,1,1,7,3),
('Fleuriste',4,3,0,1,1,7,3),
('Librairie',4,3,1,0,1,7,3),

--Buildings / Medium Cost
('Palace',1,5,0,1,2,7,3),
('Restaurant',1,5,0,1,2,7,3),
('Garage',2,5,1,0,2,7,3),
('Bureaux',2,5,1,0,2,7,3),
('Musée',3,4,0,2,0,7,3),
('Observatoire',3,4,0,2,0,7,3),
('Observatoire',3,4,2,0,0,7,3),
('Magasin de bricolage',4,4,0,0,2,7,3),
('Parfumerie',4,4,0,0,2,7,3),
('Centre commercial',4,4,0,2,1,7,3),

--Buildings / High Cost
('Spa',1,7,0,2,2,7,3),
('Casino',1,7,0,2,2,7,3),
('Station de ski',1,8,0,3,0,7,3),
('Zoo',1,8,0,3,0,7,3),
('Stade',1,9,0,3,1,7,3),
('Parc d''Attraction',1,9,0,3,1,7,3),
('Laboratoire',3,6,2,0,1,7,3),
('Université',3,6,2,0,1,7,3),
('Cabane',5,6,3,0,0,7,3),

--Special Buildings 
('Jurassic Park',7,0,1,0,2,7,4),
('Piscine à boule',7,0,0,1,2,7,4),
('Bar à chat',7,0,0,2,1,7,4),
('Jeux pour enfants',7,0,0,0,2,7,4),
('Discothèque',7,0,2,0,1,7,4),
('Supermarché pour superhéros',7,0,2,1,0,7,4),
('Parking pour dragons',7,0,2,0,2,7,4),
('Palais des bonbons',7,0,0,0,3,7,4),
('Happywood',7,0,0,2,2,7,4),
('Labyrinthe',7,0,1,1,1,7,4),
('Immeuble hanté',7,0,1,2,0,7,4),
('Ambassade extraterrestre',7,0,3,0,1,7,4),
('Bateau pirate',7,0,1,0,3,7,4),
('Chocolaterie',7,0,0,1,3,7,4),
('Ecurie de licorne',7,0,0,3,1,7,4),
('Fabrique d''arc en ciel',7,0,2,2,0,7,4),
('Piscine pour chevaux',7,0,1,3,0,7,4),	
('Ecole de magie',7,0,3,1,0,7,4);

INSERT INTO Buildings_SpecialBuildingsRequirements (buildingId,SpecialBuildingRequirementId)
VALUES
(36,4),
(37,5),
(37,1),
(38,10),
(39,5),
(39,9),
(40,5),
(40,3),
(41,9),
(41,2),
(42,5),
(42,10),
(43,5),
(43,9),
(43,1),
(44,6),
(44,9),
(45,5),
(45,9),
(45,3),
(46,10),
(46,1),
(47,5),
(47,9),
(47,1),
(47,3),
(48,5),
(48,10),
(48,1),
(49,6),
(49,9),
(49,3),
(50,6),
(50,9),
(50,3),
(51,6),
(51,9),
(51,1),
(51,3),
(52,5),
(52,9),
(52,2),
(52,3),
(53,5),
(53,10),
(53,1),
(53,3);
