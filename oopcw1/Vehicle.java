package oopcw1;

public abstract class Vehicle {
	  protected String id;
	  protected String brand;

	public Vehicle() {

	}
	
	public Vehicle(String id, String brand){
		this.id = id;
		this.brand = brand;
	}

	public String getId() {
		return id;
	}

	public String getBrand() {
		return brand;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	  
	 @Override
     public String toString() {
        return "Vehicle{" + "id=" + id + "brand=" + brand  + '}';
    } 
	 
	 public abstract String getVehicle();
	 public abstract String getBrandName();
	 public abstract String getID();
	 public abstract int Precentage();
	 public abstract int date();
	 public abstract int time();
	  
	  

}
