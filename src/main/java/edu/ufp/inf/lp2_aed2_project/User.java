package edu.ufp.inf.lp2_aed2_project;


import java.util.ArrayList;

public class User implements Comparable {

  public String name;

  public Integer id;

  public Integer newAttr;

    /**
   * 
   * @element-type Route
   */
  public ArrayList route;

  @Override
  public int compareTo(Object o) {
    return 0;
  }
}