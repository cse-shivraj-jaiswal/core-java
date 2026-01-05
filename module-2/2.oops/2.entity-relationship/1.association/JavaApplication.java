class JavaApplication {
	public static void execution() {

		Engine engine = new Engine(1200, 4, 1000);
		Car car = new Car("Hyundai", "White","India",56589.90, engine);

		car.displayCarInfo();
		car.getEngine().displayEngineInfo();

		MediaPlayer mediaPlayer = new MediaPlayer("Boat",7484.00,"India");
		car.setMediaPlayer(mediaPlayer);

		car.getMediaPlayer().displayMediaPlayerInfo();
		
	}

}