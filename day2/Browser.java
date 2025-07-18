package week3.day2;

public class Browser {
	String browserName="chrome";
	String browserVersion="5.1"; 

	public void browserName() {
		System.out.println("Browser Name Is:"+ browserName);
	}
	public void browserVersion() {
		System.out.println("Browser Version Is:"+ browserVersion);
	}
	public static void main(String[] args) {
		Browser brow=new Browser();
		brow.browserName();
		brow.browserVersion();
	}
	
}

