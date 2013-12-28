
public class Guitar {

	private String serialNumber, builder, model, type,backWood, topWood;
	private double price;
	
	public Guitar(String serialNumber,
			String builder,String model,String type,
			String backWood,String topWood){
		this.serialNumber = serialNumber;
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}
	
	public String getserialNumber(){
		return serialNumber;
	}
	
	public double getPrice(){
		return price;
	}
	
	public void setPrice(float newPrice){
		this.price = newPrice;
	}
	
	public String getBuilder(){
		return builder;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBackWood() {
		return backWood;
	}

	public void setBackWood(String backWood) {
		this.backWood = backWood;
	}

	public String getTopWood() {
		return topWood;
	}

	public void setTopWood(String topWood) {
		this.topWood = topWood;
	}
	
	
	
}
