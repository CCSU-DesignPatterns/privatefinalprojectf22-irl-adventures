package userinterface;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class TaskSubmition extends JFrame implements SubWindow {
	static JTextField minst;
	static JButton b2;    // submit button
	    public TaskSubmition(String task){
	    //Create the frame;what it does on close, title, size
	    int PANEL_WIDTH =200;
	    int PANEL_HEIGHT = 175;
	    this.setName(task);
	    setTitle(task);
	    setSize(PANEL_WIDTH,PANEL_HEIGHT);
	    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    setBackground(new Color(4,79,103));
	    //create the panel to put in the frame
	    JPanel p = new JPanel();
	    p.setLayout(new BorderLayout());
	    p.setBackground(new Color(4,79,103));
	    JLabel label1 = new JLabel ("Hours:");
	    minst = new JTextField(15);
	    b2 = new JButton ("Submit");
	    b2.setBackground(new Color(212,175,55));
		b2.setForeground(new Color(146,0,10));
	    b2.addActionListener(new ButtonListener());
	    
	    //Create a panel for each part of the frame as to control what goes where
	    JPanel n = new JPanel(); // for the north part
	    JLabel title = new JLabel (task);
	    n.add(title);
	    JPanel s = new JPanel(); // for the south
	    JPanel c = new JPanel(); // for the center
	    c.setLayout(new GridLayout(3,1));
	    c.setBackground(new Color(4,79,103));
	    JPanel e = new JPanel(); // for the right
	    e.setBackground(new Color(4,79,103));
	    e.setLayout(new GridLayout(3,1));
	    JPanel w = new JPanel(); // for the left
	    w.setBackground(new Color(4,79,103));
	    w.setLayout(new GridLayout(3,1));
	    
	    //add object to panel for the border
	    n.add(title);
	    c.add(minst);
	    s.add(b2);
	    w.add(label1);
	    // add all panels to the frame panel
	    p.add(n,BorderLayout.NORTH);
	    p.add(e,BorderLayout.EAST);
	    p.add(c,BorderLayout.CENTER);
	    p.add(w,BorderLayout.WEST);
	    p.add(s,BorderLayout.SOUTH);
	    //add panel to frame
	    add(p);
	    //set to visible
	    setVisible(true);
	    }
}
