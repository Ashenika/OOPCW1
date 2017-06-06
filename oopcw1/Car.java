package oopcw1;

public class Car extends Vehicle{

	protected int noOfDoors;
    protected String color;
    protected int noOfSlots=1 ;

    public Car() {
    }

    public Car(String color , int noOfDoors ,int noOfSlots) {
        this.color = color;
        this.noOfDoors = noOfDoors;
        this.noOfSlots = noOfSlots;
    }
    
    public Car(int noOfDoors, String color, String id, String brand,int noOfSlots ) {
         this.id = id;
         this.brand = brand;

         this.noOfDoors = noOfDoors;
         this.color = color;
         this.noOfSlots = noOfSlots;
     }

    
	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNoOfSlots() {
		return noOfSlots;
	}

	public void setNoOfSlots(int noOfSlots) {
		this.noOfSlots = noOfSlots;
	}

	@Override
	public String getVehicle() {
		return "Car";
	}

	@Override
	public String getBrandName() {
		return brand;
	}

	@Override
	public String getID() {
		return id;
	}

	@Override
	public int Precentage() {
		return (noOfSlots/20)*100;
	}

	@Override
	public int date() {
		return 0;
	}

	@Override
	public int time() {
		return 0;
	}
	
}
