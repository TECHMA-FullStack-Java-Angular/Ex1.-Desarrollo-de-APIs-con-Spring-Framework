
CREATE TABLE IF NOT EXISTS games(
	id int auto_increment,
	game_name VARCHAR(100),
	game_description varchar(255),
    CONSTRAINT PK_games PRIMARY KEY (id)
	);
    
   CREATE TABLE IF NOT EXISTS users(
	id int auto_increment,
	user_name varchar(100),
	user_password varchar(20),
    user_email varchar(100),
    user_stream varchar(20),
    CONSTRAINT PK_users PRIMARY KEY (id)
	);
    

    CREATE TABLE IF NOT EXISTS parties (
    id int auto_increment,
    party_name VARCHAR(50),
    party_description varchar(255),
    game int,
    creator int,
    CONSTRAINT PK_parties PRIMARY KEY (id),
    CONSTRAINT FK_parties_games FOREIGN KEY (game) REFERENCES games(id) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT FK_parties_users FOREIGN KEY (creator) REFERENCES users(id) ON DELETE CASCADE ON UPDATE CASCADE
);

	CREATE TABLE IF NOT EXISTS participate (
    id int auto_increment,
    party_name int,
    user_name int,
    CONSTRAINT PK_participate PRIMARY KEY (id),
    CONSTRAINT FK_participate_party FOREIGN KEY (party_name) REFERENCES parties(id) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT FK_participate_users FOREIGN KEY (user_name) REFERENCES users(id) ON DELETE CASCADE ON UPDATE CASCADE
);
    
   CREATE TABLE IF NOT EXISTS  messages(
	id int auto_increment,
    user_name int,
    message varchar(255),
    message_date datetime, 
	party int,
    CONSTRAINT PK_messages PRIMARY KEY (id),
    CONSTRAINT FK_messages_users FOREIGN KEY (user_name) REFERENCES users(id) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT FK_messages_parties FOREIGN KEY (party) REFERENCES parties(id) ON DELETE CASCADE ON UPDATE CASCADE
	);
    
	

insert into games (id, game_name, game_description)values(1,'Mario Kart 8','racing game');
insert into games (id, game_name, game_description)values(2,'Minecraft','online universe game');
insert into games (id, game_name, game_description)values(3,'Grand theft auto V','shooting game');
insert into users (id, user_name, user_password, user_email, user_stream)values(1,'User1','password1', 'email@1','User1_Stream');
insert into users (id, user_name, user_password, user_email, user_stream)values(2,'User2','password2', 'email@2','User2_Stream');
insert into users (id, user_name, user_password, user_email, user_stream)values(3,'User3','password3', 'email@3','User3_Stream');
insert into parties (id, party_name, party_description, game, creator)values(1,'Party1','The best party for Minecraft', 2,3);
insert into parties (id, party_name, party_description, game, creator)values(2,'Party2','The best party for Mario Kart 8', 1,2);
insert into parties (id, party_name, party_description, game, creator)values(3,'Party3','The best party for GTA_V', 3,1);
insert into participate (id, party_name, user_name)values(1,3,1);
insert into participate (id, party_name, user_name)values(2,2,3);
insert into participate (id, party_name, user_name)values(3,1,2);
insert into messages (id, message, message_date, party, user_name)values(1,'Hello Gamers!',NOW(),1,2);
insert into messages (id, message, message_date, party, user_name)values(2,'Hello Gamers!',NOW(),2,3);
insert into messages (id, message, message_date, party, user_name)values(3,'Hello Gamers!',NOW(),3,1);


