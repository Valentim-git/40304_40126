package edu.ufp.inf.lp2_aed2_project.Database;

import edu.princeton.cs.algs4.ST;
import edu.ufp.inf.lp2_aed2_project.Connection;

public class ConnectionDatabase {

    private final ST<Integer, Connection> connectionDatabase;

    public ConnectionDatabase(ST<Integer, Connection> connectionDatabase) {
        this.connectionDatabase = connectionDatabase;
    }

}
