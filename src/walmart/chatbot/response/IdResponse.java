package walmart.chatbot.response;

import walmart.chatbot.container.RecordsContainer;
import walmart.chatbot.core.Response;
import walmart.chatbot.utilities.IdValidator;

public class IdResponse implements Response {

    private IdValidator idValidator;

    public IdResponse() {
        this.idValidator = new IdValidator();
    }

    @Override
    public boolean accept(String input) {
        return idValidator.fire(input);
    }

    @Override
    public String returnResponse(RecordsContainer recordsContainer, String input) {
        return "Record " + recordsContainer.getLastRecordIndexNumber() + ": " + "id: "
                + recordsContainer.setAndGetId(input);    }

}
