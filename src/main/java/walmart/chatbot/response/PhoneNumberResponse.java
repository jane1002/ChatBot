package walmart.chatbot.response;

import walmart.chatbot.container.RecordsContainer;
import walmart.chatbot.core.Response;
import walmart.chatbot.utilities.PhoneNumberValidator;


public class PhoneNumberResponse implements Response {

    private PhoneNumberValidator validator;

    public PhoneNumberResponse() {
        this.validator = new PhoneNumberValidator();
    }

    @Override
    public boolean accept(String input) {
        return validator.fire(input);
    }

    @Override
    public String returnResponse(RecordsContainer recordsContainer, String input) {
        return "Record " + recordsContainer.getCurrentRecordIndexNumber() + ": " + "phone number: "
                + recordsContainer.setAndGetPhoneNumber(input);
    }
}
