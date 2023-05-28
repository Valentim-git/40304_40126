package edu.ufp.inf.lp2_aed2_project;

import edu.princeton.cs.algs4.*;
import edu.ufp.inf.lp2_aed2_project.Conts.*;

public class Connection extends DirectedEdge {
  private Station startStation;
  private Station endStation;
  public ST<CostType, Double> weight = new ST<>();

  public Connection(Station startStation, Station endStation, int v, int w, double weight) {
    super(v, w, weight);
    this.startStation = startStation;
    this.endStation = endStation;
    initializeWeights();
  }

  private void initializeWeights() {
    weight.put(CostType.TIME, 10.0);
    weight.put(CostType.COST, 20.0);
    weight.put(CostType.DISTANCE, 30.0);
  }

  public Station getStartStation() {
    return startStation;
  }

  public void setStartStation(Station startStation) {
    this.startStation = startStation;
  }

  public Station getEndStation() {
    return endStation;
  }

  public void setEndStation(Station endStation) {
    this.endStation = endStation;
  }

  public ST<CostType, Double> getWeight() {
    return weight;
  }

  public void setWeight(ST<CostType, Double> weight) {
    this.weight = weight;
  }

  public static void main(String[] args) {
    Station start = new Station(1.0, 2.0, 1, StationType.CAR);
    Station end = new Station(3.0, 4.0, 2, StationType.AIRPORT);

    Connection connection = new Connection(start, end, 1, 2, 5.0);

    double timeWeight = connection.weight.get(CostType.TIME);
    double costWeight = connection.weight.get(CostType.COST);
    double distanceWeight = connection.weight.get(CostType.DISTANCE);

    System.out.println("Start Station: " + connection.getStartStation().getId());
    System.out.println("Start Station Latitude: " + connection.getStartStation().getLatitude());
    System.out.println("Start Station Longitude: " + connection.getStartStation().getLongitude());
    System.out.println("Start Station Type: " + connection.getStartStation().getType());

    System.out.println("End Station: " + connection.getEndStation().getId());
    System.out.println("End Station Latitude: " + connection.getEndStation().getLatitude());
    System.out.println("End Station Longitude: " + connection.getEndStation().getLongitude());
    System.out.println("End Station Type: " + connection.getEndStation().getType());

    System.out.println("Time Weight: " + connection.getWeight());
    System.out.println("Cost Weight: " + costWeight);
    System.out.println("Distance Weight: " + distanceWeight);
  }
}