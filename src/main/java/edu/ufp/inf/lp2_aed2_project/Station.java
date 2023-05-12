package edu.ufp.inf.lp2_aed2_project;

public class Station {

  public Double latitude;

  public Double longitude;

  public Integer id;

  public StationType type;

  public Station(Double latitude, Double longitude, Integer id, StationType type) {
    this.latitude = latitude;
    this.longitude = longitude;
    this.id = id;
    this.type = type;
  }

  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public StationType getType() {
    return type;
  }

  public void setType(StationType type) {
    this.type = type;
  }
}