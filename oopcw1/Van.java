package oopcw1;

public class Van extends Vehicle{

	 protected int cargoVol;
	    protected int noOfSlots=2;
	    public Van() {
	    }

	    public Van(int cargoVol ,int noOfSlots) {
	        this.cargoVol = cargoVol;
	        //this.noOfSlots = noOfSlots;
	    }
	    
	    public Van(int cargoVol, String id, String brand,int noOfSlots ) {
	        //super(id, brand, entryTime, entryDate);
	        this.brand = brand;
	        this.id = id;

	        
	        this.cargoVol = cargoVol;
	        this.noOfSlots = noOfSlots;
	    }
	    
	    public int getCargoVol() {
	        return cargoVol;
	    }

	    public void setCargoVol(int cargoVol) {
	        this.cargoVol = cargoVol;
	    }

	    public int getNoOfSlots() {
	        return noOfSlots;
	    }

	    public void setNoOfSlots(int noOfSlots) {
	        this.noOfSlots = noOfSlots;
	    }

	    
	 
	    public String getVehicle() {
	        return "Van";
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
