package walmart.chatbot.utilities;

import java.util.Arrays;
import java.util.List;

public class InputWords {

    // greeting words
	private static final String GREETING_HI = "hi";
    private static final String GREETING_HEY = "hey";
    private static final String GREETING_HELLO = "hello";

    public static List<String> greetingWords = Arrays.asList(
        GREETING_HI,
        GREETING_HEY,
        GREETING_HELLO
    );

    // help words
    private static final String HELP_H = "h";
    private static final String HELP_Q = "q";
    private static final String HELP_HELP = "help";
    private static final String HELP_QUESTION = "question";

    public static List<String> helpWords = Arrays.asList(
            HELP_H,
            HELP_Q,
            HELP_HELP,
            HELP_QUESTION
    );

    // restart words
    public static final String RESTART_STARTOVER = "start over";
    private static final String RESTART_CANCEL = "cancel";

    public static List<String> restartWords = Arrays.asList(
            RESTART_STARTOVER,
            RESTART_CANCEL
    );

    // terminate words
    private static final String TERMINATE_DONE = "done";
    private static final String TERMINATE_COMPLETE= "complete";

    public static List<String> terminateWords = Arrays.asList(
            TERMINATE_DONE,
            TERMINATE_COMPLETE
    );

    // new
    private static final String CREATE_NEW_ = "new";
    private static final String CREATE_NEXT= "next";
    private static final String CREATE_MORE = "more";

    public static List<String> createNewWords = Arrays.asList(
            CREATE_NEW_,
            CREATE_NEXT,
            CREATE_MORE
    );
}
