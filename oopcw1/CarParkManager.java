package oopcw1;

public interface CarParkManager {

	    public abstract void AddVehicle(Vehicle Vehicles);
	    public abstract void DeleteVehicle(String ID);
	    public abstract void PrintVehicleList();
	    public abstract void Statistics();
	    public abstract void PrintByDate(int Date);
	    public abstract void ExitVehicle();
	    public abstract boolean RunMenu();
	
}
