import java.util.Scanner;
import java.util.Random;

public class TextAdventure {
    int hp;
    String weapon;
    int weaponDMG;
    String armor;
    Scanner myScanner = new Scanner(System.in);
    String playerName;
    int money;
    Random randomGenerator = new Random();
    int luck;
    int ogreHP;
    int goblinHP;
    int trollHP;
    int goblinLordHP;
    String vrb;

    public TextAdventure() {

    }

    public void startGame() {
        hp = 100;
        weapon = "fists";
        weaponDMG = 10;
        money = 30;
        armor = "none";
        luck = 5;
        vrb = "swing";

        System.out.println();
        System.out.println("----------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Hello and welcome to my text adventure game! Press 'enter' to begin!");
        String enter = myScanner.nextLine();
        if (enter == "") {
            System.out.print("Please enter your adventurer's name: ");
            playerName = myScanner.nextLine();
            System.out.println();
            System.out.println("Hello " + playerName + "! Ready for an adventure? Let's get started!");
            System.out.println("Your health is " + hp + ", your starting weapon are your " + weapon + ", your luck is " + luck + "/10, and you have " + money + " crowns (the local currency)!");
            System.out.println();
            System.out.println("----------------------------------------------------------------------------");

            startingVillage();
        }
    }

    public void startingVillage() {
        System.out.println();
        System.out.println("You awake in the quant village of Incipiam to the sound of people gathering in the town square. You hurridly rush out to do the same.");
        System.out.println("As you approach the crowded square the Duke of Incipiam begins to make a speech:");
        System.out.println();
        System.out.println("\"To the people of Incipiam I send out a cry for help. As we were sleeping, a band of goblin raiders belonging to the Clan of Malum infiltrated our village and captured the princess, my only daughter. So I ask that among these people before me a champion may present himself to rise to the occasion and travel through the Wasteland of Periculum to Castle Diaboli where the evil Clan of Malum resides and rescue my daughter.\"");
        System.out.println();
        System.out.println("There is silence among the crowd. Do you volunteer to take the treacherous journey to save the princess?");
        System.out.println();
        System.out.println("1) Yes");
        System.out.println("2) No");
        int a = myScanner.nextInt();

        if (a == 1) {
            System.out.println();
            System.out.println("\"Fantastic!\" Says the duke, \"" + playerName + " will be our champion! You will be rewarded handsomely on your return with the princess! Now go, the journey ahead is long and dangerous!\"");
            System.out.println();
            System.out.println("Decide which way to take your journey first. Your options are to go: ");
            System.out.println();
            System.out.println("1) Northwest towards the Caelum Mountains and further on towards Castle Bonum to ask for help from the Noble King that rules there.");
            System.out.println("2) Northeast towards the Plains of Fertility and further on towards the Sea of Treachery which can be used to quickly reach Castle Diaboli.");
            System.out.println("3) Southwest towards Mount Tormentum and further on towards Castle Bonum to ask for help from the Noble King that rules there.");
            System.out.println("4) Southeast towards Syreni Lake and further on towards Castle Diaboli.");
            int b = myScanner.nextInt();
            
            if (b == 1) {
                System.out.println();
                System.out.println("----------------------------------------------------------------------------");
                splitOne();
            } else if (b == 2) {
                System.out.println();
                System.out.println("----------------------------------------------------------------------------");
                splitTwo();
            } else if (b == 3) {
                System.out.println();
                System.out.println("----------------------------------------------------------------------------");
                splitThree();
            } else if (b == 4) {
                System.out.println();
                System.out.println("----------------------------------------------------------------------------");
                splitFour();
            }

        } else if (a == 2) {
            System.out.println();
            System.out.println("You have chosen not to go on this journey.");
            System.out.println();
            gameOver();
        }
    }

    public void splitOne() {
        System.out.println();
        System.out.println("As you begin your journey Northwest towards the Caelum Mountains you see a crippled begger at the fork of the path. The begger asks: \"Do you have any spare crowns? I'm trying to make it to Incipiam for shelter, but I was robbed and injured and don't have anything!\" Do you wish to give some crowns to the begger?");
        System.out.println();
        System.out.println("1) Yes, give the begger 10 crowns.");
        System.out.println("2) Yes, give the begger 30 crowns.");
        System.out.println("3) No, give the begger nothing and continue on your journey.");
        int a = myScanner.nextInt();

        if (a == 1) {
            System.out.println();
            money -= 10;
            System.out.println("You give the begger 10 crowns, leaving you with " + money + " crowns left for the rest of your journey. The begger is grateful. \"Thank you very much! Although it's not much, I would like to attempt to repay you with some words of warning: I see that you are taking the Northwestern path towards the Caelum Mountains. See to it that you avoid that mountain range at all costs! A dangerous band of thieves lives in those mountains and are the ones who made me like this! Please, take the long way around and go North, I have heard there is a camp of elves there that are very kind to travelers.\" Now knowing this you approach the fork of the path.");
            System.out.println();
            System.out.println("1) Take the short path Northwest towards the Caelum Mountains.");
            System.out.println("2) Take the long path North towards the Elven camp and around the Caelum Mountains.");
            int b = myScanner.nextInt();

            if (b == 1) {
                System.out.println();
                System.out.println("----------------------------------------------------------------------------");
                caelumMountains();
            } else if (b == 2) {
                System.out.println();
                System.out.println("----------------------------------------------------------------------------");
                elvenCampTwo();
            }
        } else if (a == 2) {
            System.out.println();
            money -= 30;
            System.out.println("You give the begger 30 crowns, leaving you with no crowns left for the rest of your journey. The begger is very grateful.");
            System.out.println();
            System.out.println("\"Thank you very very much! My friend, let me repay you with a word of caution and a small tale of riches. Firstly, do not go Northwest towards the Caelum Mountains! There is a large group of thieves there who broke my legs and robbed me of all my goods and crowns! Go North and travel around the mountain range, I have heard that there is an Elven camp there which is very friendly to travelers. Now, the tale of treasure: Along the path North there is a faded trail just off the main path that will lead you to a gigantic tree that rises above all the others. Digging at this spot will reveal some sort of treasure for you to find, so the tale goes.\"");
            System.out.println();
            System.out.println("After listening to the begger you thank him and decide which path to take.");
            System.out.println();
            System.out.println("1) Take the short path Northwest towards the Caelum Mountains.");
            System.out.println("2) Take the long path North towards the Elven camp and around the Caelum Mountains.");
            int c = myScanner.nextInt();

            if (c == 1) {
                System.out.println();
                System.out.println("----------------------------------------------------------------------------");
                caelumMountains();
            } else if (c == 2) {
                System.out.println();
                System.out.println("----------------------------------------------------------------------------");
                elvenTreasurePath();
            }
        } else if (a == 3) {
            System.out.println();
            System.out.println("The begger is not surprised as you walk by without acknowledging him. You come to the fork in the road and have to decide which way to go.");
            System.out.println();
            System.out.println("1) Take the path Northwest towards the Caelum Mountains.");
            System.out.println("2) Take the path North towards the unknown.");
            int d = myScanner.nextInt();

            if (d == 1) {
                System.out.println();
                System.out.println("----------------------------------------------------------------------------");
                caelumMountains();
            } else if (d == 2) {
                System.out.println();
                System.out.println("----------------------------------------------------------------------------");
                elvenCampTwo();
            }
        }
    }

    public void splitTwo() {

    }

    public void splitThree() {

    }

    public void splitFour() {

    }

    //Options from split one

    public void caelumMountains() {
        System.out.println();
        System.out.println("You reach the base of the Caelum Mountain Range. As you begin your ascent into the snowy mountains you notice a strange abundance of footprints in the snow around you. A while later you are ambushed by a group of thieves! \"Give us all of your crowns and we'll let you go!\" What do you do?");
        System.out.println();
        System.out.println("1) Give them all of your crowns. You currently have " + money + " crowns.");
        System.out.println("2) Attempt to fight the gang of thieves.");
        System.out.println("3) Attempt to run away.");
        int a = myScanner.nextInt();
        System.out.println();

        if (a == 1 && money > 0) {
            int dieRoll = randomGenerator.nextInt(6) + 1;
            switch (dieRoll) {
                case 1:
                System.out.println("You gave the thieves all of your crowns and they decided to kill you anyways.");
                System.out.println();
                gameOver();
                break;

                case 2:
                System.out.println("You gave the thieves all of your crowns and they decided to kill you anyways.");
                System.out.println();
                gameOver();
                break;

                case 3:
                System.out.println("You gave the thieves all of your crowns and they decided to kill you anyways.");
                System.out.println();
                gameOver();
                break;

                case 4:
                hp -= 50;
                money = 0;
                luck++;
                System.out.println("You gave the thieves all of your crowns and they decided to beat you up and let you live. You suffer 50 damage from this encounter, putting your health at " + hp + " points. You also now have 0 crowns, but you gain one luck point, putting your luck at " + luck + "/10. As you stagger out of the mountain range you see a bright and brilliant castle off in the distance. You slowly make your way towards the beaming city until you finally reach the castle gates.");
                System.out.println();
                System.out.println("----------------------------------------------------------------------------");
                castleBonum();
                break;

                case 5:
                hp -= 50;
                money = 0;
                luck++;
                System.out.println("You gave the thieves all of your crowns and they decided to beat you up and let you live. You suffer 50 damage from this encounter, putting your health at " + hp + " points. You also now have 0 crowns, but you gain one luck point, putting your luck at " + luck + "/10. As you stagger out of the mountain range you see a bright and brilliant castle off in the distance. You slowly make your way towards the beaming city until you finally reach the castle gates.");
                System.out.println();
                System.out.println("----------------------------------------------------------------------------");
                castleBonum();
                break;

                case 6:
                hp -= 50;
                money = 0;
                luck++;
                System.out.println("You gave the thieves all of your crowns and they decided to beat you up and let you live. You suffer 50 damage from this encounter, putting your health at " + hp + " points. You also now have 0 crowns, but you gain one luck point, putting your luck at " + luck + "/10. As you stagger out of the mountain range you see a bright and brilliant castle off in the distance. You slowly make your way towards the beaming city until you finally reach the castle gates.");
                System.out.println();
                System.out.println("----------------------------------------------------------------------------");
                castleBonum();
                break;
            }
        } else if (a == 1 && money == 0) {
            System.out.println("You have no crowns so the thieves kill you. Because of their strength in numbers there is nothing you can do to save yourself.");
            System.out.println();
            gameOver();
        } else if (a == 2) {
            System.out.println("There are too many thieves for you to battle and they easily overtake and kill you.");
            System.out.println();
            gameOver();
        } else if (a == 3) {
            System.out.println("The gang of thieves are experts at traversing the mountain range and easily catch up to you, overtake you, and kill you.");
            System.out.println();
            gameOver();
        }
    }

    public void elvenCampOne() {
        System.out.println();
        System.out.println("After walking along the North path for some time you finally reach an outpost blocking your path.");
        System.out.println("\"Who goes there?\" You hear from the outpost. You can just make out the elven figures from behind the outpost walls. You reply:");
        System.out.println("\"I am a traveler from the village of Incipiam on my way to Castle Bonum to ask the Noble King that rules there for help on my jouney to rescue the Princess of Incipiam from the Clan of Malum at Castle Diaboli.\"");
        System.out.println();
        System.out.println("The elves quickly let you pass the outpost gates but give you this somber news:");
        System.out.println("\"We are glad to be able to give you this news now, before you made the rest of the journey to Bonum: You are too late. The fair Castle Bonum has fallen and the Noble King there has been killed. An army of Ogres from the region of Mount Tormentum stormed the castle and ransacked it, leaving only a few survivors. Some of those survivors were lucky enough to find our camp here and have recieved medical care and food.\"");
        System.out.println();
        System.out.println("The elves lead you into their main camp where you see an abundant village full of elves and humans. The kind elves offer food and water for your journey, which you accept. The elves also point you in the direction of a path leading East through the Plains of Fertility. They say that the path East will take you to a Farming Village near the coast of the Sea of Treachery, which you can use to quickly reach Castle Diaboli. Which path do you take?");
        System.out.println();
        System.out.println("1) Journey West to search for anyone among the ruins of Castle Bonum who may help you along your journey.");
        System.out.println("2) Journey East through the Plains of Fertility towards the Farmer's Village.");
        int a = myScanner.nextInt();

        if (a == 1) {
            System.out.println();
            System.out.println("You journey Westward towards the ruins of Castle Bonum and around the Caelum Mountains.");
            System.out.println();
            System.out.println("----------------------------------------------------------------------------");
            sackedCastleBonum();
        } else if (a == 2) {
            System.out.println();
            System.out.println("You take the elves' advice and travel East into the Plains of Fertility.");
            System.out.println();
            System.out.println("----------------------------------------------------------------------------");
            plainsOfFertility();
        }
    }

    public void elvenCampTwo() {
        System.out.println();
        System.out.println("After walking along the North path for some time you finally reach an outpost blocking your path.");
        System.out.println("\"Who goes there?\" You hear from the outpost. You can just make out the elven figures from behind the outpost walls. You reply:");
        System.out.println("\"I am a traveler from the village of Incipiam on my way to Castle Bonum to ask the Noble King that rules there for help on my jouney to rescue the Princess of Incipiam from the Clan of Malum at Castle Diaboli.\"");
        System.out.println();
        System.out.println("The elves quickly let you pass the outpost gates and lead you to their main camp. The camp is full of elves and humans living peacefully. As you pass through the camp you are offered food and water for your journey, which you accept. You also hear of a path Eastward through the Plains of Fertility which lead to a Farming Village near the coast of the Sea of Treachery. According to the elves this is the fastest way to reach Castle Diaboli, although it is a dangerous one. Which path do you choose?");
        System.out.println();
        System.out.println("1) Journey West towards Castle Bonum and around the Caelum Mountains to seek help from the Noble King that rules there.");
        System.out.println("2) Take the path East through the Plains of Fertility and on to the Farmer's Village near the coast of the Sea of Treachery.");
        int a = myScanner.nextInt();

        if (a == 1) {
            System.out.println();
            System.out.println("You take the path West and continue your journey towards Castle Bonum.");
            System.out.println();
            System.out.println("----------------------------------------------------------------------------");
            invasionOfCastleBonum();
        } else if (a == 2) {
            System.out.println();
            System.out.println("You journey East through the Plains of Fertility towards the Farmer's Village.");
            System.out.println();
            System.out.println("----------------------------------------------------------------------------");
            plainsOfFertility();
        }
    }

    public void elvenTreasurePath() {
        System.out.println();
        System.out.println("As you walk along the path North towards the Elven camp you notice the faded path the begger was talking about. You follow it to a massive tree growing high above all the others and start digging at the base of the tree. After a while of digging you feel something under the dirt and lift up a treasure trunk! Inside the treasure trunk are:");
        System.out.println();
        
        int dieRoll = randomGenerator.nextInt(6) + 1;
        switch (dieRoll) {
            case 1:
            System.out.println("Nothing! The trunk is empty and you head back to the main path dissapointed.");
            break;

            case 2:
            System.out.println("Twenty crowns! You were hopeful for more treasure than that and walk back towards the main path dissapointed.");
            money += 20;
            System.out.println();
            System.out.println("Your discovery increases your total crowns to " + money + ".");
            break;

            case 3:
            System.out.println("Fifty crowns! Although it's not the greatest bounty you are content with your treasure and walk back to the main path.");
            money += 50;
            System.out.println();
            System.out.println("Your discovery increases your total crowns to " + money + ".");
            break;

            case 4:
            System.out.println("Eighty crowns and an old armor set! You are happy with this discovery and quickly equip the rusty chainmail armor as you head back to the main path.");
            money += 80;
            armor = "rusty chainmail";
            hp += 20;
            System.out.println();
            System.out.println("Your discovery increases your total crowns to " + money + " and your armor gives you 30 bonus health points, putting you at " + hp + "health!");
            break;

            case 5:
            System.out.println("One hundred and twenty crowns and a moderately used armor set! You are pleased with your discovery and quickly equip the lightly used chainmail as you head back to the main path.");
            money += 120;
            armor = "lightly used chainmail";
            hp += 30;
            luck++;
            System.out.println();
            System.out.println("Your discovery increases your total crowns to " + money + " and your armor gives you 50 bonus health points, putting you at " + hp + " health! You also gain one luck point, putting your luck at " + luck + "/10.");
            break;

            case 6:
            System.out.println("Two hundred crowns, a moderately used armor set, and an old sword! You are very excited about this discovery and quickly equip the lightly used chainmail and old sword as you walk back to the main path!");
            money += 200;
            armor = "lightly used chainmail";
            hp += 30;
            weapon = "old sword";
            weaponDMG = 20;
            vrb = "swing";
            luck++;
            System.out.println();
            System.out.println("Your discovery increases your total crowns to " + money + " and your armor gives you 50 bonus health points, putting you at " + hp + "health! Your weapon is now an " + weapon + ", and it does " + weaponDMG + " damage per hit! You also gain one luck point, putting your luck at " + luck + "/10.");
            break;
        }
        
        System.out.println();
        System.out.print("Press 1 to continue ");
        int a = myScanner.nextInt();
        if (a == 1) {
            elvenCampOne();
        }
    }

    //Options from split two

    //Options from split three

    //Options from split four

    ////////////////////////////////////////

    public void castleBonum() {
        
    }

    public void invasionOfCastleBonum() {
        ogreHP = 40;

        System.out.println();
        System.out.println("After many tiring days of travel you finally come to the mighty Castle Bonum, home of the honorable human clan of Ius. The people here are ruled by the Noble King, a very generous and giving king who is known for helping those in need.");
        System.out.println();
        System.out.println("You make your way through one of the open gates of the city walls and head towards the king's court to make your case. But as you're approaching the court you suddenly hear the roar of war horns! An invasion!!");
        System.out.println();
        System.out.println("\"Hurry!\" Say the guards at the king's court, \"Come join us to defend our home!\" Do you join in the fight to defend Castle Bonum?");
        System.out.println();
        System.out.println("1) Yes");
        System.out.println("2) No");
        int a = myScanner.nextInt();

        if (a == 1) {
            System.out.println();
            System.out.println("You have decided to join in the fight to save Castle Bonum! You rush to the castle walls and see an army of Ogres storming the castle. You pick your target and engage in battle!");
            System.out.println();
            System.out.println("Press 1 to initialize battle with the looming Ogre!");
            int b = myScanner.nextInt();
            if (b == 1) {
                ogreBattlePlayerTurn();
            }
        } else if (a == 2) {
            System.out.println();
            System.out.println("You run from the fight and Castle Bonum falls to the invading Ogres. The Noble King is dead and you are eventually caught by the Ogre army and killed.");
            System.out.println();
            gameOver();
        }
    }

    public void ogreBattlePlayerTurn() {
        int attack = randomGenerator.nextInt(10) + 1;
            if (attack > luck) {
                System.out.println();
                System.out.println("You " + vrb + " and miss! The Ogre takes 0 damage and his health remains at " + ogreHP + " health points.");
                System.out.println();
                System.out.print("Press 1 to continue: ");
                int a = myScanner.nextInt();
                if (a == 1) {
                    ogreBattleOgreTurn();
                } else {
                    ogreBattleOgreTurn();
                }
            } else if (attack <= luck) {
                ogreHP -= weaponDMG;
                if (ogreHP > 0) {
                    System.out.println();
                    System.out.println("You " + vrb + " with your " + weapon + " and successfully hit the Ogre, dealing " + weaponDMG + " damage to it! The Ogre's health is now at " + ogreHP + " health points.");
                    System.out.println();
                    System.out.print("Press 1 to continue: ");
                    int b = myScanner.nextInt();
                    if (b == 1) {
                        ogreBattleOgreTurn();
                    } else {
                        ogreBattleOgreTurn();
                    }
                } else {
                    System.out.println();
                    System.out.println("You have successfully killed the ogre! This changes the tide of the battle for Castle Bonum and the Noble Army is able to beat back the invading Ogre Army! Upon hearing of your brave act the king requests to speak with you!");
                    System.out.println();
                    System.out.print("Press 1 to continue: ");
                    int c = myScanner.nextInt();
                    if (c == 1) {
                        postOgreBattle();
                    } else {
                        postOgreBattle();
                    }
                }

            }
    }

    public void ogreBattleOgreTurn() {
        int attack = randomGenerator.nextInt(10) + 1;
        if (attack <= luck) {
            System.out.println();
            System.out.println("The ogre swings and misses! You take 0 damage and your health remains at " + hp + " health points!");
            System.out.println();
            System.out.print("Press 1 to continue: ");
            int a = myScanner.nextInt();
            if (a == 1) {
                ogreBattlePlayerTurn();
            } else {
                ogreBattlePlayerTurn();
            }
        } else if (attack > luck) {
            int ogreDMG = 15;
            hp -= ogreDMG;
            if (hp > 0) {
                System.out.println();
                System.out.println("The ogre swings and hits you! You take " + ogreDMG + " damage and are now at " + hp + " health points.");
                System.out.println();
                System.out.print("Press 1 to continue: ");
                int b = myScanner.nextInt();
                if (b == 1) {
                    ogreBattlePlayerTurn();
                } else {
                    ogreBattlePlayerTurn();
                }
            } else {
                System.out.println();
                System.out.println("The ogre deals the final killing blow to you and you die.");
                System.out.println();
                gameOver();
            }
        }
    }

    public void postOgreBattle() {
        System.out.println();
        System.out.println("----------------------------------------------------------------------------");
        System.out.println();
        System.out.println("You are escorted to the king's court by a few Noble Knights. When you arrive at the building the Noble King stands to greet you and says:");
        System.out.println();
        System.out.println("\"" + playerName + "! I have heard of your bravery on the battlefield and was notified that you are a foreigner in this land. I would like to personally welcome you to Castle Bonum and invite you to the royal feast!\"");
        System.out.println();
        System.out.println("Do you accept the king's invitation?");
        System.out.println("1) Yes");
        System.out.println("2) No");
        int a = myScanner.nextInt();

        if (a == 1) {
            if (hp < 100) {
                hp = 100;
            }
            if (luck < 9) {
                luck++;
            }
            System.out.println();
            System.out.println("\"Excellent!\" says the king. You are led to a room to wait for dinner. After some time a royal servant leads you to the king's feast. At the feast you eat and drink until you are full. This increases your health back to 100 health points! You then explain your journey to the king. He replies:");
            System.out.println();
            System.out.println("\"Your journey is most honorable and good! I will do my part in aiding your quest to Castle Diaboli to rescue the Princess of Incipiam by providing you with full access to my armory and a full company of Noble Knights on your quest! However, my only wish is that my men do not step inside the castle walls of Diaboli, for it is a foul place filled with evil. The time to cleanse that place will come, but not today. I wish you the best of luck in conquering anything you may face within the walls of Diaboli, but my men must not step into that place.\"");
            System.out.println();
            System.out.print("Press 1 to continue: ");
            int cont = myScanner.nextInt();
            if (cont == 1) {
                System.out.println();
                System.out.println("You thank the Noble King and accept his gifts. You gain one luck point from this, putting your total luck to " + luck + "/10. You follow your company of Noble Knights into the armory to select your weapon. You may choose from: ");
                System.out.println();
                System.out.println("1) A Balanced Sword. This weapon deals moderate damage and does not affect your luck.");
                System.out.println("2) A Heavy Axe. This weapon deals above average damage but decreases your luck by 2 points.");
                System.out.println("3) A Light Bow. This weapon deals below average damage but increases your luck by 1 point.");
            }
            int b = myScanner.nextInt();

            if (b == 1) {
                weapon = "Iusus Sword";
                weaponDMG = 34;
                vrb = "swing";
                System.out.println();
                System.out.println("You have chosen the " + weapon + "! It deals " + weaponDMG + " damage. Your luck remains at " + luck + "/10.");
                System.out.println();
                System.out.println("You and your company of Noble Knights travel tirelessly through the land in the direction of Castle Diaboli, overcoming any troubles that arise and conquering any foes that get in your way. After days of traveling your group finally reach the outskirts of Castle Diaboli. The Noble Knights of Bonum wish you luck with the rest of your journey and begin their way back to their homeland. You approach the castle and enter.");
                System.out.println();
                System.out.print("Press 1 to continue: ");
                int c = myScanner.nextInt();
                if (c == 1) {
                    System.out.println();
                    castleDiaboli();
                } else {
                    System.out.println();
                    castleDiaboli();
                }

            } else if (b == 2) {
                weapon = "Iusus Axe";
                weaponDMG = 50;
                vrb = "swing";
                if (luck >= 3) {
                    luck -= 2;
                } else if (luck < 3) {
                    luck = 1;
                }
                System.out.println();
                System.out.println("You have chosen the " + weapon + "! It is heavy in your hands. This weapon deals " + weaponDMG + " damage and your luck has decreased by 2 points, putting you at " + luck + "/10 luck.");
                System.out.println();
                System.out.println("You and your company of Noble Knights travel tirelessly through the land in the direction of Castle Diaboli, overcoming any troubles that arise and conquering any foes that get in your way. After days of traveling your group finally reach the outskirts of Castle Diaboli. The Noble Knights of Bonum wish you luck with the rest of your journey and begin their way back to their homeland. You approach the castle and enter.");
                System.out.println();
                System.out.print("Press 1 to continue: ");
                int c = myScanner.nextInt();
                if (c == 1) {
                    System.out.println();
                    castleDiaboli();
                } else {
                    System.out.println();
                    castleDiaboli();
                }
            } else if (b == 3) {
                weapon = "Iusus Bow";
                weaponDMG = 23;
                vrb = "shoot";
                if (luck < 9) {
                    luck++;
                }
                System.out.println();
                System.out.println("You have chosen the " + weapon + "! It is light in your hands. This weapon deals " + weaponDMG + " damage and your luck has increased by 1 point, putting you at " + luck + "/10 luck.");
                System.out.println();
                System.out.println("You and your company of Noble Knights travel tirelessly through the land in the direction of Castle Diaboli, overcoming any troubles that arise and conquering any foes that get in your way. After days of traveling your group finally reach the outskirts of Castle Diaboli. The Noble Knights of Bonum wish you luck with the rest of your journey and begin their way back to their homeland.");
                System.out.println();
                System.out.println("You approach the castle and enter.");
                System.out.println();
                System.out.print("Press 1 to continue: ");
                int c = myScanner.nextInt();
                if (c == 1) {
                    System.out.println();
                    castleDiaboli();
                } else {
                    System.out.println();
                    castleDiaboli();
                }
            }
        } else if (a == 2) {
            weapon = "Iusus Sword";
            weaponDMG = 34;
            if (luck < 9) {
                luck++;
            }
            if (hp <= 70) {
                hp += 30;
            } else if (hp > 70) {
                hp = 100;
            }
            System.out.println();
            System.out.println("\"As you wish!\" says the king. You then explain to him your journey. The Noble King replies, \"Your quest is honorable and good. I will send with you a small group of Noble Knights to accompany you on your journey up to the Wasteland of Periculum, but they shall go no further than that. I shall also gift you this sword to aid you in the battles to come, as well as some food and water.\" You thank the king and ready yourself to continue your journey with your group of Noble Knights.");
            System.out.println();
            System.out.println("You now have an " + weapon + ", which deals " + weaponDMG + " damage and are at " + hp + " health points because of the king's food and water! You also gained a luck point from this and are now at " + luck + "/10 luck.");
            System.out.println();
            System.out.println("You journey on with your group of Noble Knights, overcoming any challenge and conquering any foe that opposes you on your journey. You finally come up on the Wasteland of Periculum, the last challenge before you reach Castle Diaboli. Your group of Noble Knights wish you well on the rest of your journey and head back to their homeland.");
            System.out.println();
            System.out.println("You face the wasteland and enter.");
            System.out.println();
            System.out.print("Press 1 to continue: ");
            int c = myScanner.nextInt();
                if (c == 1) {
                    System.out.println();
                    wastelandOfPericulumSouth();
                } else {
                    System.out.println();
                    wastelandOfPericulumSouth();
                }
        }
    }

    public void sackedCastleBonum() {

    }

    public void plainsOfFertility() {

    }

    public void wastelandOfPericulumSouth() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println();
    }

    public void castleDiaboli() {
        goblinHP = 70;
        trollHP = 110;
        goblinLordHP = 100;
        int goblinLordDMG = 50;

        System.out.println("----------------------------------------------------------------------------");
        System.out.println();
        System.out.println("As the castle doors slam shut behind you and leave you in almost complete darkness, you hear the screeching of goblins scurrying throughout the halls of Castle Diaboli. You shiver in fear but steel yourself and push inwards. As you carefully creep your way through the castle you are suddenly swarmed by a Pack of Goblins!");
        System.out.println();
        System.out.print("Press 1 to defend yourself from the Goblin Pack! ");
        int a = myScanner.nextInt();
        if (a == 1) {
            goblinBattlePlayerTurn();
        }
    }

    public void goblinBattlePlayerTurn() {
        int attack = randomGenerator.nextInt(10) + 1;
            if (attack > luck) {
                System.out.println();
                System.out.println("You " + vrb + " and miss! The Pack of Goblins take 0 damage and their health remains at " + goblinHP + " health points.");
                System.out.println();
                System.out.print("Press 1 to continue: ");
                int a = myScanner.nextInt();
                if (a == 1) {
                    goblinBattleGoblinTurn();
                } else {
                    goblinBattleGoblinTurn();
                }
            } else if (attack <= luck) {
                goblinHP -= weaponDMG;
                if (goblinHP > 0) {
                    System.out.println();
                    System.out.println("You " + vrb + " with your " + weapon + " and successfully hit the Pack of Goblins, dealing " + weaponDMG + " damage to them! The Goblin's health is now at " + goblinHP + " health points.");
                    System.out.println();
                    System.out.print("Press 1 to continue: ");
                    int b = myScanner.nextInt();
                    if (b == 1) {
                        goblinBattleGoblinTurn();
                    } else {
                        goblinBattleGoblinTurn();
                    }
                } else {
                    hp += 40;
                    armor = "Iron Chainmail";
                    if (luck < 9) {
                        luck++;
                    }
                    System.out.println();
                    System.out.println("You have successfully killed the Pack of Goblins!");
                    System.out.println();
                    System.out.println("Among the remains you see a shining set of iron armor, which you promptly equip. The " + armor + " gives you 40 extra health points, putting your health at " + hp + " health points. You also gain 1 luck point for this encounter, putting your luck at " + luck + "/10.");
                    System.out.println();
                    System.out.print("Press 1 to continue: ");
                    int c = myScanner.nextInt();
                    if (c == 1) {
                        postGoblinBattle();
                    } else {
                        postGoblinBattle();
                    }
                }

            }
    }

    public void goblinBattleGoblinTurn() {
        int attack = randomGenerator.nextInt(10) + 1;
        if (attack <= luck) {
            System.out.println();
            System.out.println("The Goblins swing and miss! You take 0 damage and your health remains at " + hp + " health points!");
            System.out.println();
            System.out.print("Press 1 to continue: ");
            int a = myScanner.nextInt();
            if (a == 1) {
                goblinBattlePlayerTurn();
            } else {
                goblinBattlePlayerTurn();
            }
        } else if (attack > luck) {
            int goblinDMG = 25;
            hp -= goblinDMG;
            if (hp > 0) {
                System.out.println();
                System.out.println("The Goblins swing and hit you! You take " + goblinDMG + " damage and are now at " + hp + " health points.");
                System.out.println();
                System.out.print("Press 1 to continue: ");
                int b = myScanner.nextInt();
                if (b == 1) {
                    goblinBattlePlayerTurn();
                } else {
                    goblinBattlePlayerTurn();
                }
            } else {
                System.out.println();
                System.out.println("The Goblins deal the final killing blow to you and you die.");
                System.out.println();
                gameOver();
            }
        }
    }

    public void postGoblinBattle() {
        System.out.println();
        System.out.println("----------------------------------------------------------------------------");
        System.out.println();
        System.out.println("You find yourself wondering down a long hallway until you come upon a split in the path. Both paths look identical, which do you choose?");
        System.out.println();
        System.out.println("1) The left path");
        System.out.println("2) The right path");
        int a = myScanner.nextInt();

        if (a == 1) {
            System.out.println();
            System.out.println("You explore the left path. It is a long and dark hallway with a faint glow at the far end of it...");
            trollTalk();
        } else if (a == 2) {
            System.out.println();
            System.out.println("You explore the right path. It has a putrid smell that increases with every step you take...");
            castleDiaboliTreasureRoom();
        }
    }

    public void castleDiaboliTreasureRoom() {
        money += 200;
        System.out.println();
        System.out.println("----------------------------------------------------------------------------");
        System.out.println();
        if (hp < 75) {
            hp += 25;
            System.out.println("As you carefully explore the lengthy hallway down the left path you come across a room full of precious treasure! You gain 200 crowns from this discovery, putting you at " + money + " total crowns! You also find a puddle of water to recover from your fight with the goblins. You gain 25 health, putting you at " + hp + " health points.");
            System.out.println();
            System.out.println("You then follow the path leading out of the treasure room and into a grand room smelling heavily of rotting flesh...");
            System.out.println();
            System.out.print("Press 1 to continue: ");
            int a = myScanner.nextInt();
            if (a == 1) {
                trollTalk();
            } else {
                trollTalk();
            }
        } else if (hp >= 75) {
            System.out.println("As you carefully explore the lengthy hallway down the left path you come across a room full of precious treasure! You gain 200 crowns from this discovery, putting you at " + money + " total crowns!");
            System.out.println();
            System.out.println("You then follow the path leading out of the treasure room and into a grand room smelling heavily of rotting flesh...");
            System.out.println();
            System.out.print("Press 1 to continue: ");
            int b = myScanner.nextInt();
            if (b == 1) {
                trollTalk();
            } else {
                trollTalk();
            }
        }
    }

    public void trollTalk() {
        System.out.println();
        System.out.println("----------------------------------------------------------------------------");
        System.out.println();
        System.out.println("You find yourself in a massive room filled wall-to-wall with mounds of gold, silver, and bones. As you enter, a gigantic Troll takes notice of you and turns to inspect his visitor.");
        System.out.println();
        System.out.println("\"Mmmm... another adventurer?\" mutters the Troll, \"What do you want? Turn back now if you don't want to be tonight's dessert! You are lucky enough that a whole army came through here earlier, I am full and don't need to waste my time with one puny traveler. Nevertheless, I cannot allow you to go any further into the castle, so turn back.\" What do you do?");
        System.out.println();
        System.out.println("1) Make a break for it and try to run past the Troll");
        System.out.println("2) Fight your way through the Troll");
        System.out.println("3) Negotiate with the Troll");
        int a = myScanner.nextInt();

        if (a == 1) {
            System.out.println();
            System.out.println("As you attempt to run past the massive Troll he easily scoops you up and swallows you whole for a tiny and unsatisfactory dessert.");
            gameOver();
        } else if (a == 2) {
            System.out.println();
            System.out.println("You prepare to fight with the giant Troll! Press 1 to initialize battle!");
            int b = myScanner.nextInt();
            if (b == 1) {
                trollBattlePlayerTurn();
            } else {
                trollBattlePlayerTurn();
            }
        } else if (a == 3) {
            System.out.println();
            System.out.println("Looking around the Troll's massive room you get an idea. \"What if I can help you with this mighty collection you have here?\" you say, pointing to the piles of silver and gold crowns littered throughout the room. \"Oh?\" the troll ponders. After a minute he says, \"Sure. Give me all your valuables and I'll let you pass.\"");
            System.out.println();
            if (money >= 200) {
                System.out.println("You give the troll " + money + " crowns, putting you at 0. After counting his plunder he lets you pass safely.");
                System.out.println();
                System.out.print("Press 1 to continue: ");
                int c = myScanner.nextInt();
                if (c == 1) {
                    System.out.println();
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println();
                    postTroll();
                } else {
                    System.out.println();
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println();
                    postTroll();
                }
            } else if (money < 200) {
                System.out.println("You give the troll " + money + " crowns, putting you at 0. He counts his plunder, unsatisfied with how much you have to offer. \"This is not enough!\" the Troll says, \"Now prepare to be dessert!\"");
                System.out.println();
                System.out.print("Press 1 to initialize battle with the Troll! ");
                int d = myScanner.nextInt();
                if (d == 1) {
                    System.out.println();
                    trollBattlePlayerTurn();
                } else {
                    System.out.println();
                    trollBattlePlayerTurn();
                }
            }
        }
    }

    public void trollBattlePlayerTurn() {
        int attack = randomGenerator.nextInt(10) + 1;
            if (attack > luck) {
                System.out.println();
                System.out.println("You " + vrb + " and miss! The Troll takes 0 damage and his health remains at " + trollHP + " health points.");
                System.out.println();
                System.out.print("Press 1 to continue: ");
                int a = myScanner.nextInt();
                if (a == 1) {
                    trollBattleTrollTurn();
                } else {
                    trollBattleTrollTurn();
                }
            } else if (attack <= luck) {
                trollHP -= weaponDMG;
                if (trollHP > 0) {
                    System.out.println();
                    System.out.println("You " + vrb + " with your " + weapon + " and successfully hit the Troll, dealing " + weaponDMG + " damage to him! The Troll's health is now at " + trollHP + " health points.");
                    System.out.println();
                    System.out.print("Press 1 to continue: ");
                    int b = myScanner.nextInt();
                    if (b == 1) {
                        trollBattleTrollTurn();
                    } else {
                        trollBattleTrollTurn();
                    }
                } else {
                    if (luck < 9) {
                        luck++;
                    }
                    System.out.println();
                    System.out.println("You have successfully killed the Troll!");
                    System.out.println();
                    System.out.println(" You also gain 1 luck point for this encounter, putting your luck at " + luck + "/10.");
                    System.out.println();
                    System.out.print("Press 1 to continue: ");
                    int c = myScanner.nextInt();
                    if (c == 1) {
                        postTroll();
                    } else {
                        postTroll();
                    }
                }

            }
    }

    public void trollBattleTrollTurn () {
        int attack = randomGenerator.nextInt(10) + 1;
        if (attack <= luck) {
            System.out.println();
            System.out.println("The Troll swings and misses! You take 0 damage and your health remains at " + hp + " health points!");
            System.out.println();
            System.out.print("Press 1 to continue: ");
            int a = myScanner.nextInt();
            if (a == 1) {
                trollBattlePlayerTurn();
            } else {
                trollBattlePlayerTurn();
            }
        } else if (attack > luck) {
            int trollDMG = 34;
            hp -= trollDMG;
            if (hp > 0) {
                System.out.println();
                System.out.println("The Troll swings and hits you! You take " + trollDMG + " damage and are now at " + hp + " health points.");
                System.out.println();
                System.out.print("Press 1 to continue: ");
                int b = myScanner.nextInt();
                if (b == 1) {
                    trollBattlePlayerTurn();
                } else {
                    trollBattlePlayerTurn();
                }
            } else {
                System.out.println();
                System.out.println("The Troll deals the final killing blow to you and you are eaten as a very small dessert.");
                System.out.println();
                gameOver();
            }
        }
    }

    public void postTroll() {
        System.out.println();
        System.out.println("----------------------------------------------------------------------------");
        System.out.println();
        System.out.println("This works!");
    }

    public void gameOver() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println();
        System.out.println("GAME OVER");
        System.out.println();
        System.out.print("To start over, press 1: ");
        int restart = myScanner.nextInt();
        if (restart == 1) {
            startGame();
        } else {
            gameOver();
        }
    }

    public static void main(String[] args) throws Exception {
        TextAdventure game = new TextAdventure();
        game.startGame();
    }
}