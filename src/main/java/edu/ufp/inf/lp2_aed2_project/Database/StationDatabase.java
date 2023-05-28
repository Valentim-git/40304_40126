package edu.ufp.inf.lp2_aed2_project.Database;

import edu.princeton.cs.algs4.ST;
import edu.ufp.inf.lp2_aed2_project.*;

public class StationDatabase {
    private final ST<Integer, Station> stationDatabase;

    public StationDatabase(ST<Integer, Station> stationDatabase) {
        this.stationDatabase = stationDatabase;
    }
}
