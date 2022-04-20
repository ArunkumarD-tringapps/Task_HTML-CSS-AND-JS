import javax.swing.*;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.UndoManager;

import java.awt.event.*;  
public class NotepadGUI implements ActionListener {
	JFrame window;
	//TextArea
	JTextArea textarea;
	JScrollPane scroll;
	//TopMenuBar
	JMenuBar menubar;
	JMenu menufile,menuEdit,menuFormat,menuBackGroundColor;
	//FileSubMenu
	JMenuItem iNew,iOpen,iSave,iSaveAs,iExit;
	//FormatSubMenu
	JMenu menuFont,menuFontSize;
	boolean wordWrapOn=false;
	JMenuItem iwrap,ifontArial,ifontss,ifontms,ifontsize8,ifontsize12,ifontsize14,ifontsize16,ifontsize20,
	            ifontsize24,ifontsize28;
	// BackgroundcolorMenu
	JMenuItem iwhite,iblack,ired;
	//Edit subMenu
	JMenuItem iundo,iredo;
	FunctionFile file=new FunctionFile(this);
	Function_Format format=new Function_Format(this);
	FunctionColor backgroundcolor= new FunctionColor(this);
	UndoManager editundo=new UndoManager();
	FunctionEdit  edit=new FunctionEdit(this);  
	public static void main(String[]args)
	{
		new NotepadGUI();
	}
	public NotepadGUI() {
		createwindow();  
		createtextarea();
		createscroll();
		createMenuBar();
		createFileSubMenu();
		createEditMenu();
		createFormatMenu();
		//set default fontStyle
		format.selectfontstyle="SansSerif";
		//set default fontSize
		format.fontsize(12);
		format.wordWrap();
		createBackgroundMenu();
		backgroundcolor.changeBackgroundColor("white");
		window.setVisible(true);
	}
	//create workspace 
	public void createwindow() {
		window=new JFrame("Notes");
		window.setSize(800,600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	// create textArea method
	public void createtextarea() {
		textarea=new JTextArea();
		textarea.getDocument().addUndoableEditListener(new UndoableEditListener()
				{
				@Override
				public void undoableEditHappened(UndoableEditEvent e) {
					// TODO Auto-generated method stub
					editundo.addEdit(e.getEdit());
				}
				});
		window.add(textarea);
	}
	// create scroll horizontal and vertical  method
	public void createscroll() {
		scroll=new JScrollPane(textarea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setBorder(BorderFactory.createEmptyBorder());
		window.add(scroll);
		
	}
	// MainMenubar method
	public void createMenuBar() {
		menubar=new JMenuBar();
		window.setJMenuBar(menubar);
		menufile=new JMenu("File");
		menubar.add(menufile);
		menuEdit=new JMenu("Edit");
		menubar.add(menuEdit);
		menuFormat=new JMenu("Format");
		menubar.add(menuFormat);
		menuBackGroundColor=new JMenu("BackGroundColor");
		menubar.add(menuBackGroundColor);
	}
	// create SubMenu button for file like new,open,save,saveAs,exit
	public void createFileSubMenu() {
		iNew=new JMenuItem("New");
		iNew.addActionListener(this);
		iNew.setActionCommand("New");
		menufile.add(iNew);
		iOpen=new JMenuItem("Open");
		iOpen.addActionListener(this);
		iOpen.setActionCommand("Open");
		menufile.add(iOpen);
		iSave=new JMenuItem("Save");
		iSave.addActionListener(this);
		iSave.setActionCommand("Save");
		menufile.add(iSave);
		iSaveAs=new JMenuItem("SaveAs");
		iSaveAs.addActionListener(this);
		iSaveAs.setActionCommand("SaveAs");
		menufile.add(iSaveAs);
		iExit=new JMenuItem("Exit");
		iExit.addActionListener(this);
		iExit.setActionCommand("Exit");
		menufile.add(iExit);	
	}
	// Edit subMenu button undo and Redo method
	public void createEditMenu() {
		iundo=new JMenuItem("Undo");
		iundo.addActionListener(this);
		iundo.setActionCommand("Undo");
		menuEdit.add(iundo);
		iredo=new JMenuItem("Redo");
		iredo.addActionListener(this);
		iredo.setActionCommand("redo");
		menuEdit.add(iredo);
	}
	//create formatSubMenu button for textWrap,FontStyle,FontSize method
	public void createFormatMenu() {
		iwrap=new JMenuItem("WordWrap:off");
		iwrap.addActionListener(this);
		iwrap.setActionCommand("WordWrap");
		menuFormat.add(iwrap);
		//For FontStyle Arial,SansSerif,MonoSpace
		menuFont=new JMenu("FontStyle");
		menuFormat.add(menuFont);
		ifontArial=new JMenuItem("Arial");
		ifontArial.addActionListener(this);
		ifontArial.setActionCommand("Arial");
		menuFont.add(ifontArial);
		ifontss=new JMenuItem("SansSerif");
		ifontss.addActionListener(this);
		ifontss.setActionCommand("SansSerif");
		menuFont.add(ifontss);
		ifontms=new JMenuItem("Monospace");
		ifontms.addActionListener(this);
		ifontms.setActionCommand("Monospace");
		menuFont.add(ifontms);
		// for FontSize 8,12,16,20,24,28
		menuFontSize=new JMenu("FontSize");
		menuFormat.add(menuFontSize);
		ifontsize8=new JMenuItem("8");
		ifontsize8.addActionListener(this);
		ifontsize8.setActionCommand("fontsize8");
		menuFontSize.add(ifontsize8);
		ifontsize12=new JMenuItem("12");
		ifontsize12.addActionListener(this);
		ifontsize12.setActionCommand("fontsize12");
		menuFontSize.add(ifontsize12);
		ifontsize16=new JMenuItem("16");
		ifontsize16.addActionListener(this);
		ifontsize16.setActionCommand("fontsize16");
		menuFontSize.add(ifontsize16);
		ifontsize20=new JMenuItem("20");
		ifontsize20.addActionListener(this);
		ifontsize20.setActionCommand("fontsize20");
		menuFontSize.add(ifontsize20);
		ifontsize24=new JMenuItem("24");
		ifontsize24.addActionListener(this);
		ifontsize24.setActionCommand("fontsize24");
		menuFontSize.add(ifontsize24);
		ifontsize28=new JMenuItem("28");
		ifontsize28.addActionListener(this);
		ifontsize28.setActionCommand("fontsize28");
		menuFontSize.add(ifontsize28);	
	}
	// Add background color white,black,red 
	public void createBackgroundMenu() {
		iwhite=new JMenuItem("white");
		iwhite.addActionListener(this);
		iwhite.setActionCommand("white");
		menuBackGroundColor.add(iwhite);
		iblack=new JMenuItem("Black");
		iblack.addActionListener(this);
		iblack.setActionCommand("Black");
		menuBackGroundColor.add(iblack);
		ired=new JMenuItem("Red");
		ired.addActionListener(this);
		ired.setActionCommand("Red");
		menuBackGroundColor.add(ired);
	}
	// actionPerformed() method is invoked automatically whenever you click on the registered component.
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String Actioncommand=e.getActionCommand();
		switch(Actioncommand) {
		case "New":
			file.newfile();
			break;
		case "Open":
			file.open();
			break;
		case "Save":
			file.save();
			break;
		case "SaveAs":
			file.saveAs();
			break;
		case "Exit":
			file.exit();
			break;
		case "Undo":
			edit.undo();
			break;
		case "Redo":
			edit.redo();
			break;
		case "WordWrap":
			format.wordWrap();
			break;
		case "Airal":
			format.setFont(Actioncommand);
			break;
		case "SansSerif":
			format.setFont(Actioncommand);
			break;
		case "Monospace":
			format.setFont(Actioncommand);
			break; 	
		case "fontsize8":
			format.fontsize(8);
			break;
		case "fontsize12":
			format.fontsize(12);
			break;
		case "fontsize16":
			format.fontsize(16);
			break;
		case "fontsize20":
			format.fontsize(20);
			break;
		case "fontsize24":
			format.fontsize(24);
			break;
		case "fontsize28":
			format.fontsize(28);
			break;
		case "white":
			backgroundcolor.changeBackgroundColor(Actioncommand);
			break;
		case "Black":
			backgroundcolor.changeBackgroundColor(Actioncommand);
			break;
		case "Red":
			backgroundcolor.changeBackgroundColor(Actioncommand);
			break;
		}
		
	}
}
