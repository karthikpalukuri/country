package city.state.AutowiredClass;

public class Address {
private String street;
private String city;
public void setStreet(String street) {
	this.street=street;
}
public String getStreet() {
	return street;
}
public void setCity(String city) {
	this.city=city;
}
public String getCity() {
	return city;
}
@Override
public String toString() {
	return "Address [street=" + street + ", city=" + city + "]";
}

}
//chiild class of EMployee-this is edited in edited branch and got push to master branch
