package Cab;

public class Mini extends Car{
	String ModelName;
	Mini(String ModelName,String FuelType,String CarName,int NumberofSeats,String DriverName,String PhoneNumber,String NumberPlate,double Cost){
		super(FuelType,CarName,NumberofSeats,DriverName,PhoneNumber,NumberPlate,Cost);
		this.ModelName=ModelName;
	}
	void MiniDetails() {
		System.out.println("\n******* Your ordered is Booked! *******\n");
		System.out.println("Driver Name: "+DriverName);
		System.out.println("Driver PhoneNumber: "+PhoneNumber);
		System.out.println("Number of Seats: "+NumberofSeats);
		System.out.println("Fuel Type: "+FuelType);
		System.out.println("Number Plate: "+NumberPlate);
		System.out.println("Model Name: "+ModelName);
		System.out.println("Cost: "+Cost+" ₹\n");
	}

}
