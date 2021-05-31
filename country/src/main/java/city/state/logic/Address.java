package city.state.logic;

public class Address {
private int pincode;
private String area;
private String currentLocation;
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}
public String getCurrentLocation() {
	return currentLocation;
}
public void setCurrentLocation(String currentLocation) {
	this.currentLocation = currentLocation;
	
}
@Override
public String toString() {
	return "Address [pincode=" + pincode + ", area=" + area + ", currentLocation=" + currentLocation + "]";
}

}
