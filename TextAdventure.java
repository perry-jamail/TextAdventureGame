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
    int dragonLordMalumHP;
    String vrb;
    int gangOfThievesHP;
    int goblinCampHP;

    public TextAdventure() {

    }

    public void startGame() {
        weapon = "fists";
        weaponDMG = 15;
        money = 30;
        armor = "none";
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
            System.out.println("Hello " + playerName + "! Ready for an adventure? Select a difficulty to get started!");
            System.out.println();
            System.out.println("1) Easy");
            System.out.println("2) Normal");
            System.out.println("3) Hard");
            System.out.println("4) Impossible");
            int a = myScanner.nextInt();

            if (a == 1) {
                luck = 12;
                hp = 115;
            } else if (a == 2) {
                luck = 10;
                hp = 100;
            } else if (a == 3) {
                luck = 8;
                hp = 85;
            } else if (a == 4) {
                luck = 6;
                hp = 70;
            }
            System.out.println();
            System.out.println("Your health is " + hp + ", your starting weapon are your " + weapon + ", your luck is " + luck + "/20, and you have " + money + " crowns (the local currency)!");
            System.out.println();
            System.out.print("Press 1 to continue: ");
            int b = myScanner.nextInt();
            if (b == 1) {
                System.out.println();
                System.out.println("----------------------------------------------------------------------------");
                startingVillage();
            }
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
                System.out.println("You gave the thieves all of your crowns and they decided to beat you up and let you live. You suffer 50 damage from this encounter, putting your health at " + hp + " points. You also now have 0 crowns, but you gain one luck point, putting your luck at " + luck + "/20. As you stagger out of the mountain range you see a bright and brilliant castle off in the distance. You slowly make your way towards the beaming city until you finally reach the castle gates.");
                System.out.println();
                System.out.print("Press 1 to continue: ");
                int b = myScanner.nextInt();
                if (b == 1) {

                }
                System.out.println();
                System.out.println("----------------------------------------------------------------------------");
                System.out.println();
                castleBonum();
                break;

                case 5:
                hp -= 50;
                money = 0;
                luck++;
                System.out.println("You gave the thieves all of your crowns and they decided to beat you up and let you live. You suffer 50 damage from this encounter, putting your health at " + hp + " points. You also now have 0 crowns, but you gain one luck point, putting your luck at " + luck + "/20. As you stagger out of the mountain range you see a bright and brilliant castle off in the distance. You slowly make your way towards the beaming city until you finally reach the castle gates.");
                System.out.println();
                System.out.print("Press 1 to continue: ");
                int c = myScanner.nextInt();
                if (c == 1) {
                    
                }
                System.out.println();
                System.out.println("----------------------------------------------------------------------------");
                System.out.println();
                castleBonum();
                break;

                case 6:
                hp -= 50;
                money = 0;
                luck++;
                System.out.println("You gave the thieves all of your crowns and they decided to beat you up and let you live. You suffer 50 damage from this encounter, putting your health at " + hp + " points. You also now have 0 crowns, but you gain one luck point, putting your luck at " + luck + "/20. As you stagger out of the mountain range you see a bright and brilliant castle off in the distance. You slowly make your way towards the beaming city until you finally reach the castle gates.");
                System.out.println();
                System.out.print("Press 1 to continue: ");
                int d = myScanner.nextInt();
                if (d == 1) {
                    
                }
                System.out.println();
                System.out.println("----------------------------------------------------------------------------");
                System.out.println();
                castleBonum();
                break;
            }
        } else if (a == 1 && money == 0) {
            System.out.println("You have no crowns so the thieves kill you. Because of their strength in numbers there is nothing you can do to save yourself.");
            System.out.println();
            gameOver();
        } else if (a == 2) {
            gangOfThievesHP = 40;
            System.out.print("You prepare to fight the Gang of Thieves! Press 1 to initialize battle! ");
            int fight = myScanner.nextInt();
            if (fight == 1) {
                thievesBattlePlayerTurn();
            } else {
                thievesBattlePlayerTurn();
            }
        } else if (a == 3) {
            System.out.println("The gang of thieves are experts at traversing the mountain range and easily catch up to you, overtake you, and kill you.");
            System.out.println();
            gameOver();
        }
    }

    public void thievesBattlePlayerTurn() {
        int attack = randomGenerator.nextInt(20) + 1;
            if (attack > luck) {
                System.out.println();
                System.out.println("You " + vrb + " and miss! The Gang of Thieves takes 0 damage and their health remains at " + gangOfThievesHP + " health points.");
                System.out.println();
                System.out.print("Press 1 to continue: ");
                int a = myScanner.nextInt();
                if (a == 1) {
                    thievesBattleThievesTurn();
                } else {
                    thievesBattleThievesTurn();
                }
            } else if (attack <= luck) {
                gangOfThievesHP -= weaponDMG;
                if (gangOfThievesHP > 0) {
                    System.out.println();
                    System.out.println("You " + vrb + " with your " + weapon + " and successfully hit the Gang of Thieves, dealing " + weaponDMG + " damage to them! Their health is now at " + gangOfThievesHP + " health points.");
                    System.out.println();
                    System.out.print("Press 1 to continue: ");
                    int b = myScanner.nextInt();
                    if (b == 1) {
                        thievesBattleThievesTurn();
                    } else {
                        thievesBattleThievesTurn();
                    }
                } else {
                    money += 200;
                    hp += 30;
                    if (luck < 18) {
                        luck ++;
                    }
                    System.out.println();
                    System.out.println("You have successfully killed the Gang of Thieves!");
                    System.out.println();
                    System.out.println("You loot 200 crowns and a small vial of healing potion from them, bringing your total crowns to " + money + ". You drink the small vial of healing potion, increasing your health by 30 points and putting your total at " + hp + " health points. You also gain 1 luck point from this encounter, putting your total luck at " + luck + "/20. You then continue through the treacherous mountain range and on towards Castle Bonum.");
                    System.out.println();
                    System.out.print("Press 1 to continue: ");
                    int c = myScanner.nextInt();
                    if (c == 1) {
                        System.out.println();
                        castleBonum();
                    } else {
                        System.out.println();
                        castleBonum();
                    }
                }

            }
    }

    public void thievesBattleThievesTurn() {
        int attack = randomGenerator.nextInt(20) + 1;
        if (attack <= luck) {
            System.out.println();
            System.out.println("The Gang of Thieves swing and miss! You take 0 damage and your health remains at " + hp + " health points!");
            System.out.println();
            System.out.print("Press 1 to continue: ");
            int a = myScanner.nextInt();
            if (a == 1) {
                thievesBattlePlayerTurn();
            } else {
                thievesBattlePlayerTurn();
            }
        } else if (attack > luck) {
            int gangOfThievesDMG = 15;
            hp -= gangOfThievesDMG;
            if (hp > 0) {
                System.out.println();
                System.out.println("The Gang of Thieves swing and hit you! You take " + gangOfThievesDMG + " damage and are now at " + hp + " health points.");
                System.out.println();
                System.out.print("Press 1 to continue: ");
                int b = myScanner.nextInt();
                if (b == 1) {
                    thievesBattlePlayerTurn();
                } else {
                    thievesBattlePlayerTurn();
                }
            } else {
                System.out.println();
                System.out.println("The Gang of Thieves deal the final killing blow to you and you die.");
                System.out.println();
                gameOver();
            }
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
        System.out.print("Press 1 to continue: ");
        int cont = myScanner.nextInt();
        if (cont == 1) {

        }
        System.out.println();
        System.out.println("The elves lead you into their main camp where you see an abundant village full of elves and humans. The kind elves offer food and water for your journey, which you accept. The elves also point you in the direction of a path leading East through the Plains of Fertility. They say that the path East will take you to a Farming Village near the coast of the Sea of Treachery, which you can use to quickly reach Castle Diaboli. Which path do you take?");
        System.out.println();
        System.out.println("1) Journey West to search for anyone among the ruins of Castle Bonum who may help you along your journey.");
        System.out.println("2) Journey East through the Plains of Fertility towards the Farmer's Village.");
        int a = myScanner.nextInt();

        if (a == 1) {
            System.out.println();
            System.out.println("You journey Westward towards the ruins of Castle Bonum and around the Caelum Mountains.");
            sackedCastleBonum();
        } else if (a == 2) {
            System.out.println();
            System.out.println("You take the elves' advice and travel East into the Plains of Fertility.");
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
            System.out.println("Your discovery increases your total crowns to " + money + " and your armor gives you 50 bonus health points, putting you at " + hp + "health! Your weapon is now an " + weapon + ", and it does " + weaponDMG + " damage per hit! You also gain one luck point, putting your luck at " + luck + "/20.");
            break;
        }
        
        System.out.println();
        System.out.print("Press 1 to continue: ");
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
        hp += 30;
        weapon = "Iusus Sword";
        weaponDMG = 34;
        System.out.println("You enter the magnificent Castle Bonum which is alive with the sights and sounds of townfolk doing business in the castle center. You make your way through the crowd and into the King's Court, where there is a line of people all waiting to be heard by the King. The line moves fast and you quickly reach the podium for your chance to ask the King for help.");
        System.out.println();
        System.out.print("Press 1 to continue: ");
        int b = myScanner.nextInt();
        if (b == 1) {

        }
        System.out.println();
        System.out.println("You humbly explain your journey to the Noble King. The King raises an eyebrow at your tale and replies, \"Your quest is most honorable and good. I will send with you a small group of Noble Knights to accompany you on your journey up to the Wasteland of Periculum, but they shall go no further than that. I shall also gift you this sword to aid you in the battles to come, as well as some food and water.\" You thank the King and ready yourself to continue your journey with your group of Noble Knights.");
        System.out.println();
        System.out.println("You now have an " + weapon + ", which deals " + weaponDMG + " damage and gain 30 health, putting you at " + hp + " health points because of the King's food and water!");
        System.out.println();
        System.out.print("Press 1 to continue: ");
        int c = myScanner.nextInt();
        if (c == 1) {

        }
        System.out.println();
        System.out.println("You journey on with your group of Noble Knights, overcoming any challenge and conquering any foe that opposes you on your journey. You finally come up on the Wasteland of Periculum, the last challenge before you reach Castle Diaboli. Your group of Noble Knights wish you well on the rest of your journey and head back to their homeland.");
        System.out.println();
        System.out.println("You face the wasteland and enter.");
        System.out.println();
        System.out.print("Press 1 to continue: ");
        int a = myScanner.nextInt();
            if (a == 1) {
                System.out.println();
                wastelandOfPericulumSouth();
            } else {
                System.out.println();
                wastelandOfPericulumSouth();
            }
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
            System.out.print("Press 1 to initialize battle with the looming Ogre! ");
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
        int attack = randomGenerator.nextInt(20) + 1;
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
        int attack = randomGenerator.nextInt(20) + 1;
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
        System.out.println();
        System.out.println("1) Yes");
        System.out.println("2) No");
        int a = myScanner.nextInt();

        if (a == 1) {
            hp += 50;
            if (luck < 18) {
                luck++;
            }
            System.out.println();
            System.out.println("\"Excellent!\" says the king. You are led to a room to wait for dinner. After some time a royal servant leads you to the king's feast. At the feast you eat and drink until you are full. This increases your health by 50 points, putting you at " + hp + " health points! You then explain your journey to the king.");
            System.out.println();
            System.out.print("Press 1 to continue: ");
            int d = myScanner.nextInt();
            if (d == 1) {

            }
            System.out.println();
            System.out.println("The king replies: \"Your journey is most honorable and good! I will do my part in aiding your quest to Castle Diaboli to rescue the Princess of Incipiam by providing you with full access to my armory and a full company of Noble Knights on your journey! However, my only wish is that my men do not step inside the castle walls of Diaboli, for it is a foul place filled with evil. The time to cleanse that place will come, but not today. I wish you the best of luck in conquering anything you may face within the walls of that terrible castle, but my men must not step into that place.\"");
            System.out.println();
            System.out.print("Press 1 to continue: ");
            int cont = myScanner.nextInt();
            if (cont == 1) {
                System.out.println();
                System.out.println("You thank the Noble King and accept his gifts. You gain one luck point from this, putting your total luck to " + luck + "/20. You follow your company of Noble Knights into the armory to select your weapon. You may choose from: ");
                System.out.println();
                System.out.println("1) A Balanced Sword. This weapon deals moderate damage and does not effect your luck.");
                System.out.println("2) A Heavy Axe. This weapon deals above average damage but decreases your luck by 2 points.");
                System.out.println("3) A Light Bow. This weapon deals below average damage but increases your luck by 1 point.");
            }
            int b = myScanner.nextInt();

            if (b == 1) {
                weapon = "Iusus Sword";
                weaponDMG = 34;
                vrb = "swing";
                System.out.println();
                System.out.println("You have chosen the " + weapon + "! It deals " + weaponDMG + " damage. Your luck remains at " + luck + "/20.");
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
                if (luck >= 4) {
                    luck -= 2;
                } else if (luck < 4) {
                    luck = 2;
                }
                System.out.println();
                System.out.println("You have chosen the " + weapon + "! It is heavy in your hands. This weapon deals " + weaponDMG + " damage and your luck has decreased by 2 points, putting you at " + luck + "/20 luck.");
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
                if (luck < 18) {
                    luck ++;
                }
                System.out.println();
                System.out.println("You have chosen the " + weapon + "! It is light in your hands. This weapon deals " + weaponDMG + " damage and your luck has increased by 1 point, putting you at " + luck + "/20 luck.");
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
            if (luck < 18) {
                luck++;
            }
            hp += 30;
            System.out.println();
            System.out.println("\"As you wish!\" says the king. You then explain to him your journey. The Noble King replies, \"Your quest is honorable and good. I will send with you a small group of Noble Knights to accompany you on your journey up to the Wasteland of Periculum, but they shall go no further than that. I shall also gift you this sword to aid you in the battles to come, as well as some food and water.\" You thank the king and ready yourself to continue your journey with your group of Noble Knights.");
            System.out.println();
            System.out.println("You now have an " + weapon + ", which deals " + weaponDMG + " damage and gain 30 health, putting you at " + hp + " health points because of the king's food and water! You also gained a luck point from this and are now at " + luck + "/20 luck.");
            System.out.println();
            System.out.print("Press 1 to continue: ");
            int next = myScanner.nextInt();
            if (next == 1) {
                
            }
            System.out.println();
            System.out.println("You journey on with your group of Noble Knights, overcoming any challenge and conquering any foe that opposes you on your journey. You finally come up on the Wasteland of Periculum, the last challenge before you reach Castle Diaboli, submerged in an endless darkness. Your group of Noble Knights wish you well on the rest of your journey and head back to their homeland.");
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
        System.out.println();
        System.out.println("----------------------------------------------------------------------------");
        System.out.println();
        System.out.println("As you approach the famed Castle Bonum you notice smoke billows rising from the city. You continue forwards, quickly losing hope of finding any survivors. You come to the edge of the castle, just behind the walls. You peek inside the castle and see the aftermath of a horrible battle, and no human survivors to be found.");
        System.out.println();
        System.out.println("The Ogre Army is everywhere. What do you do?");
        System.out.println();
        System.out.println("1) Attempt to sneak around the Ogre Army and through the halls of Castle Bonum to look for any survivors.");
        System.out.println("2) Run away and reassess your options at the Elven Camp in the North.");
        int a = myScanner.nextInt();
        if (a == 1) {
            int sneak = randomGenerator.nextInt(20) + 1;
            if (sneak > luck) {
                System.out.println();
                System.out.println("You are caught by the Ogre Army! You are quickly overrun and killed by the many Ogres.");
                System.out.println();
                gameOver();
            } else if (sneak <= luck) {
                System.out.println();
                System.out.println("You successfully sneak past the Ogre Army and enter Castle Bonum! As you enter the inner chambers of the castle you search room after room in hope of finding any survivors. After a while of searching you reach the lowest level of the castle, the dungeon...");
                System.out.println();
                System.out.print("Press 1 to continue: ");
                int b = myScanner.nextInt();
                if (b == 1) {

                }
                System.out.println();
                System.out.println("You enter the dungeon of Castle Bonum and are relieved to see a small group of survivors! You quickly lead the group back up to the ground level of the castle and attempt to sneak past the Ogre Army once more...");
                System.out.println();
                System.out.print("Press 1 to continue: ");
                int c = myScanner.nextInt();
                if (c == 1) {

                }
                int secondSneak = randomGenerator.nextInt(20) + 1;
                if (secondSneak > luck) {
                    System.out.println();
                    System.out.println("You are caught by the Ogre Army! You and your group of survivors are quickly overrun and killed by the many Ogres.");
                    System.out.println();
                    gameOver();
                } else if (secondSneak <= luck) {
                    money += 200;
                    weapon = "Iusus Bow";
                    weaponDMG = 23;
                    vrb = "shoot";
                    if (luck < 18) {
                        luck ++;
                    }
                    System.out.println();
                    System.out.println("You and your group of survivors successfully sneak past the Ogre Army and continue on towards the Elven Camp! On arrival at the Elven Camp the group of survivors gift you with 200 crowns and a bow from the defeated Bonum Army, which does " + weaponDMG + " damage. You also gain a luck point from this encounter, putting your total luck at " + luck + "/20.");
                    System.out.println();
                    System.out.print("Press 1 to continue: ");
                    int d = myScanner.nextInt();
                    if (d == 1) {
                        postSackedBonumElvenCamp();
                    }
                }
            }
        } else if (a == 2) {
            System.out.println();
            System.out.println("You run away from the Ogre Army and head back to the Elven Camp in the North.");
            System.out.println();
            System.out.print("Press 1 to continue: ");
            int b = myScanner.nextInt();
            if (b == 1) {
                postSackedBonumElvenCamp();
            }
        }
    }

    public void postSackedBonumElvenCamp() {
        System.out.println();
        System.out.println("As you return to the Elven Camp in the North you are left with only two options:");
        System.out.println();
        System.out.println("1) Head East through the Plains of Fertility and onwards to the Sea of Treachery.");
        System.out.println("2) Attempt to ask the Elves for help on your journey to Castle Diaboli.");
        int a = myScanner.nextInt();
        if (a == 1) {
            System.out.println();
            System.out.println("You decide to head East towards the Plains of Fertility.");
            System.out.println();
            System.out.print("Press 1 to continue: ");
            int cont = myScanner.nextInt();
            if (cont == 1) {
                plainsOfFertility();
            }
        } else if (a == 2) {
            System.out.println();
            System.out.println("You seek counsel with the King of the Elves. He accepts your request and you enter into his tent and explain your journey to him. He replies: \"Young traveler, your quest is very noble. However, I will not risk my own for the quest of a stranger. You are welcome to stay here and rest as long as you'd like, but I cannot help you past that.\"");
            System.out.println();
            System.out.println("You thank the King of the Elves and continue on your journey through the only remaining path: East towards the Plains of Fertility.");
            System.out.println();
            System.out.print("Press 1 to continue: ");
            int cont = myScanner.nextInt();
            if (cont == 1) {
                plainsOfFertility();
            }
        }
    }

    public void plainsOfFertility() {
        System.out.println();
        System.out.println("----------------------------------------------------------------------------");
        System.out.println();
    }

    public void wastelandOfPericulumSouth() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println();
        System.out.println("You venture into the Wasteland of Periculum from the Westernmost entrance into the land. As you journey forward you see the faint glow of a fire off in the distance. You distance yourself from the main path and hide yourself in the darkness as you continue. You come up right outside of a heavily populated Goblin Camp!");
        System.out.println();
        System.out.println("What do you do?");
        System.out.println();
        System.out.println("1) Sneak around the camp to avoid detection.");
        System.out.println("2) Fight through and loot the Goblin Camp.");
        System.out.println("3) Turn away from the camp and travel to the Northernmost entrance trail into the wasteland. This will require a long journey without food or water...");
        int a = myScanner.nextInt();

        if (a == 1) {
            int sneak = randomGenerator.nextInt(20) + 1;
            if (sneak > luck) {
                System.out.println();
                System.out.println("You were caught by the Goblins! Prepare to fight!");
                System.out.println();
                System.out.print("Press 1 to initialize battle with the Goblin Mob! ");
                int b = myScanner.nextInt();
                if (b == 1) {
                    goblinCampHP = 105;
                    System.out.println();
                    System.out.println("----------------------------------------------------------------------------");
                    goblinCampBattlePlayerTurn();
                }
            } else if (sneak <= luck) {
                System.out.println();
                System.out.println("You successfully sneak past the Goblin Camp and continue on your journey through the Wasteland of Periculum on the Westernmost trail to Castle Diaboli.");
                System.out.println();
                System.out.print("Press 1 to continue: ");
                int c = myScanner.nextInt();
                if (c == 1) {
                    preDiaboliPericulumSouth();
                }
            }
            } else if (a == 2) {
                System.out.println();
                System.out.println("You storm the camp! Prepare to fight!");
                System.out.println();
                System.out.print("Press 1 to initialize battle with the Goblin Mob! ");
                int b = myScanner.nextInt();
                if (b == 1) {
                    goblinCampHP = 105;
                    System.out.println();
                    System.out.println("----------------------------------------------------------------------------");
                    goblinCampBattlePlayerTurn();
                }
            } else if (a == 3) {
                hp -= 30;
                System.out.println();
                System.out.println("You choose to turn away from the Goblin Camp at the Westernmost entrance to the Wasteland of Periculum and travel several days North without food or water to reach the Northmost entrance trail into the wasteland. You lose 30 health from this due to lack of food and water, putting your health at " + hp + " health points.");
                System.out.println();
                System.out.print("Press 1 to continue into the Wasteland of Periculum from the Northmost Entrance: ");
                int b = myScanner.nextInt();
                if (b == 1) {
                    System.out.println();
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println();
                    wastelandOfPericulumNorth();
                }
            }
        }

    public void preDiaboliPericulumSouth() {
        System.out.println();
        System.out.println("----------------------------------------------------------------------------");
        System.out.println();
        System.out.println("As you continue through the desert wasteland you come upon a small sheet of metal and wood halfway buried in the sand. Interested, you pick it up. Once you dig it out of the sand you realize that it is an old shield, damaged beyond repair. On the back of the shield is written: ");
        System.out.println();
        System.out.println("\"Right... Middle...");
        System.out.println();
        System.out.println("Undecided on the meaning of the cryptic message you toss the shield down and continue on your way. After a little further you reach the dreaded Castle Diaboli...");
        System.out.println();
        System.out.print("Press 1 to continue into the Castle: ");
        int a = myScanner.nextInt();
        if (a == 1) {

        }
        System.out.println();
        castleDiaboli();    
    }

    public void goblinCampBattlePlayerTurn() {
        int attack = randomGenerator.nextInt(20) + 1;
            if (attack > luck) {
                System.out.println();
                System.out.println("You " + vrb + " and miss! The Goblin Mob takes 0 damage and their health remains at " + goblinCampHP + " health points.");
                System.out.println();
                System.out.print("Press 1 to continue: ");
                int a = myScanner.nextInt();
                if (a == 1) {
                    goblinCampBattleGoblinsTurn();
                } else {
                    goblinCampBattleGoblinsTurn();
                }
            } else if (attack <= luck) {
                goblinCampHP -= weaponDMG;
                if (goblinCampHP > 0) {
                    System.out.println();
                    System.out.println("You " + vrb + " with your " + weapon + " and successfully hit the Goblin Mob, dealing " + weaponDMG + " damage to them! The Goblin's health is now at " + goblinCampHP + " health points.");
                    System.out.println();
                    System.out.print("Press 1 to continue: ");
                    int b = myScanner.nextInt();
                    if (b == 1) {
                        goblinCampBattleGoblinsTurn();
                    } else {
                        goblinCampBattleGoblinsTurn();
                    }
                } else {
                    hp += 50;
                    if (luck < 18) {
                        luck++;
                    }
                    System.out.println();
                    System.out.println("You have successfully killed the Goblin Mob!");
                    System.out.println();
                    System.out.println("As you loot the Goblin Camp you come across a medium vial of healing potion, which you drink. This increases your health by 50 points, putting you at " + hp + " total health points. You also come across a small but lethal-looking dagger. Do you equip this? You currently have your " + weapon + " as your weapon.");
                    System.out.println();
                    System.out.println("1) Yes, take and equip the dagger.");
                    System.out.println("2) No, keep my " + weapon + " equipped.");
                    int d = myScanner.nextInt();
                    if (d == 1) {
                        weapon = "Malum Dagger";
                        vrb = "stab";
                        weaponDMG = 20;
                        if (luck < 17) {
                            luck += 2;
                        } else {
                            luck = 18;
                        }
                        System.out.println();
                        System.out.println("You equip the Malum Dagger, but as you do you hear a piercing voice come out of the darkness: \"I AM THE DAY. I AM THE NIGHT. I AM MALUM!\" The dagger does 20 damage and increases your luck by 2, putting your total luck at " + luck + "/20.");
                    } else if (d == 2) {
                        System.out.println();
                        System.out.println("You leave the dagger and continue on towards Castle Diaboli.");
                    }
                    System.out.println();
                    System.out.print("Press 1 to continue: ");
                    int c = myScanner.nextInt();
                    if (c == 1) {
                        preDiaboliPericulumSouth();
                    } else {
                        preDiaboliPericulumSouth();
                    }
                }

            }
    }

    public void goblinCampBattleGoblinsTurn() {
        int attack = randomGenerator.nextInt(20) + 1;
        if (attack <= luck) {
            System.out.println();
            System.out.println("The Goblin Mob swings and misses! You take 0 damage and your health remains at " + hp + " health points!");
            System.out.println();
            System.out.print("Press 1 to continue: ");
            int a = myScanner.nextInt();
            if (a == 1) {
                goblinCampBattlePlayerTurn();
            } else {
                goblinCampBattlePlayerTurn();
            }
        } else if (attack > luck) {
            int goblinDMG = 25;
            hp -= goblinDMG;
            if (hp > 0) {
                System.out.println();
                System.out.println("The Goblin Mob swings and hits you! You take " + goblinDMG + " damage and are now at " + hp + " health points.");
                System.out.println();
                System.out.print("Press 1 to continue: ");
                int b = myScanner.nextInt();
                if (b == 1) {
                    goblinCampBattlePlayerTurn();
                } else {
                    goblinCampBattlePlayerTurn();
                }
            } else {
                System.out.println();
                System.out.println("The Goblins deal the final killing blow to you and you die.");
                System.out.println();
                gameOver();
            }
        }
    }

    public void wastelandOfPericulumNorth() {

    }

    public void castleDiaboli() {
        goblinHP = 70;
        trollHP = 110;

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
        int attack = randomGenerator.nextInt(20) + 1;
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
                    if (luck < 18) {
                        luck++;
                    }
                    System.out.println();
                    System.out.println("You have successfully killed the Pack of Goblins!");
                    System.out.println();
                    System.out.println("Among the remains you see a shining set of iron armor, which you promptly equip. The " + armor + " gives you 40 extra health points, putting your health at " + hp + " health points. You also gain 1 luck point for this encounter, putting your luck at " + luck + "/20.");
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
        int attack = randomGenerator.nextInt(20) + 1;
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
        System.out.println("You find yourself wandering down a long hallway until you come upon a split in the path. Both paths look identical, which do you choose?");
        System.out.println();
        System.out.println("1) The left path");
        System.out.println("2) The right path");
        int a = myScanner.nextInt();

        if (a == 1) {
            System.out.println();
            System.out.println("You explore the left path. It has a putrid smell that increases with every step you take...");
            System.out.println();
            System.out.print("Press 1 to continue: ");
            int b = myScanner.nextInt();
            if (b == 1) {
                trollTalk();
            } else {
                trollTalk();
            }
        } else if (a == 2) {
            System.out.println();
            System.out.println("You explore the right path. It is a long and dark hallway with a faint glow at the far end of it...");
            System.out.println();
            System.out.print("Press 1 to continue: ");
            int b = myScanner.nextInt();
            if (b == 1) {
                castleDiaboliTreasureRoom();
            } else {
                castleDiaboliTreasureRoom();
            }
        }
    }

    public void castleDiaboliTreasureRoom() {
        money += 200;
        System.out.println();
        System.out.println("----------------------------------------------------------------------------");
        System.out.println();
        if (hp < 85) {
            hp += 25;
            System.out.println("As you carefully explore the lengthy hallway down the right path you come across a room full of precious treasure! You gain 200 crowns from this discovery, putting you at " + money + " total crowns! You also find a puddle of water to recover from your fight with the goblins. You gain 25 health, putting you at " + hp + " health points.");
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
        } else if (hp >= 85) {
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
        System.out.println("\"Mmmm... another adventurer?\" mutters the Troll, \"What do you want? Turn back now if you don't want to be tonight's dessert! You are lucky enough that a whole army came through here earlier, I am full and don't need to waste my time with one puny traveler. Nevertheless, I cannot allow you to go any further into the castle, so turn back.\" What do you do? Your health is at " + hp + " health points.");
        System.out.println();
        System.out.println("1) Make a break for it and try to run past the Troll");
        System.out.println("2) Fight your way through the Troll");
        System.out.println("3) Negotiate with the Troll");
        int a = myScanner.nextInt();

        if (a == 1) {
            System.out.println();
            System.out.println("As you attempt to run past the massive Troll he easily scoops you up and swallows you whole for a tiny and unsatisfactory dessert.");
            System.out.println();
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
            System.out.println("Give the Troll all of your crowns? You currently have " + money + " total crowns.");
            System.out.println();
            System.out.println("1) Yes");
            System.out.println("2) No");
            int e = myScanner.nextInt();
            if (e == 1) {
                if (money >= 200) {
                    System.out.println();
                    System.out.println("You give the Troll " + money + " crowns, putting you at 0. After counting his plunder he lets you pass safely.");
                    money = 0;
                    System.out.println();
                    System.out.print("Press 1 to continue: ");
                    int c = myScanner.nextInt();
                    if (c == 1) {
                        System.out.println();
                        postTroll();
                    } else {
                        System.out.println();
                        System.out.println("----------------------------------------------------------------------------");
                        System.out.println();
                        postTroll();
                    }
                } else if (money < 200) {
                    System.out.println();
                    System.out.println("You give the Troll " + money + " crowns, putting you at 0. He counts his plunder, unsatisfied with how much you have to offer. \"This is not enough!\" the Troll says, \"Now prepare to be dessert!\"");
                    money = 0;
                    System.out.println();
                    System.out.print("Press 1 to initialize battle with the Troll! ");
                    int d = myScanner.nextInt();
                    if (d == 1) {
                        trollBattlePlayerTurn();
                    } else {
                        trollBattlePlayerTurn();
                    }
                }
            } else if (e == 2) {
                System.out.println();
                System.out.println("You refuse to give the Troll your valuables. He is angered and prepares to fight!");
                System.out.println();
                System.out.print("Press 1 to initialize battle with the Troll! ");
                int f = myScanner.nextInt();
                if (f == 1) {
                    trollBattlePlayerTurn();
                } else {
                    trollBattlePlayerTurn();
                }
            }
        }
    }

    public void trollBattlePlayerTurn() {
        int attack = randomGenerator.nextInt(20) + 1;
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
                    if (luck < 18) {
                        luck++;
                    }
                    hp += 100;
                    money += 300;
                    System.out.println();
                    System.out.println("The Troll falls dead with a mighty crash!");
                    System.out.println();
                    System.out.println("You plunder some of the Troll's treasure, taking 300 crowns, putting your total at " + money + " crowns. You also find a vial of healing potion among the Troll's posessions, which you drink. The potion gives you 100 health, putting you at " + hp + " health points. You also gain 1 luck point for this encounter, putting your luck at " + luck + "/20.");
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
        int attack = randomGenerator.nextInt(20) + 1;
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
        System.out.println("You walk out of the Troll's chambers lucky to be alive. As you push forward you come across a split in the path once again. Choose which way to go:");
        System.out.println();
        System.out.println("1) Take the left path");
        System.out.println("2) Take the middle path");
        System.out.println("3) Take the right path");
        int a = myScanner.nextInt();

        if (a == 1) {
            System.out.println();
            System.out.println("You have chosen to go down the left path. As you walk the hallway gets warmer and warmer...");
            System.out.println();
            System.out.print("Press 1 to continue: ");
            int b = myScanner.nextInt();
            if (b == 1) {
                System.out.println();
                dragonLordMalum();
            } else {
                System.out.println();
                dragonLordMalum();
            }
        } else if (a == 2) {
            System.out.println();
            System.out.println("You have chosen to go down the middle path. You see the shimmer of water reflecting off the cold stone of the castle walls as you walk...");
            System.out.println();
            System.out.print("Press 1 to continue: ");
            int b = myScanner.nextInt();
            if (b == 1) {
                System.out.println();
                preMalumTreasure();
            } else {
                System.out.println();
                preMalumTreasure();
            }
        } else if (a == 3) {
            System.out.println();
            System.out.println("You have chosen to go down the right path. There is no sign of an end as you walk through the long, winding halls...");
            System.out.println();
            System.out.print("Press 1 to continue: ");
            int b = myScanner.nextInt();
            if (b == 1) {
                System.out.println();
                labyrinth();
            } else {
                System.out.println();
                labyrinth();
            }
        }
    }

    public void labyrinth() {
        hp -= 20;
        System.out.println("----------------------------------------------------------------------------");
        System.out.println();
        System.out.println("As you wander down the right path it winds and splits in many directions. Soon enough you attempt to turn back towards the Troll's lair but instead find yourself hopelessly lost. Eventually you begin to thirst and hunger, decreasing your health by 20 points! You now have " + hp + " health points by the time you finally see a faint light at the end of the tunnel. As you walk towards it the hallway becomes warmer and warmer...");
        System.out.println();
        System.out.print("Press 1 to continue: ");
        int a = myScanner.nextInt();
        if (a == 1) {
            System.out.println();
            dragonLordMalum();
        } else {
            System.out.println();
            dragonLordMalum();
        }
    }

    public void preMalumTreasure() {
        hp += 50;
        System.out.println("----------------------------------------------------------------------------");
        System.out.println();
        System.out.println("You come upon a storage room built on the edge of an underground river flowing with clean water. You drink your fill and gain 50 health, putting you at " + hp + " health points! You also see a variety of weapons and a lone goblin in the corner of the storage room. \"Wanna buy something? You'll need some heavy weaponry if you want to walk out of here alive\" says the Friendly Goblin. Do you want to buy anything? You have " + money + " crowns.");
        System.out.println();
        System.out.println("1) Purchase the Giant Crossbow. Deals 60 damage and increases your luck by 2. - 800 crowns");
        System.out.println("2) Purchase the Hunter's Longsword. Deals 80 damage and increases your luck by 1. - 600 crowns");
        System.out.println("3) Purchase the Great Hammer of Malum. Deals 100 damage and does not effect your luck. - 400 crowns");
        System.out.println("4) Purchase nothing and continue on your journey.");
        int a = myScanner.nextInt();

        if (a == 1 && money >= 800) {
            money -= 800;
            weapon = "Giant Crossbow";
            vrb = "shoot";
            weaponDMG = 60;
            if (luck < 17) {
                luck += 2;
            } else {
                luck = 18;
            }
            System.out.println();
            System.out.println("You have spent 800 crowns to buy the Giant Crossbow. It deals 60 damage, you now have " + money + " crowns, and your luck increases by 2 points, putting your luck at " + luck + "/20.");
            System.out.println();
            System.out.print("Press 1 to continue on your way: ");
            int b = myScanner.nextInt();
            if (b == 1) {
                System.out.println();
                dragonLordMalum();
            } else {
                System.out.println();
                dragonLordMalum();
            }
        } else if (a == 1 && money < 800) {
            System.out.println();
            System.out.println("----------------------------------------------------------------------------");
            System.out.println();
            System.out.println("You do not have enough money for this item.");
            System.out.println();
            preMalumTreasure();
        } else if (a == 2 && money >= 600) {
            money -= 600;
            weapon = "Hunter's Longsword";
            vrb = "swing";
            weaponDMG = 80;
            if (luck < 18) {
                luck ++;
            } else {
                luck = 18;
            }
            System.out.println();
            System.out.println("You have spent 600 crowns to buy the Hunter's Longsword. It deals 80 damage, you now have " + money + " crowns, and your luck increases by 1, putting your luck at " + luck + "/20.");
            System.out.println();
            System.out.print("Press 1 to continue on your way: ");
            int b = myScanner.nextInt();
            if (b == 1) {
                System.out.println();
                dragonLordMalum();
            } else {
                System.out.println();
                dragonLordMalum();
            }
        } else if (a == 2 && money < 600) {
            System.out.println();
            System.out.println("----------------------------------------------------------------------------");
            System.out.println();
            System.out.println("You do not have enough money for this item.");
            System.out.println();
            preMalumTreasure();
        } else if (a == 3 && money >= 400) {
            money -= 400;
            weapon = "Great Hammer of Malum";
            vrb = "swing";
            weaponDMG = 100;
            System.out.println();
            System.out.println("You have spent 400 crowns to buy the Great Hammer of Malum. It deals 100 damage, you now have " + money + " crowns, and your luck is not effected and is still at " + luck + "/20.");
            System.out.println();
            System.out.print("Press 1 to continue on your way: ");
            int b = myScanner.nextInt();
            if (b == 1) {
                System.out.println();
                dragonLordMalum();
            } else {
                System.out.println();
                dragonLordMalum();
            }
        } else if (a == 3 && money < 200) {
            System.out.println();
            System.out.println("----------------------------------------------------------------------------");
            System.out.println();
            System.out.println("You do not have enough money for this item.");
            System.out.println();
            preMalumTreasure();
        } else if (a == 4) {
            System.out.println();
            System.out.println("You purchase nothing and continue further into the castle. You begin to notice the temperature getting warmer and warmer as you approach the brightly glowing end of the hallway...");
            System.out.println();
            System.out.print("Press 1 to continue: ");
            int b = myScanner.nextInt();
            if (b == 1) {
                System.out.println();
                dragonLordMalum();
            } else {
                System.out.println();
                dragonLordMalum();
            }
        } else if (a == 5 && money >= 1000) {
            money -= 1000;
            weapon = "Gjallarhorn";
            weaponDMG = 1000;
            luck = 20;
            System.out.println();
            System.out.println("You have spent 1000 crowns to buy Gjallarhorn. It deals 1000 damage, you now have " + money + " crowns, and your luck is now 20/20. Have fun.");
            System.out.println();
            System.out.print("Press 1 to continue on your way: ");
            int b = myScanner.nextInt();
            if (b == 1) {
                System.out.println();
                dragonLordMalum();
            } else {
                System.out.println();
                dragonLordMalum();
            }
        } else if (a == 5 && money < 1000) {
            System.out.println();
            System.out.println("----------------------------------------------------------------------------");
            System.out.println();
            System.out.println("You do not have enough money for this item.");
            System.out.println();
            preMalumTreasure();
        }
    }

    public void dragonLordMalum() {
        dragonLordMalumHP = 250;
        System.out.println("----------------------------------------------------------------------------");
        System.out.println();
        System.out.println("You enter a gargantuan outdoor courtyard engulfed in flames and embers. At the center of the the courtyard stands looming a massive Elder Dragon!! As you survey the rest of the scene your eyes come upon the terrified Princess of Incipiam trapped in a cage in the corner of the arena! The Dragon takes notice of you...");
        System.out.println();
        System.out.print("Press 1 to continue: ");
        int b = myScanner.nextInt();
        if (b == 1) {
            System.out.println();
            System.out.println("\"WELL... WHAT DO WE HAVE HERE? A PUNY ADVENTURER COME TO TAKE THE PRINCESS AWAY FROM ME?! HA!\"");
            System.out.println("The Dragon suddenly leaps high into the sky and comes crashing down just in front of you, knocking you backwards onto the ground.");
            System.out.println();
            System.out.println("\"DO YOU EVEN KNOW WHO YOU CHALLENGE, \"HERO\"? I AM ONE OF THE ELDER DRAGONS OF THIS WORLD, ONE OF THE ORIGINAL SCULPTORS OF THIS REALITY! I AM MALUM! AND I WILL NOT BE DEFEATED BY A SOLE PEASANT! NOW... DIE!!");
            System.out.println();
            System.out.print("Press 1 to initialize battle with the Great Dragon Lord Malum! ");
            int a = myScanner.nextInt();
            if (a == 1) {
                malumBattlePlayerTurn();
            } else {
                malumBattlePlayerTurn();
            }
        }
    }

    public void malumBattlePlayerTurn() {
        if (weapon == "Malum Dagger") {
            weaponDMG = 150;
        }
        int attack = randomGenerator.nextInt(20) + 1;
            if (attack > luck) {
                dragonLordMalumHP += 10;
                System.out.println();
                System.out.println("You " + vrb + " and miss! Dragon Lord Malum takes 0 damage and he gains 10 health from natural regeneration! His health is now at " + dragonLordMalumHP + " health points.");
                System.out.println();
                System.out.print("Press 1 to continue: ");
                int a = myScanner.nextInt();
                if (a == 1) {
                    malumBattleMalumTurn();
                } else {
                    malumBattleMalumTurn();
                }
            } else if (attack <= luck) {
                dragonLordMalumHP -= weaponDMG;
                if (dragonLordMalumHP > 0) {
                    dragonLordMalumHP += 10;
                    System.out.println();
                    System.out.println("You " + vrb + " with your " + weapon + " and successfully hit Dragon Lord Malum, dealing " + weaponDMG + " damage to him! Malum then regains 10 health due to his natural regeneration! Dragon Lord Malum's health is now at " + dragonLordMalumHP + " health points.");
                    System.out.println();
                    System.out.print("Press 1 to continue: ");
                    int b = myScanner.nextInt();
                    if (b == 1) {
                        malumBattleMalumTurn();
                    } else {
                        malumBattleMalumTurn();
                    }
                } else {
                    System.out.println();
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println();
                    System.out.println("A horrible and piercing screech erupts from the Dragon as he comes crashing down in the courtyard, dead!");
                    System.out.println();
                    System.out.println("You've done it! You defeated Dragon Lord Malum! You release the fair Princess of Incipiam from her prison and escort her back to the Town of Incipiam where the Duke holds a parade and massive feast in your honor as the Hero of Incipiam!");
                    System.out.println();
                    System.out.println("Thank you for playing my Text Adventure Game! Press 1 to start a new game or press 2 to quit the game!");
                    System.out.println();
                    System.out.print("> ");
                    int c = myScanner.nextInt();
                    if (c == 1) {
                        startGame();
                    } else if (c == 2) {
                        
                    }
                }

            }
    }

    public void malumBattleMalumTurn() {
        int attack = randomGenerator.nextInt(20) + 1;
        if (attack <= luck) {
            System.out.println();
            System.out.println("Dragon Lord Malum swings at you and misses! You take 0 damage and your health remains at " + hp + " health points!");
            System.out.println();
            System.out.print("Press 1 to continue: ");
            int a = myScanner.nextInt();
            if (a == 1) {
                malumBattlePlayerTurn();
            } else {
                malumBattlePlayerTurn();
            }
        } else if (attack > luck) {
            int dragonLordMalumDMG = 50;
            hp -= dragonLordMalumDMG;
            if (hp > 0) {
                System.out.println();
                System.out.println("Dragon Lord Malum unleashes a fiery blast at you and hits you! You take " + dragonLordMalumDMG + " damage and are now at " + hp + " health points.");
                System.out.println();
                System.out.print("Press 1 to continue: ");
                int b = myScanner.nextInt();
                if (b == 1) {
                    malumBattlePlayerTurn();
                } else {
                    malumBattlePlayerTurn();
                }
            } else {
                System.out.println();
                System.out.println("With a mighty fireball the Great Dragon Lord Malum burns you to ashes.");
                System.out.println();
                malumGameOver();
            }
        }
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

    public void malumGameOver() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println();
        System.out.println("GAME OVER");
        System.out.println();
        System.out.print("To start over at the fight with Dragon Lord Malum with health at 100, press 1. To start a new game, press 2: ");
        int restart = myScanner.nextInt();
        if (restart == 1) {
            hp = 100;
            System.out.println();
            dragonLordMalum();
        } else if (restart == 2) {
            System.out.println();
            startGame();
        } else {
            System.out.println();
            malumGameOver();
        }
    }

    public static void main(String[] args) throws Exception {
        TextAdventure game = new TextAdventure();
        game.startGame();
    }
}