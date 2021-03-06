# --- !Ups

INSERT INTO user (username, role, email, password) VALUES ('kilian', 'admin', 'kiliantennyson@hotmail.com', 'admin');
INSERT INTO user (username, role, email, password) VALUES ('stephen', 'user', 'stephenW@hotmail.com', 'password');

INSERT INTO basket VALUES(1, 'kilian');
INSERT INTO basket VALUES(2, 'stephen');

INSERT INTO GENRE VALUES(1, 'Indie');
INSERT INTO GENRE VALUES(2, 'Action');
INSERT INTO GENRE VALUES(3, 'Casual');
INSERT INTO GENRE VALUES(5, 'Simulation');
INSERT INTO GENRE VALUES(6, 'RPG');
INSERT INTO GENRE VALUES(7, 'Sports');
INSERT INTO GENRE VALUES(8, 'Racing');
INSERT INTO GENRE VALUES(9, 'Multiplayer');
INSERT INTO GENRE VALUES(10, 'Singpleplayer');
INSERT INTO GENRE VALUES(11, 'Puzzle');
INSERT INTO GENRE VALUES(12, 'Horror');
INSERT INTO GENRE VALUES(13, 'Sci-Fi');
INSERT INTO GENRE VALUES(14, 'Adventure');
INSERT INTO GENRE VALUES(15, 'Shooter');
INSERT INTO GENRE VALUES(16, 'Fantasy');
INSERT INTO GENRE VALUES(17, 'FPS');
INSERT INTO GENRE VALUES(18, 'Survival');
INSERT INTO GENRE VALUES(19, 'Platformer');
INSERT INTO GENRE VALUES(20, 'Stealth');
INSERT INTO GENRE VALUES(21, 'Crime');
INSERT INTO GENRE VALUES(22, 'Co-op');
INSERT INTO GENRE VALUES(23, 'Survival Horror');
INSERT INTO GENRE VALUES(24, 'Strategy');
INSERT INTO GENRE VALUES(25, 'Classic');




INSERT INTO Review VALUES(1,'Max Payne','kilian', 'A classic thats worth revisiting.',  'review', 7,2001, '2018-03-12');

INSERT INTO Review VALUES(2,'Dead By Daylight', 'kilian', 'A fantastic game with some frustrating issues.', 'Dead by Daylight is a asymmetric horror game that is often horrifying and fun but at times extremely frustrating. 
Each game pits 1 killer against four survivors, all controlled by players online. The killer uses various methods to hunt down survivors before they can power five of eight generators which will power two exits throughout a variety of maps. 
The gameplay is brilliant and thrilling... when it works. The survivors must power 5 generators in order to escape, this is a slow task with intermittent skillchecks throughout this process. If you fail a skillcheck, the killer will be notified and your position is revealed. If found by a killer, a chase will ensue. The killer is faster and will gradually catch up to a survivor. To impede the killer, a survivor can drop pallets, vault through windows or hide in lockers giving an opportunity to confuse and hopefully lose the killer. The killer can hit survivors sending them into an injured state, a further hit will incapacitate them. A killer can hook a downed survivor, if the survivor remains hooked for a period of time without being rescued, they are sacrificed and have lost the game. 
There is tonnes of variety to the game, items that allow you heal or flashlights to temporarily blind the killer, different perks for both killers and survivors and a good selection of maps that all feel unique. These different factors make every game feel different but all this variety and asymmetrical gameplay comes at a price however. Killers camping hooks & players disconnecting (often by choice) can instantly ruin games for survivors but rather than punish this type of behavior, devs have made the game much easier for survivors. This often means that even for the best of killers it can be nearly impossible to win against a team of well-organised killers. Experienced players will often derank in order to play against newer killers and bully them.
Graphically, the game is actually pretty nice. The maps are quite varied and despite having common features necessary for gameplay i.e lockers, generators, hooked etc. each actually plays differently and requires a change of tactics at times. There is even DLC for some killers such as Jigsaw, Freddy Krueger and more.  
There are occasionally minor bugs and glitches. Hair can often hilariously flip all over the players head, walls can spawn invisible but nothing really game-breaking. Really irritating disconnects can happen meaning you can lose progress and important offerings you wanted to bring to the game. Not often, but I did experience hackers in games, were survivors would run at ridiculous speeds making it near impossible to catch them. Overall, the game, when played right this game is incredibly tense and addictive. The huge amount of variety in gameplay/maps/characters leads to tonnes of replay value as you grind to get different perks and unlocks for your characters. The experience is often hindered by a toxic community and bad gameplay that is often rewarded rather than punished but the right game is intense and often horrifying.', 8,2016, '2018-03-12');

INSERT INTO Review VALUES(3,'Orwell', 'kilian' , 'A very interesting concept with some surreal gameplay', 'review', 7,2016, '2018-03-12');

INSERT INTO Review VALUES(4,'Mafia III', 'kilian' ,'After a bad launch and now revisiting, was this game worth all the hate?', 'review', 4, 2016, '2018-03-12');

INSERT INTO Review VALUES(5,'Maize', 'kilian','Some impressive art held back by cringey humour and banal gamepplay', 'review', 3,2016,'2018-03-12');

INSERT INTO Review VALUES(6,'Prey', 'kilian' , 'Great story with some incredible mechanics', 'review', 8,2006,'2018-03-12');

INSERT INTO Review VALUES(7,'Killing Floor 2','kilian' ,'While it is quite fun, it lacks the long term engagement that other shooters benifit from.', 'review', 6,2006,'2018-03-12');


INSERT INTO PRODUCT VALUES(1, 'Flux Gaming Mug', 'A great mug for when you need to wake up after a long night of gaming', 32, 10.00);
INSERT INTO PRODUCT VALUES(2, 'Flux Gaming Shirt', 'A great way to show your friends about your favorite site!', 20, 12.00);
INSERT INTO PRODUCT VALUES(3, 'Flux Gaming Poster', 'A great poster to hang in your moms basement', 30, 5.00);
INSERT INTO PRODUCT VALUES(4, 'Flux Gaming Badge', 'A badge to stick on your bag, on a tshirt or wherever really!', 20, 3.00);

INSERT INTO GENRE_REVIEW values (2,1);
INSERT INTO GENRE_REVIEW values (10,1);
INSERT INTO GENRE_REVIEW values (15,1);
INSERT INTO GENRE_REVIEW values (21,1);
INSERT INTO GENRE_REVIEW values (25,1);

INSERT INTO GENRE_REVIEW values (1,2);
INSERT INTO GENRE_REVIEW values (9,2);
INSERT INTO GENRE_REVIEW values (12,2);
INSERT INTO GENRE_REVIEW values (18,2);
INSERT INTO GENRE_REVIEW values (20,2);
INSERT INTO GENRE_REVIEW values (22,2);

INSERT INTO GENRE_REVIEW values (1,3);
INSERT INTO GENRE_REVIEW values (5,3);
INSERT INTO GENRE_REVIEW values (10,3);
INSERT INTO GENRE_REVIEW values (11,3);
INSERT INTO GENRE_REVIEW values (21,3);

INSERT INTO GENRE_REVIEW values (2,4);
INSERT INTO GENRE_REVIEW values (10,4);
INSERT INTO GENRE_REVIEW values (14,4);
INSERT INTO GENRE_REVIEW values (15,4);
INSERT INTO GENRE_REVIEW values (21,4);

INSERT INTO GENRE_REVIEW values (1,5);
INSERT INTO GENRE_REVIEW values (10,5);
INSERT INTO GENRE_REVIEW values (11,5);
INSERT INTO GENRE_REVIEW values (14,5);

INSERT INTO GENRE_REVIEW values (2,6);
INSERT INTO GENRE_REVIEW values (10,6);
INSERT INTO GENRE_REVIEW values (14,6);
INSERT INTO GENRE_REVIEW values (15,6);
INSERT INTO GENRE_REVIEW values (13,6);
INSERT INTO GENRE_REVIEW values (17,6);
INSERT INTO GENRE_REVIEW values (25,6);

INSERT INTO GENRE_REVIEW values (1,7);
INSERT INTO GENRE_REVIEW values (2,7);
INSERT INTO GENRE_REVIEW values (9,7);
INSERT INTO GENRE_REVIEW values (12,7);
INSERT INTO GENRE_REVIEW values (15,7);
INSERT INTO GENRE_REVIEW values (18,7);
INSERT INTO GENRE_REVIEW values (22,7);


-- INSERT INTO SHOP_ORDER VALUES(17, '2017-04-22 09:24:35.732', 'kilian');
-- INSERT INTO ORDER_ITEM VALUES(14, null, 4, 17, 12, 23.00);

-- INSERT INTO SHOP_ORDER VALUES(18, '2017-08-22 09:24:35.732', 'kilian');
-- INSERT INTO ORDER_ITEM VALUES(15, null, 2, 18, 13, 23.00);
-- INSERT INTO ORDER_ITEM VALUES(16, null, 3, 18, 15, 23.00);

-- INSERT INTO SHOP_ORDER VALUES(19, '2016-08-22 09:24:35.732', 'kilian');
-- INSERT INTO ORDER_ITEM VALUES(17, null, 1, 19, 4, 23.00);
-- INSERT INTO ORDER_ITEM VALUES(18, null, 4, 19, 19, 23.00);

INSERT INTO SHOP_ORDER VALUES(20, '2015-08-22 09:24:35.732', 'kilian');
INSERT INTO ORDER_ITEM VALUES(19, null, 1, 20, 9, 23.00);
INSERT INTO ORDER_ITEM VALUES(20, null, 4, 20, 25, 23.00);
INSERT INTO ORDER_ITEM VALUES(21, null, 3, 20, 4, 23.00);

