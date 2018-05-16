package walmart.chatbot.core;

public class HelperGuideResponse implements Response{
	
	private static final String HELPER_GUIDE = "Please enter...";

	@Override
	public void showDescription() {
		// TODO Auto-generated method stub
		System.out.println(HELPER_GUIDE);;
	}

}
