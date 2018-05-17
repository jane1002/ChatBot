package walmart.chatbot.response;

import walmart.chatbot.container.RecordsContainer;
import walmart.chatbot.core.Response;
import walmart.chatbot.utilities.NameValidator;


public class NameResponse implements Response {

    NameValidator nameValidator;

    public NameResponse() {
        this.nameValidator = new NameValidator();
    }

    @Override
    public boolean accept(String input) {
        return nameValidator.fire(input);
    }

    @Override
    public String returnResponse(RecordsContainer recordsContainer, String input) {
        return "Record " + recordsContainer.getLastRecordIndexNumber() + ": " + "name: "
                + recordsContainer.setAndGetName(input);
    }
}
