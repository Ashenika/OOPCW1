package oopcw1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WestminsterCarParkManager implements CarParkManager{

	private ArrayList <Vehicle> vehicleList;
	private int noOfSlots=20;
	
	   public WestminsterCarParkManager(int listLength){
           this.noOfSlots = listLength;
           vehicleList = new ArrayList<Vehicle>();
       }
	   @Override
		public void AddVehicle(Vehicle Vehicles) {
			if(vehicleList.size() < noOfSlots){
				vehicleList.add(Vehicles);
				
//				System.out.println("Free Slots" + vehicleList.get(noOfSlots));
//			}else{
//				System.out.println("No more Space!!!!");
			}
			
		}

		@Override
		public void DeleteVehicle(String ID) {
			for(int i=0; i<vehicleList.size(); i++){
				if(vehicleList.get(i).getID().equals(ID)){
					vehicleList.remove(ID);
					System.out.println("Deleted Vehicle is a " + vehicleList.get(i).getVehicle());
				}
			}

		}

		@Override
		public void PrintVehicleList() {
			for(int i=0; i<vehicleList.size(); i++){
				if(vehicleList.get(i).getVehicle().equals("Car")){
					System.out.println("Vehicle = Car, Brand = " + vehicleList.get(i).getBrand()
					+ ", ID = " + vehicleList.get(i).getID());
				}else if(vehicleList.get(i).getVehicle().equals("Van")){
					System.out.println("Vehicle = Van, Brand = " + vehicleList.get(i).getBrandName()
					+ ", ID = " + vehicleList.get(i).getID());
				}else{
					System.out.println("Vehicle = Motorbike, Brand = " + vehicleList.get(i).getBrandName()
					+ ", ID = " + vehicleList.get(i).getID());
				}
			}
			
		}
		Date_Time dt = new Date_Time();
		@Override
		public void Statistics() {
			for(int i=0; i< vehicleList.size();i++){
				if(vehicleList.get(i).getVehicle().equals("Car")){
					System.out.println("Percentage of Cars " + vehicleList.get(i).Precentage());
				}else if(vehicleList.get(i).getVehicle().equals("Van")){
					System.out.println("Percentage of Vans " + vehicleList.get(i).Precentage());
				}else{
					System.out.println("Percentage of Bikes " + vehicleList.get(i).Precentage());
				}
				
				int LongestTime = dt.SpendTime();			
				System.out.println("Vehicle that Parked for Long time is " + vehicleList.get(LongestTime) );
				
				
				
				System.out.println("Last Vehicle Parked is " );
				//dt.SpendTime()
				//vehicleList.get(i)
			
			}
			
		}
		
//		public int Compare(Vehicle vehicle2 , Vehicle vehicle1){
//			return vehicle1.date().compareTo(vehicle2.date());
//		}

		@Override
		public void PrintByDate(int Date) {		
			
			
		}






		@Override
		public void ExitVehicle() {
			// TODO Auto-generated method stub
			
		}






		@Override
		public boolean RunMenu() {
			 boolean exit = false ;
		        System.out.println("Please Select Below Options");
		        System.out.println("A : to Add a new vehicle   ");
		        System.out.println("D : to delete a vehicle    ");
		        System.out.println("P : Print the list of current vehicles");
		        System.out.println("S : Print Some Statistics");
		        System.out.println("B : Print By Date");
		        System.out.println("L : Leave a Vehicle");
		        System.out.println("E : Exit Menu");
		        
		        Scanner sc = new Scanner(System.in);
		        String Choice = sc.next();
		        sc.nextLine();
		      //  int noOfSlots;
		        
		        if(Choice.equalsIgnoreCase("A")){
		            System.out.println("Please Select one Vehicle type from Below");
		            System.out.println("C : for a Car");
		            System.out.println("V : for a Van");
		            System.out.println("M : for a Motorbike");
		            String t = sc.nextLine();
		           
		          if(t.equalsIgnoreCase("C")){
		        	  noOfSlots=1;
		        	  System.out.println("Enter Vehicle Number");
			          String id =sc.nextLine();
			          System.out.println("Enter the Brand");
			          String brand = sc.nextLine();
			          System.out.println("Enter entry Time in 0000 (24 hours) format"); 
			          int entryTime = sc.nextInt();
			          System.out.println("Enter entry Date in month day format"); 
			          int entryDate = sc.nextInt();
		              System.out.println("Enter number of doors in the car"); 
		              int noOfDoors = sc.nextInt();
		              System.out.println("Enter color of the car");
		              String color = sc.next();
		              Car c = new Car(noOfDoors,color,id,brand,noOfSlots);
		              this.AddVehicle(c);
		              noOfSlots--;
		            
		            
		          }  else if (t.equalsIgnoreCase("V")){
		        	  noOfSlots=2;
		        	  System.out.println("Enter Vehicle Number");
			          String id =sc.nextLine();
			          System.out.println("Enter the Brand");
			          String brand = sc.nextLine();
			          System.out.println("Enter entry Time in 0000 (24 hours) format"); 
			          int entryTime = sc.nextInt();
			          System.out.println("Enter entry Date in month day format"); 
			          int entryDate = sc.nextInt();
		              System.out.println("Enter the cargo volume of the Van");
		              int cargo = sc.nextInt();
		              Van v = new Van(cargo,id,brand,noOfSlots);
		              this.AddVehicle(v);
		              noOfSlots--;
		              noOfSlots--;
		             
		          }else if(t.equalsIgnoreCase("M")){
		        	  noOfSlots=1;
		        	  System.out.println("Enter Vehicle Number");
			          String id =sc.nextLine();
			          System.out.println("Enter the Brand");
			          String brand = sc.nextLine();
			          System.out.println("Enter entry Time in 0000 (24 hours) format"); 
			          int entryTime = sc.nextInt();
			          System.out.println("Enter entry Date in month day format"); 
			          int entryDate = sc.nextInt();
		              System.out.println("Enter the Engine Capacity of the bike");
		              int size_Engine= sc.nextInt();
		              Motorbike m = new Motorbike(size_Engine,id,brand,noOfSlots);
		              this.AddVehicle(m);
		              noOfSlots--;
		              
		          }else{
//		              System.out.println("Invalid input!! Please enter the Correct one!!!!");
//		              t=sc.next();
		          }
		            
		        }else if(Choice.equalsIgnoreCase("D")){
		            System.out.println("Enter Vehicle Number");
		            String ID = sc.next();
		            DeleteVehicle(ID);
		          
		        }else if (Choice.equalsIgnoreCase("P")){
		        	this.PrintVehicleList();
		            
		        }else if (Choice.equalsIgnoreCase("S")){
		        	this.Statistics();
		            
		        }else if(Choice.equalsIgnoreCase("B")){
		        	System.out.println("Enter the Date in month & Date format");
		        	int Date = sc.nextInt();
		        	for(int i=0; i < vehicleList.size(); i++){
						if(vehicleList.get(i).equals(Date)){
							System.out.println("The Vehicles that parked on " + Date + " are : " + vehicleList.get(i));
						}
					}
		        	
		        }else if (Choice.equalsIgnoreCase("L")){
		            
		        }else{
		            if(Choice.equalsIgnoreCase("E")){
		            exit=true;
		            }
		        }
			return exit;
		}
	
	public static void main(String[] args) {
		
		CarParkManager cp = new WestminsterCarParkManager(20);
	       boolean exit = false;
	       
	       while(!exit){
	           exit = cp.RunMenu();
	       }

	}






	

}
