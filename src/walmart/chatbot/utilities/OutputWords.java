package walmart.chatbot.utilities;

import java.util.Arrays;
import java.util.List;

public class OutputWords {

    // greeting answer words
    private static final String GREETING_ANSWER_HELLO = "Hello";
    private static final String GREETING_ANSWER_HOWAREU = "How are you?";
    private static final String GREETING_ANSWER_HEY = "Hey";

    public static final String WELCOME_GREETING = "Welcome to conversation simulation! ";
    public static final String ENTER_HINT = "Please enter phone number, id, name for new record";

    public static final String INITIAL_GREETING = WELCOME_GREETING + "\n" + ENTER_HINT;
    public static List<String> greetingAnswerWords = Arrays.asList(
            GREETING_ANSWER_HELLO,
            GREETING_ANSWER_HOWAREU,
            GREETING_ANSWER_HEY
    );

    // help answer
    public static final String HELP_GUIDE = "Please enter name, ID, phone number";
}
