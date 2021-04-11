package exercise;
class MyTv{
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void turnOff() {
		isPowerOn = !isPowerOn;
		// isPowerOn의 값이 true면 false로, false 면 true로 바꾼다.
	}
	
	void volumeUp() {
		if(volume < MAX_VOLUME)
			volume++;
		//volume의 값이 MAX_VOLUME보다 작을때만 값을 1 증가
	}
	
	void volumeDown() {
		if(volume > MIN_VOLUME)
			volume--;
		//volume의 값이 Mㅑㅜ_VOLUME보다 작을때만 값을 1 감소
	}
	
	void channelUp() {
		//channel의 값을 1증가
		//만일 channel이 MAX_CHANNEL이면, channel의 값을 MIN_CHANNEL로 바꿈
		if(channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		}else {
			channel++;
		}
	}
	
	void channelDown() {
		//channel의 값을 1감소
		//만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꿈
		if(channel == MIN_CHANNEL) {
			channel = MAX_CHANNEL;
		}else {
			channel--;
		}
	}
}
public class ex6_08 {

	public static void main(String[] args) {
		MyTv t =new MyTv();
		
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH:"+t.channel+", VOL:"+t.volume);
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:"+t.channel+", VOL:"+t.volume);
		
		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:"+t.channel+", VOL:"+t.volume);
	}

}
