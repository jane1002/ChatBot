package walmart.chatbot.utilities;


public class IdValidator implements Validator {

    private IntegerValidator integerValidator;

    public IdValidator() {
        this.integerValidator = new IntegerValidator();
    }

    @Override
    public boolean fire(String id) {
        return integerValidator.fire(id) && id.length() == InputProperties.ID_LENGTH;
    }
}
