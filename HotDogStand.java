// File: HotDogStand.java
// Programmer: Jennifer King
// Date: 9/17/2018

import java.util.Scanner;

public class HotDogStand 
{
	static int ALLSOLD = 0;
	int standID;
	int dogSold;

	public HotDogStand(int id, int dogs)
	{
			standID = id;
			dogSold = dogs;
			ALLSOLD += dogSold;
	}
		
	public void justSold()
	{
		dogSold ++;
		ALLSOLD ++;
	}
		
	public int numberSold(){return dogSold;}
	public int getID() {return standID;}
	public static int getALLSOLD() {return ALLSOLD;}
	
	public static void main(String[] args)
	{
		HotDogStand stand1 = new HotDogStand(1, 0);
		HotDogStand stand2 = new HotDogStand(2, 0);
		HotDogStand stand3 = new HotDogStand(3, 0);
		
    		stand1.justSold;
  		stand1.justSold;
    		stand2.justSold;
    
		System.out.printf("Stand %d sold %d%n", stand1.getID(), stand1.numberSold());
		System.out.printf("Stand %d sold %d%n", stand2.getID(), stand2.numberSold());
		System.out.printf("Stand %d sold %d%n", stand3.getID(), stand3.numberSold());
		System.out.printf("Total sold = %d%n", HotDogStand.getALLSOLD());
		
		stand2.justSold;
    		stand2.justSold;
    		stand3.justSold;
    
    		System.out.printf("Stand %d sold %d%n", stand1.getID(), stand1.numberSold());
		System.out.printf("Stand %d sold %d%n", stand2.getID(), stand2.numberSold());
		System.out.printf("Stand %d sold %d%n", stand3.getID(), stand3.numberSold());
		System.out.printf("Total sold = %d%n", HotDogStand.getALLSOLD());
    
	}
}
