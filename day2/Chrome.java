package week3.day2;

public class Chrome extends Browser {
	public void openIgcognit() {
	System.out.println("opened successfully");
	}
	public void clearCache() {
		System.out.println("caches are cleared");
	}
public static void main(String[] args) {
	Chrome chro=new Chrome();
	chro.openIgcognit();
	chro.clearCache();
	chro.browserName();
	chro.browserVersion();
	
    }
}
