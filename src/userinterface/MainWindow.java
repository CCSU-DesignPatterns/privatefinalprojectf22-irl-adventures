package userinterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import character.Character;

@SuppressWarnings("serial")
public class MainWindow extends JFrame{  
	// Creation of all elements for the Main GUI screen
	// Start with the general frame work
	Character player = Character.getInstance();
	MyButton strength_button = new MyButton(player, "Strength");
	MyButton dexterity_button = new MyButton(player, "Dexterity");
	MyButton intelligence_button = new MyButton(player, "Intelligence");
	MyButton wisdom_button = new MyButton(player, "Wisdom");
	MyButton charisma_button = new MyButton(player, "Charisma");
	MyButton constitution_button = new MyButton(player, "Constitution");
	MyButton kindness_button = new MyButton(player, "Kindness");
		JFrame total = new JFrame("Adventure's Log");
		
		//Player_info is made of 3 panels
		JPanel avatar = new JPanel();
		JPanel name_level = new JPanel();
		JPanel inventory_button = new JPanel();
		
		
		
		
		
		
		// All Things have been created for Main Screen on to implementation
		
		public MainWindow(Character player) {
			//creation of frame and what it does
			this.player = player;
			int PANEL_WIDTH = 500;
			int PANEL_HEIGHT = 750;
			setTitle("Adventure's Log!");
			setSize(PANEL_WIDTH, PANEL_HEIGHT);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//Create a panel to put into the frame
			JPanel totatlity = new JPanel();
			
			
			
			
			// Start putting everything inside
			//Player_info at the top
			JPanel player_info = new JPanel();
			player_info.setBackground(new Color(4,79,103)); //Navyish Blue
			
			
			//name_level which goes to the top left of the screen
			JPanel name_level = new JPanel();
			name_level.setBorder(BorderFactory.createBevelBorder(0));
			name_level.setLayout(new BoxLayout(name_level,BoxLayout.Y_AXIS));
			JLabel name = new JLabel ("Player Name: ");
			name_level.add(name);
			JLabel level = new JLabel ("Level: ");
			name_level.add(level);
			name_level.setSize(getMaximumSize());
			
			
			
			
			//avatar should be in the middle
			JPanel avatar = new JPanel();
			avatar.setBorder(BorderFactory.createBevelBorder(0));
			avatar.setSize((PANEL_WIDTH/3),100);
			// The things that go into avatar
			
			
			
			
			JLabel thumb = new JLabel();
			thumb.setIcon(new ImageIcon("placeholder.jpg"));
			avatar.add(thumb);
			
			
			
			
			
			
			
			JPanel inventory_button = new JPanel();
			inventory_button.setBorder(BorderFactory.createBevelBorder(0));
			inventory_button.setSize(PANEL_WIDTH/3,100);
			JLabel placeholder2 = new JLabel("Place holder2");
			inventory_button.add(placeholder2);
			
			
			
			player_info.add(name_level,BorderLayout.WEST);
			player_info.add(avatar, BorderLayout.CENTER);
			player_info.add(inventory_button,BorderLayout.EAST);
			
			
			
			player_info.setSize(PANEL_WIDTH,200);
			// start adding to the panel
			
			
			
			
			
			//Stat_info is made of multiple Buttons
			
			
			//Stat_info in the middle
			MyPanel stat_info = new MyPanel();
			stat_info.setBackground(new Color(4,79,103)); //Navyish Blue
			stat_info.setSize(PANEL_WIDTH,350);
			stat_info.list.add(strength_button);
			stat_info.list.add(dexterity_button);
			stat_info.list.add(intelligence_button);
			stat_info.list.add(wisdom_button);
			stat_info.list.add(charisma_button);
			stat_info.list.add(constitution_button);
			stat_info.list.add(kindness_button);
			strength_button.setBackground(Color.RED);
			strength_button.addActionListener(new buttonListener());
			strength_button.setBackground(new Color(212,175,55)); 
			strength_button.setForeground(new Color(146,0,10));
			dexterity_button.setBackground(new Color(212,175,55));
			dexterity_button.setForeground(new Color(146,0,10));
			dexterity_button.addActionListener(new buttonListener());
			intelligence_button.setBackground(new Color(212,175,55));// Gold(metallic)
			intelligence_button.setForeground(new Color(146,0,10)); // Dark Blood
			intelligence_button.addActionListener(new buttonListener());
			wisdom_button.setBackground(new Color(212,175,55));
			wisdom_button.setForeground(new Color(146,0,10));
			wisdom_button.addActionListener(new buttonListener());
			charisma_button.setBackground(new Color(212,175,55));
			charisma_button.setForeground(new Color(146,0,10));
			charisma_button.addActionListener(new buttonListener());
			constitution_button.setBackground(new Color(212,175,55));
			constitution_button.setForeground(new Color(146,0,10));
			constitution_button.addActionListener(new buttonListener());
			kindness_button.setBackground(new Color(212,175,55));
			kindness_button.setForeground(new Color(146,0,10));
			kindness_button.addActionListener(new buttonListener());
			stat_info.setLayout(new GridBagLayout());
			GridBagConstraints c = new GridBagConstraints();
			c.fill = GridBagConstraints.CENTER;
			c.ipady = stat_info.getHeight()/7 +1;
			c.ipadx = stat_info.getWidth();
			c.gridx=0;
			c.gridy=0;
			stat_info.add(strength_button,c);
			c.gridx=0;
			c.gridy=1;
			stat_info.add(dexterity_button,c);
			c.gridx=0;
			c.gridy=2;
			stat_info.add(intelligence_button,c);
			c.gridx=0;
			c.gridy=3;
			stat_info.add(wisdom_button,c);
			c.gridx=0;
			c.gridy=4;
			stat_info.add(charisma_button,c);
			c.gridx=0;
			c.gridy=5;
			stat_info.add(constitution_button,c);
			c.gridx=0;
			c.gridy=6;
			stat_info.add(kindness_button,c);
			// Settings go at the bottom
			JPanel settings = new JPanel();
			settings.setBackground(new Color(4,79,103));
			JLabel hi = new JLabel("This is where the setting things go");
			settings.add(hi);
			
			
			totatlity.setLayout(new BoxLayout(totatlity, BoxLayout.Y_AXIS));
			
			
			totatlity.add(player_info); 
			totatlity.add(stat_info);
			totatlity.add(settings);
			add(totatlity);
			setVisible(true);
			
			
		}





public class buttonListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		// TODO Auto-generated method stub
		Object b = (Object)source;
		
		// This will be classes that pull up the next window to the stats
		// There we can actually implement some of the methods
		if (b.equals(strength_button)) {
			System.out.println(b.toString());
			TaskWindowCreator taskwind = new TaskWindowCreator("Strength");
		} else if (b.equals(dexterity_button)) {
			System.out.println(b.toString());
			TaskWindowCreator taskwind = new TaskWindowCreator("Dexterity");
		} else if (b.equals(wisdom_button)) {
			System.out.println(b.toString());
			TaskWindowCreator taskwind = new TaskWindowCreator("Wisdom");
		} else if (b.equals(intelligence_button)) {
			System.out.println(b.toString());
			TaskWindowCreator taskwind = new TaskWindowCreator("Intelligence");
		} else if (b.equals(charisma_button)) {
			System.out.println(b.toString());
			TaskWindowCreator taskwind = new TaskWindowCreator("Charisma");
		} else if (b.equals(constitution_button)) {
			System.out.println(b.toString());
			TaskWindowCreator taskwind = new TaskWindowCreator("Constitution");
		} else if (b.equals(kindness_button)) {
			System.out.println(b.toString());
			TaskWindowCreator taskwind = new TaskWindowCreator("Kindness");
		}
		
	}
	
}
}