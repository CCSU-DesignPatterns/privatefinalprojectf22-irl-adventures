package finalProjectfirst;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class Task_Window extends JFrame implements SubWindow {
	
	JPanel task_area = new JPanel();
	JButton task1 = new JButton();
	JButton task2 = new JButton();
	JButton task3 = new JButton();
	JButton task4 = new JButton();
	public Task_Window(String stat) {
		int PANEL_WIDTH = 100;
		int PANEL_HEIGHT = 150;
		setTitle("Adventure's Log!");
		setSize(PANEL_WIDTH, PANEL_HEIGHT);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		if (stat.toUpperCase().contains("STR")) {
			task1 = new JButton("Weight Train");
			task2 = new JButton("Play Sports");
			task3 = new JButton("Work Out");
			task4 = new JButton("Run");
		} else if (stat.toUpperCase().contains("DEX")) {
			task1 = new JButton("Run");
			task2 = new JButton("Play Sports");
			task3 = new JButton("Train Flexability");
			task4 = new JButton("Swim");
		} else if (stat.toUpperCase().contains("INT")) {
			task1 = new JButton("Read a Book");
			task2 = new JButton("Study");
			task3 = new JButton("Solve a Puzzle");
			task4 = new JButton("Research Topic");
		} else if (stat.toUpperCase().contains("WIS")) {
			task1 = new JButton("Read a Book");
			task2 = new JButton("Learn a life Skill");
			task3 = new JButton("Meditate");
			task4 = new JButton("Introspect");
		} else if (stat.toUpperCase().contains("CHAR")) {
			task1 = new JButton("Talk to a stranger");
			task2 = new JButton("Go out with friends");
			task3 = new JButton("Go to a social event");
			task4 = new JButton("Pratice speaking skills");
		} else if (stat.toUpperCase().contains("CON")) {
			task1 = new JButton("Exersise");
			task2 = new JButton("Sleep");
			task3 = new JButton("Meditate");
			task4 = new JButton("Eat WELL");
		} else if (stat.toUpperCase().contains("KIND")) {
			task1 = new JButton("Help someone out");
			task2 = new JButton("Volunteer");
			task3 = new JButton("Listen to others");
			task4 = new JButton("Do something kind");
			
		}
		task1.addActionListener(new buttonListener());
		task1.setBackground(new Color(212,175,55)); 
		task1.setForeground(new Color(146,0,10));
		task1.setSize(500,200);
		task2.addActionListener(new buttonListener());
		task2.setBackground(new Color(212,175,55)); 
		task2.setForeground(new Color(146,0,10));
		task2.setSize(200,100);
		task3.addActionListener(new buttonListener());
		task3.setBackground(new Color(212,175,55)); 
		task3.setForeground(new Color(146,0,10));
		task3.setSize(200,100);
		task4.addActionListener(new buttonListener());
		task4.setBackground(new Color(212,175,55)); 
		task4.setForeground(new Color(146,0,10));
		task4.setSize(200,100);
		task_area.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.CENTER;
		c.ipady = task_area.getHeight()/4 +1;
		c.ipadx = task_area.getWidth();
		c.gridx=0;
		c.gridy=0;
		task_area.add(task1,c);
		c.gridx=0;
		c.gridy=1;
		task_area.add(task2,c);
		c.gridx=0;
		c.gridy=2;
		task_area.add(task3,c);
		c.gridx=0;
		c.gridy=3;
		task_area.add(task4,c);
		add(task_area);
		setVisible(true);
	}
	
	private class buttonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Object source = e.getSource();
			// TODO Auto-generated method stub
			Object b = (Object)source;
			
			// This will be classes that pull up the next window to the stats
			// There we can actually implement some of the methods
			if (b.equals(task1)) {
				
			} else if (b.equals(task2)) {
				
			} else if (b.equals(task3)) {
				
			} else if (b.equals(task4)) {
				
			}
			
		}

}}
