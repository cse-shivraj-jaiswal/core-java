class Car {
	private String brand;
	private String color;
	private String make;
	private double price;


	//car HAS-A Engine
	//private Engine engine = new Engine(1200.00,4,5000);

	private Engine engine;
	public Car(String brand, String color, String make, double price,Engine engine) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.make = make;
		this.engine = engine;
	}

	
	//car HAS-A MediaPlayer
	private MediaPlayer mediaPlayer;

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//Read only
	public Engine getEngine() {
		return engine;
	}
	//read only
	public MediaPlayer  getMediaPlayer() {
		return mediaPlayer;
	}
	//write only
	public void setMediaPlayer(MediaPlayer mediaPlayer) {
		this.mediaPlayer = mediaPlayer;
	}
	public  void displayCarInfo() {
		System.out.println("Car Details  ");
		System.out.println("-------------");
		System.out.println("Brand is : "+getBrand());
		System.out.println("Color is : "+getColor());
		System.out.println("Make is : "+getMake());
		System.out.println("Price is : "+getPrice());
		System.out.println();



	}

}