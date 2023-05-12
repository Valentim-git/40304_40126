package edu.ufp.inf.lp2_aed2_project;

import edu.princeton.cs.algs4.*;

public class Connection extends DirectedEdge {

  public ConnectionType typeConnection;

  public ST weight = new ST<>();


  /**
   * Initializes a directed edge from vertex {@code v} to vertex {@code w} with
   * the given {@code weight}.
   *
   * @param v      the tail vertex
   * @param w      the head vertex
   * @param weight the weight of the directed edge
   * @throws IllegalArgumentException if either {@code v} or {@code w}
   *                                  is a negative integer
   * @throws IllegalArgumentException if {@code weight} is {@code NaN}
   */
  public Connection(int v, int w, double weight) {
    super(v, w, weight);
  }
}