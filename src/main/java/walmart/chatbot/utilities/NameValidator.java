package walmart.chatbot.utilities;


public class NameValidator implements Validator {

    @Override
    public boolean fire(String s) {

        String[] words = s.split("\\s+");
        if(words.length == InputProperties.NAME_WORDS_LENGTH && !InputWords.RESTART_STARTOVER.equals(s)) {
            return true;
        }
        return false;
    }
}
