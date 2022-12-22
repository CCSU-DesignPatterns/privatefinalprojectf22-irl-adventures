package userinterface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonListener implements ActionListener {
	int mins;
	String type;

	@SuppressWarnings("unused")
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		// TODO Auto-generated method stub
		Object b = (Object)source;
		
		// This will be classes that pull up the next window to the stats
		// There we can actually implement some of the methods
		if (b.equals(CharacterScreen.strength_button)) {
			TaskWindowCreator taskwind = new TaskWindowCreator("Strength");
			type = "Strength";
		} else if (b.equals(CharacterScreen.dexterity_button)) {
			TaskWindowCreator taskwind = new TaskWindowCreator("Dexterity");
			type = "Dexterity";
		} else if (b.equals(CharacterScreen.wisdom_button)) {
			TaskWindowCreator taskwind = new TaskWindowCreator("Wisdom");
			type = "Wisdom";
		} else if (b.equals(CharacterScreen.intelligence_button)) {
			TaskWindowCreator taskwind = new TaskWindowCreator("Intelligence");
			type = "Intelligence";
		} else if (b.equals(CharacterScreen.charisma_button)) {
			TaskWindowCreator taskwind = new TaskWindowCreator("Charisma");
			type = "Charisma";
		} else if (b.equals(CharacterScreen.constitution_button)) {
			TaskWindowCreator taskwind = new TaskWindowCreator("Constitution");
			type = "Constitution";
		} else if (b.equals(CharacterScreen.kindness_button)) {
			TaskWindowCreator taskwind = new TaskWindowCreator("Kindness");
			type = "Kindness";
		} else if (b.equals(TaskWindow.task1)) {
			TaskSubmitionCreator submitWindow = new TaskSubmitionCreator(TaskWindow.task1.getText());
		} else if (b.equals(TaskWindow.task2)) {
			TaskSubmitionCreator submitWindow = new TaskSubmitionCreator(TaskWindow.task2.getText());
		} else if (b.equals(TaskWindow.task3)) {
			TaskSubmitionCreator submitWindow = new TaskSubmitionCreator(TaskWindow.task3.getText());
		} else if (b.equals(TaskWindow.task4)) {
			TaskSubmitionCreator submitWindow = new TaskSubmitionCreator(TaskWindow.task4.getText());
		} else if (b.equals(TaskSubmition.b2)) {
			mins = Integer.parseInt(TaskSubmition.minst.getText());
			System.out.println(mins);
			
		}
		
	}
	
}

