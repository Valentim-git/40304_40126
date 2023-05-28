package edu.ufp.inf.lp2_aed2_project.FX;

import edu.princeton.cs.algs4.*;
import edu.ufp.inf.lp2_aed2_project.*;
import edu.ufp.inf.lp2_aed2_project.Database.UserDataBase;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //random_main_edge();

        UserDataBase database = new UserDataBase();

        // Creating user objects
        User user1 = new User("John", 1, "ghjygh");
        User user2 = new User("Alice", 2, "etjatjgzetrj");
        User user3 = new User("Bob", 3, "rakjmyjnnd");

        // Adding users to the database
        database.addUser(user1);
        database.addUser(user2);
        database.addUser(user3);

        // Retrieving users from the database
        System.out.println("User with id 2: " + database.getUser(2));
        System.out.println("User with id 3: " + database.getUser(3));

        // Trying to retrieve the removed user
        System.out.println("User with id 2: " + database.getUser(1));

        // Create Route objects
        ArrayList<String> connections1 = new ArrayList<>();
        connections1.add("Porto");
        connections1.add("Lisboa");
        connections1.add("Ovar");
        //Route route1 = new Route(50.0f, 2.5f, connections1);

        ArrayList<String> connections2 = new ArrayList<>();
        connections2.add("Castelo branco");
        connections2.add("Maia");
        connections2.add("Algarve");
        //Route route2 = new Route(75.0f, 3.0f, connections2);

        // Add Route objects to the User's ArrayList of routes
        //user1.addRoute(route1);
        //user1.addRoute(route2);

        // Removing a user from the database
        database.removeUser(2);

        System.out.println("User with id 1: " + database.getUser(2));

        // Show the current user's routes
        user2.showRoutes();

        System.out.println(database.toString());
    }

    private static void random_main_edge(){
        // Create a random graph
        int V = 10; // Number of vertices
        int E = 50; // Number of edges
        EdgeWeightedDigraph graph = createRandomGraph(V, E);

        // Print the graph
        printGraph(graph);
    }

    private static EdgeWeightedDigraph createRandomGraph(int V, int E) {
        EdgeWeightedDigraph graph = new EdgeWeightedDigraph(V);
        Random random = new Random();

        for (int i = 0; i < E; i++) {
            int v = random.nextInt(V);
            int w = random.nextInt(V);
            double weight = random.nextInt();

            DirectedEdge e = new DirectedEdge(v, w, weight);

            graph.addEdge(e);
        }

        return graph;
    }

    private static void printGraph(EdgeWeightedDigraph graph) {
        int numVertices = graph.V();
        int numEdges = graph.E();

        StdOut.println("Graph with " + numVertices + " vertices and " + numEdges + " edges:");
        for (int v = 0; v < numVertices; v++) {
            StdOut.print(v + ": ");
            for (edu.princeton.cs.algs4.DirectedEdge edge : graph.adj(v)) {
                int w = edge.to();
                double weight = edge.weight();
                StdOut.print("(" + w + ", " + weight + ") ");
            }
            StdOut.println();
        }
    }
}
