package edu.ufp.inf.lp2_aed2_project;

import edu.princeton.cs.algs4.*;

public class Network extends EdgeWeightedDigraph {

  public Station startStation;

  public Station endStation;

  public ST costs=new ST<>();

  public Network(int V, int E) {
    super(V, E);
  }
}