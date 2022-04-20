
public class FunctionEdit {
	NotepadGUI gui;

public FunctionEdit(NotepadGUI gui)

{
	this.gui=gui;
}
public void undo() {
	gui.editundo.undo();
}
public void redo() {
	gui.editundo.redo();
}

}
