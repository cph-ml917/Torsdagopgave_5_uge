import java.util.ArrayList;
import java.util.Scanner;

//4.a
public class GameMenu {
	//4.b 
	private ArrayList<String> actions;

	//4.c
	public GameMenu(ArrayList<String> actions) {
		//4.d
		this.actions = actions;
	}

	//4.h
	public void displayMenu() {
		//System.out.println("Choose an option");
    	for (String action : actions) {
    		System.out.println(action);
    	}
    }
    
    //5.a + 5.b + 5c
    public String getAction() {
    	System.out.println("Type a number to choose an action:");
    	displayMenu();
    	Scanner scanner = new Scanner(System.in);
    	String choice = scanner.nextLine();
    	return choice;
    }
}
