package edu.ufp.inf.lp2_aed2_project;

import edu.ufp.inf.lp2_aed2_project.Conts.ConnectionType;

import java.util.ArrayList;

public class User implements Comparable {
  private String name;
  private Integer id;
  private String password;
  private ConnectionType favoriteConnection;
  private ArrayList<Route> routes;

  public User(String name, Integer id, String password) {
    this.name = name;
    this.id = id;
    this.password = password;
    this.favoriteConnection = favoriteConnection;
    this.routes = new ArrayList<>();
  }

  @Override
  public int compareTo(Object o) {
    return 0;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public ConnectionType getFavoriteConnection() {
    return favoriteConnection;
  }

  public void setFavoriteConnection(ConnectionType favoriteConnection) {
    this.favoriteConnection = favoriteConnection;
  }

  public void addRoute(Route route) {
    routes.add(route);
  }
  public void removeRoute(Route route) {
    routes.remove(route);
  }
  public ArrayList<Route> getRoutes() {
    return routes;
  }
  public void showRoutes() {

    System.out.println("User: " + name + " (ID: " + id + ") Routes:");
    for (Route route : routes) {
      System.out.println(route);
    }
  }

  public void displayRoutes() {

    if (routes.isEmpty()) {
      System.out.println("No routes found for the user: " + name);
      return;
    }

    for (Route route : routes) {

      System.out.println("User ID: " + id);
      System.out.println("Route ID: " + route.getId());
      System.out.println("Price: " + route.getPrice());
      System.out.println("Time: " + route.getTime());
      System.out.println("Connections: " + route.getConnections());
      System.out.println("Timestamp: " + route.getTimestamp());
      System.out.println("---------------------------");
    }
  }
  public void clearAll(){
    routes.clear();
    name=null;
    id=null;
    password=null;
    favoriteConnection=null;
  }

  @Override
  public String toString() {
    return "User{" + "name='" + name + '\'' + ", id=" + id + ", password='" + password + '\'' + '}';
  }
}