package e_oop;

public class TV {

	//tv와 최대한 비슷하게 tv클래스를 만들어주세요.
	final int MAX_CHANNEL = 500; 
	final int MIN_CHANNEL = 0; 
	final int MAX_VOLUMN = 100;
	final int MIN_VOLUMN = 0;
	
	boolean power = false;
	int channel = 0;
	int volumn = 10;
	
	void power() {
		power = !power;	
	}

	void ChannelUp() {
		if (power) {
			if (++channel > MAX_CHANNEL) {
				channel = MIN_CHANNEL;
			}
		}
	}

	void ChannelDown() {
		if (power) {
			if (--channel > MIN_CHANNEL) {
				channel = MAX_CHANNEL;
			}
		}
	}
	
	void Volumnup() {
		if (power) {
			if (++volumn > MAX_VOLUMN) {
				volumn = MAX_VOLUMN;
			}
		}
	}

	void VolumnDown() {
		if (power) {
			if (--volumn > MIN_VOLUMN) {
				volumn = MIN_VOLUMN;
			}
		}
	}
	void Channel(int input){
		if (power) {
			if (input >= MIN_CHANNEL && input <= MAX_CHANNEL) {
				channel = input;
			}
		}
	}
	void MuteVolumn(){
		volumn = 0;
	}
	
	public static void main(String[] args) {
		
	}
}
