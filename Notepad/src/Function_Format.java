import java.awt.Font;

public class Function_Format {
    NotepadGUI gui;
    String selectfontstyle;
    Font arial,sansserif,monospace;
    public Function_Format(NotepadGUI gui) {
    	this.gui=gui;
    }
    // TextWrapping Method
    public void wordWrap() {
    	if(gui.wordWrapOn==false)
    	{
    		gui.wordWrapOn=true;
    		gui.textarea.setLineWrap(true);
    		gui.textarea.setWrapStyleWord(true);
    		gui.iwrap.setText("WordWrap:On");
    		
    	}
    	else if(gui.wordWrapOn==true)
    	{
    		gui.wordWrapOn=false;
    		gui.textarea.setLineWrap(false);
    		gui.textarea.setWrapStyleWord(false);
    		gui.iwrap.setText("WordWrap:off");
    		
    	}
    }
    // FontSize and FontStyle
    public void fontsize(int fontsize) {
    	arial=new Font("Arial",Font.PLAIN,fontsize);
    	sansserif=new Font("SansSerif",Font.PLAIN,fontsize);
    	monospace =new Font("Monospace",Font.PLAIN,fontsize);
    	setFont(selectfontstyle); 
    }
    public void setFont(String font)
    { 
    	selectfontstyle=font;
    	switch(selectfontstyle)
    	{
    	case "Arial":
    		gui.textarea.setFont(arial);
    		break;
    	case "SansSerif":
    		gui.textarea.setFont(sansserif);
    		break;
    	case "Monospace":
    		gui.textarea.setFont(monospace );
    		break;
    	}
    }
}
