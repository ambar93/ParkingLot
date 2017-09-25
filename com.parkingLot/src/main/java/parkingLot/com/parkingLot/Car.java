package parkingLot.com.parkingLot;

public class Car {

	private String color;
	private String regNum;
	private int slotId;
	
	public Car(String color, String regNum, int slotId) {
		this.color = color;
		this.regNum = regNum;
		this.slotId = slotId;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public int getSlotId() {
		return slotId;
	}
	public void setSlotId(int slotId) {
		this.slotId = slotId;
	}
	
	public String getRegNum() {
		return regNum;
	}
	public void setRegNum(String regNum) {
		this.regNum = regNum;
	}
	
	
}
