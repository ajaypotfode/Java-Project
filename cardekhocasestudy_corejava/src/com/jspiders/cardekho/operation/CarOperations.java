package com.jspiders.cardekho.operation;
//import java.util.HashSet;
import java.util.ArrayList;
import com.jspiders.cardekho.menu.CarDekhoMenu;
import com.jspiders.cardekho.entities.Car;
import java.util.Scanner;

public class CarOperations {
     ArrayList<Car> cars = new ArrayList<Car>();
     Scanner sc=new Scanner(System.in);
     CarDekhoMenu cd=new CarDekhoMenu();
     
     int id;
  	 String carName;
  	 String brand;
  	 String fuelType;
  	 double price;
  	 
//  Added default Data
Car car1=new Car(101,"safari","tata","petrol",3000000.0);
Car car2=new Car(102,"thar","mahindra","petrol",1500000.0);
Car car3=new Car(103,"audiR8","audi","diesel",2500000.0);

//  Constructor         
   public CarOperations() {
	     cars.add(car1);
	     cars.add(car2);
	     cars.add(car3);
     }	

//   For Add New Car
	public void addCar() { 
		
		System.out.println("enter how many cars you want add");
		int choose=sc.nextInt();
		for(int i=1; i<=choose; i++) {
			
		   System.out.println("enter id");
           id=sc.nextInt();
			
			System.out.println("enter carName");
			carName=sc.next().toLowerCase();
			
			System.out.println("enter brand");
			brand=sc.next().toLowerCase();
			
			System.out.println("enter fuelType");
			fuelType=sc.next().toLowerCase();
			
			System.out.println("enter price");
			price=sc.nextDouble();
			
			 Car car=new Car(id,carName,brand,fuelType,price);
			 
		     cars.add(car);
		     
		     System.out.println(car);
		     System.out.println("new car added successfully");		    
		     }
		  }
		
//	For Display all Cars
	public void viewCar() {
        for (Car car : cars) {
    	    System.out.println(car);
	      }
      }

//	For Display specific Car
	public void searchCar() {
		 boolean condition=true;
		while (condition){		
			  boolean value=false;		
			 System.out.println("**************SEARCH CAR MENU****************\n"
		              +"1.Search car by Id\n"
		               +"2.search car by CarName\n"
		               +"3.search car by Price\n"
		               +"4.search car by Brand\n"
		               +"5.Exit");
			
		    int choise=sc.nextInt();
		    
		 switch (choise) {
//			 to search car by Id
		   case 1:
				System.out.println("enter car id");
	       		   id=sc.nextInt();
	       		  for (Car car : cars) {
	       			  if (car.getId()==id) {
	       				  System.out.println(car);
	       		          value=true;
	       			  }
	       			}
	       		   if (!value) {
       				  System.out.println("no matches found ");
	       		    }
	       		  break;
	       		
//				to search car by Car name
			 case 2:
				 System.out.println("enter car name");
				 carName=sc.next().toLowerCase();
				
	       		   for (Car car : cars) {
	       			   if (car.getCarName().equals(carName)) {
	       				  System.out.println(car);
	       		          value=true;
	       			  }
	       			 }
	       		    if (!value) {
    				  System.out.println("no matches found ");
	       		    }
	       		  break;
	     
//				to search car by Price range
		  case 3:
				System.out.println("enter PriceRange");
				
				System.out.println("enter Minimum Price");
	       		   double min=sc.nextInt();
	       		   
	       		System.out.println("enter Maximum Price");
	       		  double max=sc.nextInt();
	       		   
	       		  for (Car car : cars) {
	       			  
	       			  if (car.getPrice()<=max && car.getPrice()>=min ) {
	       				  
	       				  System.out.println(car);
	       		          value=true;
	       			  }
	       			}
	       		   if (!value) {
    				  System.out.println("no matches found ");
	       		    }
	       		break;
	       		
//				to search car by Brand
			case 4:
				System.out.println("enter car Brand");
				brand =sc.next().toLowerCase();
				
	       		  for (Car car : cars) {
	       			  if (car.getBrand().equals(brand)) {
	       				  System.out.println(car);
	       		          value=true;
	       			  }
	       			}
	       		   if (!value) {
    				  System.out.println("no matches found ");
	       		    }
	       		break;
	           
            case 5:
            	condition=false;
	              break;

			default:
				System.out.println("choose valid option ");
				break;
			}
		}	
	}
	
//	 For Remove Car
	public void remove(){	
		System.out.println("enter car id");
		id=sc.nextInt();
		
		Car carDelete=null;
		boolean value=false;
		
		for (Car car : cars) {
			if (car.getId()==id) {
				carDelete=car;
				value=true;
			 }
		   }
		 if (!value) {
			 System.out.println("Car is not found");
		  }
		 else {
			 cars.remove(carDelete);
			 System.out.println("Car has Deleted successfully ");
		  }
		
	   }
	
//	For Update Car Details
    public void edit() {
	      System.out.println("which car you want to update,enter car id");
	      id=sc.nextInt();
        boolean value=false;
	   for (Car car : cars) {
		   if (car.getId()==id) {
			  System.out.println("enter car name");
			  carName=sc.next();  
			  car.setCarName(carName); 
			 
			  System.out.println("enter car brand");
			  brand=sc.next();
			  car.setBrand(brand);
			
			  System.out.println("enter fuelType");
			  fuelType=sc.next();
			  car.setFuelType(fuelType);
			
			  System.out.println("enter car price");
			  price=sc.nextDouble();
			  car.setPrice(price);
			  value=true;
		     }
	      }
	   if (!value) {
		   System.out.println("Car id not match,Please enter another id");
		   edit();
	    }
     }
}
		
	
