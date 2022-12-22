package finalProjectfirst;

import javax.swing.JButton;

public class MyButton extends JButton implements GuiComponent {

	Character character = new Character();
	String nam;
	
	
	
	public MyButton(Character character, String name) {
		this.character = character;
		String nam = name;
		if (nam.toUpperCase().contains("STR")) {
			this.setText(nam + ": " + character.getStr());
		} else if (nam.toUpperCase().contains("DEX")) {
			this.setText(nam + ": " + character.getDex());
		} else if (nam.toUpperCase().contains("INT")) {
			this.setText(nam + ": " + character.getIntel());
		} else if (nam.toUpperCase().contains("WIS")) {
			this.setText(nam + ": " + character.getWis());
		} else if (nam.toUpperCase().contains("CHAR")) {
			this.setText(nam + ": " + character.getChr());
		} else if (nam.toUpperCase().contains("CON")) {
			this.setText(nam + ": " + character.getCon());
		} else if (nam.toUpperCase().contains("KIND")) {
			this.setText(nam + ": " + character.getKnd());
		}
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void Update() {
		// TODO Auto-generated method stub
		if (nam.toUpperCase().contains("STR")) {
			this.setText(nam + ": " + character.getStr());
		} else if (nam.toUpperCase().contains("DEX")) {
			this.setText(nam + ": " + character.getDex());
		} else if (nam.toUpperCase().contains("INT")) {
			this.setText(nam + ": " + character.getIntel());
		} else if (nam.toUpperCase().contains("WIS")) {
			this.setText(nam + ": " + character.getWis());
		} else if (nam.toUpperCase().contains("CHAR")) {
			this.setText(nam + ": " + character.getChr());
		} else if (nam.toUpperCase().contains("CON")) {
			this.setText(nam + ": " + character.getCon());
		} else if (nam.toUpperCase().contains("KIND")) {
			this.setText(nam + ": " + character.getKnd());
		}
	}

}
