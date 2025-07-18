package week3.day2;

public class Edge extends Browser {
	public void takeSnap() {
		System.out.println("snap took");
	}
public void clearCookies() {
	System.out.println("cookies are cleared");
}
public static void main(String[] args) {
	Edge ed=new Edge();
	ed.takeSnap();
	ed.clearCookies();
	ed.browserName();
	ed.browserVersion();
}
	
	
}
