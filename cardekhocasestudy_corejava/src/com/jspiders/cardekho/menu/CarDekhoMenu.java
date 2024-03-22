package com.jspiders.cardekho.menu;
import com.jspiders.cardekho.operation.CarOperations;
import java.util.Scanner;

public class CarDekhoMenu {
	static boolean loop = true;

//	For Menu
	public void menu(){	
		 System.out.println("========Menu======\n"
	              +"1.View all cars\n"
	               +"2.Search cars\n"
	               +"3.Add cars\n"
	               +"4.Remove car\n"
	               +"5.Edit car\n"
	               +"6.Exit");
   		  
   	  }

	public static void main(String[] args) {
		CarDekhoMenu cd=new CarDekhoMenu();
		CarOperations co=new CarOperations();
	  	Scanner sc= new Scanner(System.in);
	  	
	  	  while(loop){
	  		cd.menu();
	  		  int choose=sc.nextInt();
	  				 switch(choose) {
	  				  case 1:
	  					co.viewCar();
	  					  break;
	  					  
	  		          case 2:
	  		        	co.searchCar();
					           break;
					           
	  		          case 3:
	  		        	  co.addCar();
					            break;
					            
	  		          case 4:
	  		                co.remove();
					             break;
					             
	  		           case 5:
	  		                 co.edit();
					              break;
					              
	  		            case 6:
					            loop=false;
					            System.out.println("thank you!, For visiting our webside");
					            break;
	  		           
	  		            default :
	  		            	System.out.println("plese choose valid option");
	  		                break;
	  				 }
	  			}	
	
	}  
}
