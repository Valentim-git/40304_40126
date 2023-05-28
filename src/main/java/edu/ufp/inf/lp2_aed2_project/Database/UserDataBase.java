package edu.ufp.inf.lp2_aed2_project.Database;

import edu.princeton.cs.algs4.*;
import edu.ufp.inf.lp2_aed2_project.*;
import edu.ufp.inf.lp2_aed2_project.Conts.Const;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class UserDataBase {

  private final ST<Integer, User> userDatabase;
  private ST networkST = new ST<>();

  public UserDataBase() {
    userDatabase = new ST<>();
  }
  public ST<Integer, User> getUserDatabase() {
    return userDatabase;
  }
  /**
   * Checks if user with current id already exists in the database.
   * If id passed is null create user in next id available.
   * If none of above creates user with given id.
   **/
  public User addUser(User user) {
    Integer id = user.getId();
    if (id != null && userDatabase.contains(id)) {
      System.out.println("User with ID already exists: " + userDatabase.get(id));
      return userDatabase.get(id); // User with the same ID already exists, return the existing user
    }
    if (user.getId() == null) {
      User useruser = addUserOnNextId(user);
      return useruser;
    }
    user.setId(user.getId());
    userDatabase.put(user.getId(), user);

    return user;
  }

  public User addUserOnNextId(User user) {
    int nextId = getNextAvailableId();
    user.setId(nextId);
    userDatabase.put(nextId, user);
    return user;
  }

  private int getNextAvailableId() {
    int nextId = 1;
    while (userDatabase.contains(nextId)) {
      nextId++;
    }
    return nextId;
  }

  public User getUser(Integer id) {

    if (userDatabase.contains(id))
      return userDatabase.get(id);
    else
      return null;
  }

  public void removeUser(Integer id) {
    User e = userDatabase.get(id);
    e.clearAll();
    userDatabase.delete(id);
  }

  public void writeToFile(String fileName) {
    String folderPath = Const.inputPath;

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(folderPath + "/" + fileName))) {
      for (Integer id : userDatabase.keys()) {
        User user = userDatabase.get(id);
        String line = "Name:" + user.getName() + "," + "ID:" + id + "," + "Password:" + user.getPassword();
        writer.write(line);
        writer.newLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void readDataFromFile(String fileName) {
    String folderPath = Const.inputPath;

    try (BufferedReader reader = new BufferedReader(new FileReader(folderPath + "/" + fileName))) {
      String line;
      while ((line = reader.readLine()) != null) {

        String[] data = line.split(",");
        String name = data[0].split(":")[1].trim();
        Integer id = Integer.parseInt(data[1].split(":")[1].trim());
        String password = data[2].split(":")[1].trim();

        if (userDatabase.contains(id)) {
          System.out.println("User with ID " + id + " already exists");
          continue;
        }

        User user = new User(name, id, password);
        userDatabase.put(id, user);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }


}

