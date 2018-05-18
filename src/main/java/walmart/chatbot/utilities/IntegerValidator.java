package walmart.chatbot.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class IntegerValidator implements Validator {

    @Override
    public boolean fire(String s) {

        String regex = "[0-9][0-9]*";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);

        if (m.find() && m.group().equals(s)) {
            return true;
        }
        return false;
    }
}
