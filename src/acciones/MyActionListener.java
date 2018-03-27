package acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenuItem;

import vista.ParaUI;

public class MyActionListener implements ActionListener{
	
	private ParaUI paraUI;

	public MyActionListener(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if (((JButton) arg0.getSource()).getName() == "btnJugar") {
			
		} else if (((JMenuItem) arg0.getSource()).getName() == "facil") {
			//btnJugar.setEnabled(true);
		} else {
			//paraUI.pseudoMain(((JButton) e.getSource()).getName());
		}
	}

}
