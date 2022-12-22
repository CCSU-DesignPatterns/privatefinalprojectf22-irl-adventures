package character;

import character.Character.Memento;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Caretaker class that stores and returns the last saved Memento object.
 * 
 * @author Dylan
 *
 */
public class Caretaker {

	static Memento lastSave;
	Character player = Character.getInstance();
	File save = new File("SaveData.txt");
	
	public Caretaker() {
		
	}

	//sets the local Memento object to the most recent version of the character.
	public void saveToFile() {
		
		lastSave = player.save();
		
		try {
			FileWriter saver = new FileWriter("SaveData.txt");
			saver.write(lastSave.toString());
			saver.close();
			System.out.println("Character successfully saved!"); //integrate with UI
		} catch (IOException e) {
			System.out.println("Couldn't write to file");
			e.printStackTrace();
		}
	}
	
	//returns the stored Memento object
	public void loadFromFile() {
		
		try {
			Scanner loader = new Scanner(save);
			String saveData = loader.nextLine();
			loader.close();
			player.load(saveData);
		} catch (FileNotFoundException e) {
			System.out.println("File could not be found");
			e.printStackTrace();
		}
		

	}
	
	//Checks if there is a saved file so Driver class knows if a name should be asked for.
	public boolean isFirstGame() {
		if (save.length() == 0) {
			return true;
		}
		return false;
	}
}
