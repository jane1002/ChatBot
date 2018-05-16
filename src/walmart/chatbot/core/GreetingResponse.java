package walmart.chatbot.core;

import java.util.Random;

public class GreetingResponse implements Response {

	String[] list = {"Hello", "How are you", "Hey"};

	@Override
	public void showDescription() {
		Random r = new Random();
		System.out.println(list[r.nextInt(list.length)]);
	}

}
