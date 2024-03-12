DROP TABLE Commande;
create table Commande(
    id int not null primary key AUTO_INCREMENT,
    nom varchar(30),
    prix float,
    localisation varchar(30),
    dateAchat date
);
DROP Table Produit;
create table Produit(
    id_pr int  primary key not null AUTO_INCREMENT,
    nom_produit varchar(30),
    prix_produit float,
    image_ varchar(200)
    
);

insert into Produit(nom_produit,image_,prix_produit) values
("couscous","/Users/dibe/eclipse-workspace/Restaurant/src/main/webapp/Images/couscouse.jpeg",100.00),
("tajine","/Users/dibe/eclipse-workspace/Restaurant/src/main/webapp/Images/tajine.jpeg", 150.00),
("tajine viande","/Users/dibe/eclipse-workspace/Restaurant/src/main/webapp/Images/tajine2.jpeg", 60.00),
("soupe","/Users/dibe/eclipse-workspace/Restaurant/src/main/webapp/Images/soupe.jpeg", 30.0),
("marmiton","/Users/dibe/eclipse-workspace/Restaurant/src/main/webapp/Images/marmiton.jpeg", 50.0),
( "fashioncono","/Users/dibe/eclipse-workspace/Restaurant/src/main/webapp/Images/fashioncono.jpeg", 45.0);





