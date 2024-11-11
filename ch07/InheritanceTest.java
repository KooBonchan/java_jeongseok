package ch07;

class Tv{
	boolean power;
	int channel;
	static final int MAX_CHANNEL = 99;
	static final int MIN_CHANNEL = 0;
	boolean isOn() {
		return power;
	}
	void togglePower() { power = !power;}
	void channelUp() {
		channel++;
		if(channel > MAX_CHANNEL) channel = MIN_CHANNEL;
	}
	void channelDown() {
		channel--;
		if(channel < MIN_CHANNEL) channel = MAX_CHANNEL;
	}
}
class CaptionTv extends Tv{
	boolean caption;
	void displayCaption(String text) {
		if(caption) {System.out.println(text);}
	}
}

public class InheritanceTest {
	public static void main(String[] args) {
		CaptionTv captionTv = new CaptionTv();
		captionTv.channel = 10;
		captionTv.channelUp();
		System.out.println(captionTv.channel);
		
		captionTv.displayCaption("Caption False");
		captionTv.caption = true;
		captionTv.displayCaption("Caption True");
	}
}
