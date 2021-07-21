// version: 1.1
// made by Vitali Shulha
// 4-Jan-2019

package aircompany;

import aircompany.models.MilitaryType;
import aircompany.planes.ExperimentalPlane;
import aircompany.planes.MilitaryPlane;
import aircompany.planes.PassengerPlane;
import aircompany.planes.Plane;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Airport {

  private List<? extends Plane> planes;

  public List<PassengerPlane> getPassengerPlanes() {
    return planes.stream()
        .filter(plane -> plane instanceof PassengerPlane)
        .map(plane -> (PassengerPlane) plane)
        .collect(Collectors.toList());
  }
  public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
    return Collections.max(getPassengerPlanes(),
        Comparator.comparingInt(PassengerPlane::getPassengersCapacity));
  }

  public List<MilitaryPlane> getMilitaryPlanes() {
    return planes.stream()
        .filter(plane -> plane instanceof MilitaryPlane)
        .map(plane -> (MilitaryPlane) plane)
        .collect(Collectors.toList());
  }

  public List<MilitaryPlane> getBomberMilitaryPlanes() {
    return getMilitaryPlanes().stream()
        .filter(militaryPlane -> militaryPlane.getType() == MilitaryType.BOMBER)
        .collect(Collectors.toList());
  }

  public List<MilitaryPlane> getTransportMilitaryPlanes() {
    return getMilitaryPlanes().stream()
        .filter(militaryPlane -> militaryPlane.getType() == MilitaryType.TRANSPORT)
        .collect(Collectors.toList());
  }

  public List<ExperimentalPlane> getExperimentalPlanes() {
    return planes.stream()
        .filter(plane -> plane instanceof ExperimentalPlane)
        .map(plane -> (ExperimentalPlane) plane)
        .collect(Collectors.toList());
  }

  public Airport sortByMaxDistance() {
    planes.sort(Comparator.comparingInt(Plane::getMaxFlightDistance));
    return this;
  }

  public Airport sortByMaxSpeed() {
    planes.sort(Comparator.comparingInt(Plane::getMaxSpeed));
    return this;
  }

  public Airport sortByMaxLoadCapacity() {
    planes.sort(Comparator.comparingInt(Plane::getMaxLoadCapacity));
    return this;
  }

  public List<? extends Plane> getPlanes() {
    return planes;
  }

  private void print(Collection<? extends Plane> collection) {
    collection.forEach(System.out::println);
  }

  @Override
  public String toString() {
    return "aircompany.Airport{" +
        "Planes=" + planes.toString() +
        '}';
  }

  public Airport(List<? extends Plane> planes) {
    this.planes = planes;
  }
}
