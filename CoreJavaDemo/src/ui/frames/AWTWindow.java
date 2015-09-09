package ui.frames;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTWindow extends Frame {
	AWTWindow() {
		Button b = new Button("click me");
		b.setBounds(30, 100, 80, 30); // setting button position

		add(b);  			// adding button into frame
		setSize(300, 300);	// frame size 300 width and 300 height
		setLayout(null);		// no layout manager
		setVisible(true);	// now frame will be visible, by default not visible

	}

	public static void main(String args[]) {
		AWTWindow f = new AWTWindow();
				
		f.addWindowListener(new WindowAdapter() {   //annonymous class
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		} ); 
	}
}

//Defining class similar to above annonymous class
class MyAnnonymousDefination extends WindowAdapter {
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}
