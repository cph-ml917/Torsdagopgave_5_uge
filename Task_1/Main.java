//----------Task 1----------//

/*
In this exercise you will write an entity class called Team and a client class called Main. You will create private attributes int the entity class and give it a parameterized constructor, a toString() and a setter method.

1.a Create a class Main with a main method.

1.b Create an entity class called Team.

1.c Add a private instance variable/attribute to Team to hold the team's name.

1.d Add another private instance variable to hold the team's rank (some number).

1.e Add yet another private instance variable to hold the names of players in the team.

1.f Add a constructor with a parameter, so that the Team can be instantiated with a team name. Make sure the parameter value is assigned to the mathcing instance variable in the constructor.

Hint
public Team(String teamName)

1.g In the main method in the Main class, create an instance of the Team class (i.e. instantiate the Team class).

1.h In the Team class add a method called setRank() that takes a number as parameter and assigns it to the rank attribute.

1.i From the main method, call the method setRank() on the instance of Team you created in step 1.g with a number of your choice.

1.j In the Team class add a toString() method that returns a String formated like this:

"Hold: De Uovervindelige Rang: 3"

(Precise wording will depend on the name and rank of the Team instance you created in step 1.g)

1.k From the main method, create 5 more Team instances and print them using their toString() method.

1.l Previously you created an ArrayList of team playernames as an attribute in the Team class. Now add a new method to the class, which adds a name to this list. Call the method addPlayer() and give it a suitable parameter.

1.m Adjust the toString() method so that each playername is a part of the returned String - preferably with each name on it's own line.
*/


//1.a
public class Main {
    public static void main(String[] args) {

        //1.g
        Team teamBlue = new Team("Blue");

        //1.i
        teamBlue.setRank(3);

        //1.j
        System.out.println(teamBlue.toString());

        //1.k
        String[] teams = {"RED", "YELLOW", "GREEN", "ORANGE", "PINK"};
        int[] rankOfTeam = {2, 4, 6, 1, 5};

        Team[] team = new Team[teams.length];

        for (int i = 0; i < teams.length; i++) {
            team[i] = new Team(teams[i]);
            team[i].setRank(rankOfTeam[i]);
            System.out.println(team[i].toString());
        }

        teamBlue.addPlayer("Player One");
        teamBlue.addPlayer("Player Two");
        teamBlue.addPlayer("Player Three");
        teamBlue.addPlayer("Player Four");
        teamBlue.addPlayer("Player Five");

        System.out.println(teamBlue.toString());
    }
}
