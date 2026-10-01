package MicroservicesDesignPattern.BehavioralDesignPatterns.MementoMethodDesignPatterns;

import java.util.Stack;

public class MementoPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Step 4: Client Code
		TextEditor editor = new TextEditor();
		EditorHistory history = new EditorHistory();
		// Set initial text and save state
		editor.setText("Version 1: Hello World Ashutosh");
		history.saveState(editor);
		System.out.println("Current Text: "+editor.getText());
		
		// Update text and save new state
		editor.setText("Version 2: Hello World");
		history.saveState(editor);
		System.out.println("Current Text: "+editor.getText());
		
		 // Further update without saving state
		editor.setText("Version 3: Hello Design Patterns");
		System.out.println("Current Text: "+editor.getText());
		
		// Undo last change
		history.undo(editor);
		  System.out.println("After undo, Current Text: " + editor.getText());
		  
		// Undo further change
		  
		  history.undo(editor);
		  System.out.println("After second undo, Current Text: " + editor.getText());


	}

}
//Step 1: Memento Class
//Memento class stores the state of the Originator

class EditorMemento{
	private final String text;
	
	public EditorMemento(String text) {
		this.text=text;
	}
	public String getText() {
		return text;
	}
}
class TextEditor{
	private String text;
	
	public void setText(String text) {
		this.text=text;
	}
	public String getText() {
		return text;
	}
	//Creates a memento of the current state
	public EditorMemento save() {
		return new EditorMemento(text);
	}
	// Restores the state from the memento
	public void restore(EditorMemento memento) {
		text=memento.getText();
	}
}
//Step 3: Caretaker Class (History Manager)
class EditorHistory {
	private Stack<EditorMemento> history = new Stack<>();
	
	public void saveState(TextEditor textEditor) {
		history.push(textEditor.save());
	}
	public void undo(TextEditor textEditor) {
		if(!history.isEmpty()) {
			EditorMemento memento = history.pop();
			textEditor.restore(memento);
		}
	}
}





























