package e_oop;

public class AirConditioner {

	boolean power;// 전원
	int temperature;// 온도
	int airVolume;// 풍량
	final int MAX_TEMPERATURE = 30;
	final int MIN_TEMPERATURE = 18;
	AirConditioner() {

		power = false;
		temperature = 24;
		airVolume = 1;
	}

	void power() {
		power = !power;
		System.out.println("POWER : " + (power ? "ON" : "OFF"));
	}

	void temperatureUp() {
		if (power) {
			if (++temperature > MAX_TEMPERATURE) {
				temperature = MAX_TEMPERATURE;
			}
		}
		view();
	}

	void temperatureDown() {
		if (power) {
			if (--temperature < MIN_TEMPERATURE) {
				temperature = MIN_TEMPERATURE;
			}
		}
		view();
	}

	void airVolume() {
		if (power) {
			if (3 < ++airVolume) {
				airVolume = 1;
			}
		}
		view();
	}
	
	void view(){
		System.out.println("온도 : " + temperature);
		System.out.println("풍량 : " + airVolume);
	}
	
	public static void main(String[] args) {
		AirConditioner ac = new AirConditioner();
		ac.power();
		ac.temperatureDown();
		ac.temperatureDown();
		ac.temperatureDown();
		ac.temperatureUp();
		ac.airVolume();
	}

}
