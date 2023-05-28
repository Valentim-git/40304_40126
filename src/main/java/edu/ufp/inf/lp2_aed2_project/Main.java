package edu.ufp.inf.lp2_aed2_project;

import edu.ufp.inf.lp2_aed2_project.Database.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        UserDataBase userdatabase = new UserDataBase();
        RouteDatabase routedatabase = new RouteDatabase();

        // Creating user objects
        User user1 = new User("John", 1, "ghjygh");
        User user2 = new User("Alice", 3, "etjatjgzetrj");
        User user3 = new User("Bob", null, "rakjmyjnnd");

        // Adding users to the database
        userdatabase.addUser(user1);
        userdatabase.addUser(user2);
        userdatabase.addUser(user3);

        // Retrieving users from the database
        System.out.println("User with id 1: " + userdatabase.getUser(1));
        System.out.println("User with id 2: " + userdatabase.getUser(2));
        System.out.println("User with id 3: " + userdatabase.getUser(3));

        // Create Route objects
        ArrayList<String> connections1 = new ArrayList<>();
        connections1.add("Porto");
        connections1.add("Lisboa");
        connections1.add("Ovar");

        ArrayList<String> connections2 = new ArrayList<>();
        connections2.add("Castelo branco");
        connections2.add("Maia");
        connections2.add("Algarve");


        //routedatabase.createRoute(user1, 20.5f, 20.0f,"today", connections1);
        //routedatabase.createRoute(user1, 50.0f, 100.0f,"tomorrow", connections2);
        //routedatabase.createRoute(user2, 2.0f, 2.0f,"yikes", connections1);
        //routedatabase.createRoute(user2, 3.0f, 3.0f,"ok", connections2);



        //user1.displayRoutes();
        //user2.displayRoutes();

        //routedatabase.deleteRoute(userdatabase.getUser(2),2);

        //user1.displayRoutes();

        //routedatabase.editRoute(user1,1,123.0f,132.0f,connections2);

        //user1.displayRoutes();





        // Add Route objects to the User's ArrayList of routes
        //user1.addRoute(route1);
        //user1.addRoute(route2);

        //routedatabase.deleteRoute(user1,2);

        // Show the current user's routes

        //user2.displayRoutes();

        //database.writeToFile("UserDatabaseWrite.txt");
        //database.readDataFromFile("UserDatabaseWrite.txt");
        routedatabase.writeRoutesToFile("RoutesDatabaseWrite.txt");

      /*  System.out.println("User with id 1: " + userdatabase.getUser(1));
        System.out.println("User with id 2: " + userdatabase.getUser(2));
        System.out.println("User with id 3: " + userdatabase.getUser(3));
      */
    }
}