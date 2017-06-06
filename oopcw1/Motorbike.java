package oopcw1;

public class Motorbike extends Vehicle{

	 int size_Engine;
	 int noOfSlots=1;

	    public Motorbike() {
	    }

	    public Motorbike(int size_Engine , int noOfSlots) {
	        this.size_Engine = size_Engine;
	    }

	    public Motorbike(int size_Engine, String id, String brand ,int noOfSlots) {
	        this.id = id;
	        this.brand = brand;

	        this.size_Engine = size_Engine;
	        this.noOfSlots = noOfSlots;
	    }

	    public int getSize_Engine() {
	        return size_Engine;
	    }

	    public void setSize_Engine(int size_Engine) {
	        this.size_Engine = size_Engine;
	    }

	    public int getNoOfSlots() {
	        return noOfSlots;
	    }

	    public void setNoOfSlots(int noOfSlots) {
	        this.noOfSlots = noOfSlots;
	    }


	    public String getVehicle() {
	        return "Motorbike";
	    }


	    public String getBrandName() {
	        return brand;
	    }


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
