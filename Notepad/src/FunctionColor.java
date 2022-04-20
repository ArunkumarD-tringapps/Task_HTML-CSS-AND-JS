import java.awt.Color;

public class FunctionColor {
	NotepadGUI gui;
	String color;

public FunctionColor(NotepadGUI gui)

{
	this.gui=gui;
}
public void changeBackgroundColor(String color) {
	switch(color)
	{
	case "white":
		gui.window.getContentPane().setBackground(Color.white);
		gui.textarea.setBackground(Color.white);
		gui.textarea.setForeground(Color.black);
		break;
	case "Black":
		gui.window.getContentPane().setBackground(Color.black);
		gui.textarea.setBackground(Color.black);
		gui.textarea.setForeground(Color.white);
		break;
	case "Red":
		gui.window.getContentPane().setBackground(Color.red);
		gui.textarea.setBackground(Color.red);
		gui.textarea.setForeground(Color.white);
		break;
		
	}
	
}

}