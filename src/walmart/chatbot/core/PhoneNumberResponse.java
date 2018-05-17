package walmart.chatbot.core;

import walmart.chatbot.container.RecordsContainer;
import walmart.chatbot.utilities.PhoneNumberValidator;

/**
 * Created by YFAN on 5/16/2018.
 */
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
        return "Record " + recordsContainer.getLastRecordIndexNumber() + ": " + "phone number: "
                + recordsContainer.setAndGetPhoneNumber(input);
    }
}
