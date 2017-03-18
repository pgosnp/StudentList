
public class Players {

	private String name;
	private String waitingTime;
	private String type;
	private String holdingTime;

	public Players(String name, String waitingTime, String type, String holdingTime) {
		this.name = name;
		this.waitingTime = waitingTime;
		this.type = type;
		this.holdingTime = holdingTime;
	}
	
	public String getName(){
		return name;	
	}
	
	public String getWaitingTime(){
		return waitingTime;	
	}
	
	public String getType(){
		return type;	
	}
	
	public String getHoldingTime(){
		return holdingTime;	
	}
	
		
}
