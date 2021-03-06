package parkingLot.com.parkingLot;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;


public class App {

	public static void display(String input,ParkingLotUtil putil)
	{
		String inputs[] = input.split(" ");
		if (inputs[0].equals("create_parking_lot")) {
			if (putil.createParkingLot(Integer.parseInt(inputs[1]))) {
				System.out.println("Created a parking lot with " + inputs[1] + " slots");

			} else {
				System.out.println("Invalid slot size");
			}

		} else if (inputs[0].equals("park")) {
			String regno = inputs[1];
			String color = inputs[2];
			int slotid = putil.getMinimumSlot();
			if (slotid == -1 && putil.slots == null) {
				System.out.println("Sorry, create a parking lot first");

			} else if (slotid == -1) {
				System.out.println("Sorry, parking lot is full");
			} else {
				if (putil.Allot(color, regno, slotid))
					System.out.println("Allocated slot number: " + slotid);

			}
		} else if (inputs[0].equals("leave")) {
			int slotId = Integer.parseInt(inputs[1]);
			if (putil.Leave(slotId))
				System.out.println("Slot number " + slotId + " is free");
			else
				System.out.println("Not found");
		} else if (inputs[0].equals("status")) {

			putil.status();
		} else if (inputs[0].equals("registration_numbers_for_cars_with_colour")) {
			List<String> listreg = putil.getListRegNo(inputs[1]);
			StringBuffer sb = new StringBuffer();
			if (!listreg.isEmpty()) {
				for (String l : listreg) {
					sb.append(l + ", ");
				}
				System.out.println(sb.substring(0, sb.length() - 2));
			} else {
				System.out.println("Not found");
			}
		} else if (inputs[0].equals("slot_numbers_for_cars_with_colour")) {
			List<Integer> listnum = putil.getSlots(inputs[1]);
			StringBuffer sb = new StringBuffer();
			if(!listnum.isEmpty()) {
				for (Integer l : listnum) {
					sb.append(l + ", ");
				}
				System.out.println(sb.substring(0, sb.length() - 2));
			}
			else
			{
				System.out.println("Not found");
			}

		} else if (inputs[0].equals("slot_number_for_registration_number")) {
			int slotid = putil.getSlotId(inputs[1]);
			if (slotid == -1)
				System.out.println("Not found");
			else
				System.out.println(slotid);
		}

	}



	public static void main( String[] args )
    {
    	BufferedReader br = null;
    	  FileReader fr = null;

    	  try {

    	  	ParkingLotUtil putil = new ParkingLotUtil();
			if(args.length != 0) {

				String file = "..//" + args[0];
				//String file = File.separator+"home"+File.separator+"ubuntu"+File.separator+"Desktop"+File.separator+"parkingLot"+File.separator+"input.txt";
				fr = new FileReader(file);
				br = new BufferedReader(fr);

				String sCurrentLine;


				while ((sCurrentLine = br.readLine()) != null) {
					display(sCurrentLine,putil);

				}
			}

			else
			{

				Scanner sc = new Scanner(System.in);
				while(sc.hasNext())
				{
					String input = sc.nextLine();
					display(input , putil);

				}
			}


    	  } catch (IOException e) {

    	   e.printStackTrace();

    	  } finally {

    	   try {

    	    if (br != null)
    	     br.close();

    	    if (fr != null)
    	     fr.close();

    	   } catch (IOException ex) {

    	    ex.printStackTrace();

    	   }
    }
    
}

}
