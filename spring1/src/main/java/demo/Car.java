package demo;

public class Car {
	private String brand;

	public String getBrand() {
		return brand;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String brand) {
		super();
		this.brand = brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void run() {
		System.out.print("开着"+brand);
	}
}
