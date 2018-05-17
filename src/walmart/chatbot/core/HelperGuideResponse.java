package walmart.chatbot.core;

import walmart.chatbot.container.RecordsContainer;
import walmart.chatbot.utilities.InputProperties;

public class HelperGuideResponse implements Response {
	private InputProperties inputProperties;

	public HelperGuideResponse() {
		this.inputProperties = new InputProperties();
	}

	@Override
	public boolean accept(String input) {
		return false;
	}

	@Override
	public String returnResponse(RecordsContainer recordsContainer, String input) {

		return "Please enter phone number (" + inputProperties.PHONE_NUMBER_LENGTH + "-Digits), id (" + inputProperties.ID_LENGTH
				+ "-Digits) " + "and name " + "(" + inputProperties.NAME_WORDS_LENGTH + " Words) for each record. Type 'New' for new record" +
				"entry. Type 'Done' when complete.";
	}


}
