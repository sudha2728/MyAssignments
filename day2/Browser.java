package week1.day2;

public class Browser {
	public String launchBrowser(String browserName) {
		System.out.println("Browser Opened Successfuly");
		return browserName;
		
		
				
	}
	public void loadUrl() {
		System.out.println("Url Opened Successfuly");

	}
	
	public static void main(String[] args) {
		Browser sj = new Browser();
		String name = sj.launchBrowser("fireFox");
		System.out.println(name);
		
		sj.loadUrl();
	}
}
