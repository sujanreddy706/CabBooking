package Cab;

public class Car extends Cab{
	String FuelType;
	String CarName;
	int NumberofSeats;
	Car(String FuelType,String CarName, int NumberofSeats,String DriverName,String PhoneNumber,String NumberPlate,double Cost){
		super(DriverName,PhoneNumber,NumberPlate,Cost);
		this.FuelType=FuelType;
		this.CarName=CarName;
		this.NumberofSeats=NumberofSeats;
		
	}
}
