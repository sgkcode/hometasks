// version: 1.1
// made by Vitali Shulha
// 4-Jan-2019

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import models.MilitaryType;
import planes.ExperimentalPlane;
import planes.MilitaryPlane;
import planes.PassengerPlane;
import planes.Plane;

public class Airport {

  private List<? extends Plane> planes;

  public List<PassengerPlane> getPassengerPlanes() {
    List<PassengerPlane> passengerPlanes = new ArrayList<>();
    for (Plane plane : planes) {
      if (plane instanceof PassengerPlane) {
        passengerPlanes.add((PassengerPlane) plane);
      }
    }
    return passengerPlanes;
  }

  public List<MilitaryPlane> getMilitaryPlanes() {
    List<MilitaryPlane> militaryPlanes = new ArrayList<>();
    for (Plane plane : planes) {
      if (plane instanceof MilitaryPlane) {
        militaryPlanes.add((MilitaryPlane) plane);
      }
    }
    return militaryPlanes;
  }

  public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
    List<PassengerPlane> passengerPlanes = getPassengerPlanes();
    PassengerPlane planeWithMaxCapacity = passengerPlanes.get(0);
    for (PassengerPlane passengerPlane : passengerPlanes) {
      if (passengerPlane.getPassengersCapacity() > planeWithMaxCapacity.getPassengersCapacity()) {
        planeWithMaxCapacity = passengerPlane;
      }
    }
    return planeWithMaxCapacity;
  }

  public List<MilitaryPlane> getTransportMilitaryPlanes() {
    List<MilitaryPlane> transportMilitaryPlanes = new ArrayList<>();
    List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
    for (MilitaryPlane plane : militaryPlanes) {
      if (plane.getType() == MilitaryType.TRANSPORT) {
        transportMilitaryPlanes.add(plane);
      }
    }
    return transportMilitaryPlanes;
  }

  public List<MilitaryPlane> getBomberMilitaryPlanes() {
    List<MilitaryPlane> bomberMilitaryPlanes = new ArrayList<>();
    List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
    for (MilitaryPlane plane : militaryPlanes) {
      if (plane.getType() == MilitaryType.BOMBER) {
        bomberMilitaryPlanes.add(plane);
      }
    }
    return bomberMilitaryPlanes;
  }

  public List<ExperimentalPlane> getExperimentalPlanes() {
    List<ExperimentalPlane> experimentalPlanes = new ArrayList<>();
    for (Plane plane : planes) {
      if (plane instanceof ExperimentalPlane) {
        experimentalPlanes.add((ExperimentalPlane) plane);
      }
    }
    return experimentalPlanes;
  }

  public Airport sortByMaxDistance() {
    Collections.sort(planes, new Comparator<Plane>() {
      public int compare(Plane o1, Plane o2) {
        return o1.getMaxFlightDistance() - o2.getMaxFlightDistance();
      }
    });
    return this;
  }

  public Airport sortByMaxSpeed() {
    Collections.sort(planes, new Comparator<Plane>() {
      public int compare(Plane o1, Plane o2) {
        return o1.getMaxSpeed() - o2.getMaxSpeed();
      }
    });
    return this;
  }

  public Airport sortByMaxLoadCapacity() {
    Collections.sort(planes, new Comparator<Plane>() {
      public int compare(Plane o1, Plane o2) {
        return o1.getMinLoadCapacity() - o2.getMinLoadCapacity();
      }
    });
    return this;
  }

  public List<? extends Plane> getPlanes() {
    return planes;
  }

  @Override
  public String toString() {
    return "Airport{" +
        "Planes=" + planes.toString() +
        '}';
  }

  public Airport(List<? extends Plane> planes) {
    this.planes = planes;
  }

}
