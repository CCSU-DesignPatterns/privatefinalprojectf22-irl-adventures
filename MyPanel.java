package finalProjectfirst;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyPanel extends JPanel implements GuiComponent {
	
	List<GuiComponent> list = new ArrayList<GuiComponent>();

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void Update() {
		// TODO Auto-generated method stub
		for (int i =0; i < list.size();i++) {
			((MyPanel) list.get(i)).Update();
		}

	}

}
