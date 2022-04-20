import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;   
public class FunctionFile{
	
	NotepadGUI gui;
	String filename;
	String fileaddress;
	
	public FunctionFile(NotepadGUI gui)
	
	{
		this.gui=gui;
	}
	public void newfile() {
		gui.textarea.setText("");
		gui.window.setTitle("New");
		filename=null;
		fileaddress=null; 
	}
	public void open() {
		FileDialog fd=new FileDialog(gui.window, "open",FileDialog.LOAD);
		fd.setVisible(true);
		if(fd.getFile()!=null)
		{
			filename=fd.getFile();
			//Gets the directory of this file dialog.
			fileaddress=fd.getDirectory();
			gui.window.setTitle(filename);
		}
		try {
			BufferedReader br=new BufferedReader(new FileReader(fileaddress+filename));
			gui.textarea.setText("");
			String line=null;
			while((line=br.readLine())!=null) {
				gui.textarea.append(line+"\n");
			}
			br.close();
			
		}catch(Exception e) {
			System.out.println("File Not Found");
		}
	}
	public void save() {
		if(filename==null)
		{
			saveAs();
		}
		else {
			try {
				FileWriter fw=new FileWriter(fileaddress+filename);
				fw.write(gui.textarea.getText());
				gui.window.setTitle(filename);
				fw.close();
				
			}catch(Exception e) {
				System.out.println("Something wrong");
				
			}
		}
		
	}
	public void saveAs() {
		FileDialog fd=new FileDialog(gui.window, "Save",FileDialog.SAVE );
		fd.setVisible(true);
	
		if(fd.getFile()!=null)
		{
			filename=fd.getFile();
			fileaddress=fd.getDirectory();
			gui.window.setTitle(filename);
			}
		try {
			FileWriter fw=new FileWriter(fileaddress+filename);
			fw.write(gui.textarea.getText());
			fw.close();
		}catch(Exception e) {
			System.out.println("Something wrong");
		}
	}
	public void exit() {
		System.exit(0);
	}
}
