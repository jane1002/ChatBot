package walmart.chatbot.utilities;


public class PhoneNumberValidator implements Validator {

    private IntegerValidator integerValidator;

    public PhoneNumberValidator() {
        this.integerValidator = new IntegerValidator();
    }

    @Override
    public boolean fire(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.length() == 0 || phoneNumber.length() != InputProperties.PHONE_NUMBER_LENGTH) {
            return false;
        }

        if (phoneNumber.length() == InputProperties.PHONE_NUMBER_LENGTH && integerValidator.fire(phoneNumber)) {
            return true;
        }

        return false;
    }
}
