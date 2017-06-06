package oopcw1;

public class Date_Time extends Vehicle{

	    protected int entryTime;
	    protected int entryDate;
	    protected int outTime;
	    protected int outDate;

	    public int getEntryTime() {
			return entryTime;
		}

		public void setEntryTime(int entryTime) {
			this.entryTime = entryTime;
		}

		public int getEntryDate() {
			return entryDate;
		}

		public void setEntryDate(int entryDate) {
			this.entryDate = entryDate;
		}

		public int getOutTime() {
			return outTime;
		}

		public void setOutTime(int outTime) {
			this.outTime = outTime;
		}

		public int getOutDate() {
			return outDate;
		}

		public void setOutDate(int outDate) {
			this.outDate = outDate;
		}

		@Override
	    public String getVehicle() {
	       return "";
	    }

	    @Override
	    public String getBrandName() {
	       return "";
	    }

	    @Override
	    public String getID() {
	        return "";
	    }

	    @Override
		public int Precentage() {
			return 0;
		}
	 
	    public int getTime() {
	        return entryTime;
	    }


	    public int getDate() {
	        return entryDate;
	    }

	  
	    public int SpendTime() {
	        return entryTime-outTime;
	    }

		@Override
		public int date() {
			return 0;
		}

		@Override
		public int time() {
			getVehicle();
			int LongestTime = entryTime-outTime;
			return LongestTime;
		}

		
	    
	    
	    
	
}
