
public class Car {

	private String model;
	private String[] features;
	
	public Car(String model, String... features) {
		super();
		this.model = model;
		this.features = features;
	}
	
	private void specs() {
		System.out.println("Features of " + model);
		for (String f : features) {
			System.out.println(" > " + f);
		}
	}
	
	public static void main(String[] args) {
		//String[] falto = {"Keyless", "AC", "Power Steering"};
		Car alto = new Car("Suzuki Alto", "Keyless", "AC", "Power Steering");  
		
		//String[] fhect = {"ABS", "Moon Roof", "Climate Control", "Cruise", "Keyless", "start", "Air Bags"};
		Car hector = new Car("MG Hector", "ABS", "Moon Roof", "Climate Control", "Cruise", "Keyless", "start", "Air Bags");
		
		alto.specs();
		hector.specs();
	}
}
