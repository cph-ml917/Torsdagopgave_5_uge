//----------Task 4: Textbased menu for a game----------//

/*
In this program the user is presented with a list of actions to choose from. There will be two classes. The class GameMenu represents the menu and the other class Main instantiates and uses the menu.

The point of this excersise is

learning how to separate the code into client class and entity class.
learning how to work with ArrayLists
4.a Create an entity class called GameMenu.

4.b Add a private instance variable actions with the type ArrayList<String> to the class.

4.c Add a constructor with a parameter of the type ArrayList to the constructor. This is so that objects of the GameMenu class can be instantiated with a list of actions.(shown in step 4.f)
4.d In the GameMenu contructor, assign the list received as an argument to the instance variable actions.

4.e Create a client class, Main with a main method. (You will use this class to test the GameMenu class).

4.f In the main method create an ArrayList<String> called actions. Don't forget to import the ArrayList class. Add the following String values to the actions list:

	- "1) Start game"
	- "2) Resume game"
	- "3) Pause game"
	- "4) End game"

Tip for testing: You can test the actions ArrayList by printing one of the elements: 
System.out.print(actions.get(2)) // expected output: "Pause game"

4.g Still in the main method, instantiate theGameMenu class with the actions list as an argument to the constructor.

4.h In the GameMenu class add a method displayMenu() that prints out the elements of the actions attribute.

Hint: you may use a for-eachloop for printing the options

4.i From the main method in Main test the displayMenu() method by calling it on the GameMenu instance created in step 4.g.
*/


import java.util.ArrayList;

//4.e
public class Main {

  public static void main(String[] args) {

    //4.f
    ArrayList<String> actions = new ArrayList<String>();
    actions = new ArrayList<String>();
    actions.add("1) Start game");
    actions.add("2) Resume game");
    actions.add("3) Pause game");
    actions.add("4) End game");

    //4.g
    GameMenu myMenu = new GameMenu(actions);

    //4.i
    myMenu.displayMenu(); 
  }
}
