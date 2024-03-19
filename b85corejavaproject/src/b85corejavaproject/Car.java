package b85corejavaproject;

public class Car {
	    String brand;
		String model;
		String color;
		float price;
		int engineCapacity;
		float maxSpeed;
		
		public Car(String brand, String model, String color, float price, int engineCapacity, float maxSpeed) {
			super();
			this.brand = brand;
			this.model = model;
			this.color = color;
			this.price = price;
			this.engineCapacity = engineCapacity;
			this.maxSpeed = maxSpeed;
		}

		public String getBrand() {
			return brand;
		}
		public String getModel() {
			return model;
		}
		public float getPrice() {
			return price;
		}
		

	}

 
