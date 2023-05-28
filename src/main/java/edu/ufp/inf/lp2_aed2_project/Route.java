package edu.ufp.inf.lp2_aed2_project;

import java.util.ArrayList;

public class Route {
    private Integer id;
    private Integer userId;
    private float price;
    private float time;
    private String date;
    private float timestamp;
    private ArrayList<String> connections;

    public Route(Integer id, float price, float time, String date, float timestamp, ArrayList<String> connections) {
        this.id = id;
        this.price = price;
        this.time = time;
        this.date = date;
        this.connections = connections;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public float getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(float timestamp) {
        this.timestamp = timestamp;
    }

    public ArrayList<String> getConnections() {
        return connections;
    }

    public void setConnections(ArrayList<String> connections) {
        this.connections = connections;

    }

    public String toString() {
        return "Route{" + "Price='" + price + '\'' + ", Time=" + time + ", Connections='" + connections + '\'' + '}';
    }



}