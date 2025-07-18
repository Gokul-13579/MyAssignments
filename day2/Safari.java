package week3.day2;

public class Safari extends Browser{
	public void readerMode() {
		System.out.println("readmode open susccessfully");
	}
public void FullScreenMode(){
	System.out.println("full screened successfully");
	}
public static void main(String[] args) {
	Safari saf=new Safari();
	saf.readerMode();
	saf.FullScreenMode();
	saf.browserName();
	saf.browserVersion();
}
	
}
