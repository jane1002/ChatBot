package walmart.chatbot.response;

import walmart.chatbot.container.RecordsContainer;
import walmart.chatbot.core.Response;
import walmart.chatbot.utilities.InputFormatter;
import walmart.chatbot.utilities.NameValidator;


public class NameResponse implements Response {

    NameValidator nameValidator;
    InputFormatter inputFormatter;

    public NameResponse() {
        this.nameValidator = new NameValidator();
        this.inputFormatter = new InputFormatter();
    }

    @Override
    public boolean accept(String input) {
        return nameValidator.fire(input);
    }

    @Override
    public String returnResponse(RecordsContainer recordsContainer, String input) {
        input = inputFormatter.capitalizeMulWords(input, " ");
        return "Record " + recordsContainer.getCurrentRecordIndexNumber() + ": " + "name: "
                + recordsContainer.setAndGetName(input);
    }
}
