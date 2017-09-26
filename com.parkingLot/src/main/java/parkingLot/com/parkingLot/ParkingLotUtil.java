package parkingLot.com.parkingLot;

import java.util.List;

public class ParkingLotUtil {
	Car slots[] = null;
	CartoColorDictionary ccd = new CartoColorDictionary();
	
	public boolean createParkingLot(int size){
		if(size<=0)
			return false;
		else{
		slots = new Car[size+1];
		return true;
		}
	}
	
	public int getMinimumSlot()
	{
		int i;
		if(slots==null)
			return -1;
		else{
		for( i = 1 ; i< slots.length;i++)
		{
			if(slots[i]== null)
				break;
		}
		
		if(i >= slots.length )
			return -1;
		
		else 
			return i;
		}
	}
	
	public boolean Allot(String color ,String regNum , int slotId)
	{
		try{
		
		Car car = new Car(color,regNum,slotId);
		slots[slotId] = car;
		ccd.addIntoMap(car);
		 return true;		
		}
		catch(Exception e)
		{
		 return false;
		}
	    
	}
	
	public boolean Leave(int slotId)
	{
		if(slotId > slots.length)
			return false;
		
		else if(slots[slotId]==null)
			return true;
		
		else
		{
			Car car = slots[slotId];
			ccd.removeFromMap(car);
			slots[slotId] = null;
			return true;
		}
		
			
	}

	public List<String> getListRegNo(String color)
	{
		List<String> RegList = ccd.getRegNo(color);
		return RegList;
			
			
	}
	
	//getSlotId(String regNum)

	public int getSlotId(String regNum)
	{
		for(Car c : slots)
		{
			if(c != null)
			{
				String num = c.getRegNum();
				if(regNum.equals(num))
				{
					return c.getSlotId();
				}
			}
		}
		return -1;
	}
	//getSlots(String color)
	
	public List<Integer> getSlots(String color)
	{
		List<Integer> slotlist = ccd.getSlotId(color);
		return slotlist;
	}
	
	public boolean status()
	{
		if(slots==null) {
			System.out.println("Create Slot first");
			return false;

		}
		int i;
		for( i=1;i<slots.length;i++)
		{
			if(slots[i]!=null)
				break;
		}
		if(i==slots.length) {
			System.out.println("All slots are empty");
			return false;
		}
		else{
		System.out.println("Slot No."+"\tRegistration No.\tColour");
		for(Car c : slots)
		{
			if(c != null)
			System.out.println(c.getSlotId()+"\t\t"+c.getRegNum()+"\t\t"+c.getColor());
		}
		return true;
		}
	}
	
	
	

}
