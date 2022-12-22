package character;

/**
 * The Character class creates a player character and store's its stats along with methods that access
 * those stats and add to their values. This class implements the Singleton design pattern to ensure
 * that there is only one instance of this class.
 * 
 * @author Dylan Fassio
 *
 */
public class Character {

	private static Character player;
	private String name;
	private int level;
	private int strength;
	private int dexterity;
	private int intelligence;
	private int wisdom;
	private int charisma;
	private int constitution;
	private int kindness;



	private int time;
	
	//Private constructor to ensure that only this class can create a Character.
	private Character() {
		name = null;
		level = 1;
		strength = 10;
		dexterity = 10;
		intelligence = 10;
		wisdom = 10;
		charisma = 10;
		constitution = 10;
		kindness = 10;
		time = 480;//8 hours in minutes
	}

	//Allows other classes to interact with single Character, creates one if it doesn't already exist.
	public static Character getInstance() {

		
		if (player == null) {
			player = new Character();
		}
		return player;
	}
	
	//Access methods that return the current value of each stat.
	public String getName() {return name;}
	
	public int getLevel() {return level;}
	
	public int getStr() {return strength;}

	public int getDex() {return dexterity;}

	public int getIntel() {return intelligence;}

	public int getWis() {return wisdom;}

	public int getChr() {return charisma;}

	public int getCon() {return constitution;}

	public int getKnd() {return kindness;}
	
	public int getTime() {return time;}

	//Adds a certain value to the current stat value.
	public void changeName(String newName) {name = newName;}
	
	public void addStr(int amt) {strength += amt;}

	public void addDex(int amt) {dexterity += amt;}

	public void addIntel(int amt) {intelligence += amt;}

	public void addWis(int amt) {wisdom += amt;}

	public void addChr(int amt) {charisma += amt;}

	public void addCon(int amt) {constitution += amt;}

	public void addKnd(int amt) {kindness += amt;}
	
	public void removeTime(int inTime) {
		time -= inTime;
	}
	public void resetTime(){
		time =  480;
	}
	
	public void levelUp() {level++;}
	
	
	//Creates a Memento object using the character's current stats .
	public Memento save() {
		return new Memento();
	}
	
	//Takes values from last saved Memento object and sets them as the current stats.
	public void load(String data) {
		String s[] = data.split("\t");
		
		name = s[0];
		level = Integer.parseInt(s[1]);
		strength = Integer.parseInt(s[2]);
		dexterity = Integer.parseInt(s[3]);
		intelligence = Integer.parseInt(s[4]);
		constitution = Integer.parseInt(s[5]);
		wisdom = Integer.parseInt(s[6]);
		charisma = Integer.parseInt(s[7]);
		kindness = Integer.parseInt(s[8]);
		//time = Integer.parseInt(s[9]);
	}

	
	/**
	 * Memento class acts as a copy of the character class that can be stored and restored by the Caretaker class.
	 * 
	 * @author Dylan Fassio
	 */
	
	class Memento{

		private String name;
		private int level, strength, intelligence, dexterity, constitution, wisdom, charisma, kindness, time;
		
		//Memento constructor that takes a copy of the current character stats
		private Memento() {
			this.name = player.getName();
			this.level = player.getLevel();
			this.strength = player.getStr();
			this.intelligence = player.getIntel();
			this.dexterity = player.getDex();
			this.constitution = player.getCon();
			this.wisdom = player.getWis();
			this.charisma = player.getChr();
			this.kindness = player.getKnd();
			this.time = player.getTime();
		}
		
		public String toString() {
			return (name + "\t" + level + "\t" + strength + "\t" + dexterity + "\t" + intelligence +
					"\t" + constitution + "\t" + wisdom + "\t" + charisma + "\t" + kindness + "\t" + time);
		}

		
	}
}
