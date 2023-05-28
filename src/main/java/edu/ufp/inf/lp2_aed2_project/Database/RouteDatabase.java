package edu.ufp.inf.lp2_aed2_project.Database;

import edu.princeton.cs.algs4.*;
import edu.ufp.inf.lp2_aed2_project.*;
import edu.ufp.inf.lp2_aed2_project.Conts.*;

import java.io.*;
import java.util.ArrayList;
import java.time.LocalTime;

public class RouteDatabase {
    private ST<Integer, Route> routeDatabase;


    public RouteDatabase() {
        this.routeDatabase = new ST<>();
    }

    public float getCurrentTimeOfDay() {
        LocalTime currentTime = LocalTime.now();
        int hour = currentTime.getHour();
        int minute = currentTime.getMinute();
        float timeOfDay = hour + (minute / 60.0f);
        return timeOfDay;
    }

    public Route createRoute(User user, float price, float time, String date, ArrayList<String> connections) {
        // Check if the user already has a route with the same attributes
        for (Route route : user.getRoutes()) {
            if (route.getPrice() == price && route.getTime() == time && route.getConnections().equals(connections)) {
                // Route with the same attributes already exists for the user, return null or throw an exception
                return null; // or throw an exception indicating duplicate route
            }
        }

        int userId = user.getId();
        int maxRouteId = 0;

        // Find the maximum route ID for the user
        for (Integer routeId : routeDatabase.keys()) {
            Route route = routeDatabase.get(routeId);
            if (route != null && route.getUserId().equals(userId) && route.getId() > maxRouteId) {
                maxRouteId = route.getId();
            }
        }

        int nextRouteId = maxRouteId + 1;
        float timestamp = getCurrentTimeOfDay();
        Route route = new Route(nextRouteId, price, time, date, timestamp, connections);
        route.setUserId(userId); // Set the userId of the route
        routeDatabase.put(nextRouteId, route);
        user.addRoute(route); // Associate route to user
        return route;
    }

    public void deleteRoute(User user, int routeId) {
        boolean userExists = user != null;

        if (!userExists) {
            System.out.println("User does not exist.");
            return;
        }
        boolean routeExists = false;
        for (Route route : user.getRoutes()) {
            if (route.getId() == routeId) {
                routeExists = true;
                user.removeRoute(route);
                break;
            }
        }
        if (routeExists) {
            System.out.println("Route with ID " + routeId + " has been removed for the user: " + user.getName());
        } else {
            System.out.println("Route with ID " + routeId + " not found for the user: " + user.getName());
        }
    }
    public void editRoute(User user, int routeId, float newPrice, float newTime, ArrayList<String> newConnections) {
        boolean userExists = user != null;

        if (!userExists) {
            System.out.println("User does not exist.");
            return;
        }

        boolean routeExists = false;
        for (Route route : user.getRoutes()) {
            if (route.getId() == routeId) {
                routeExists = true;
                route.setPrice(newPrice);
                route.setTime(newTime);
                route.setConnections(newConnections);
                System.out.println("Route with ID " + routeId + " has been edited for the user: " + user.getName());
                break;
            }
        }

        if (!routeExists) {
            System.out.println("Route with ID " + routeId + " not found for the user: " + user.getName());
        }
    }
    public void writeRoutesToFile(String filename) {
        String folderPath = Const.inputPath;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(folderPath + "/" + filename))){
            for (Integer routeId : routeDatabase.keys()) {
                Route route = routeDatabase.get(routeId);
                writer.write("Route ID: " + route.getId() + "\n");
                writer.write("Price: " + route.getPrice() + "\n");
                writer.write("Time: " + route.getTime() + "\n");
                writer.write("Connections: " + route.getConnections() + "\n");
                writer.write("Timestamp: " + route.getTimestamp() + "\n");
                writer.write("\n");
            }
            System.out.println("Routes have been written to the file: " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while writing the routes to the file: " + e.getMessage());
        }
    }
}
