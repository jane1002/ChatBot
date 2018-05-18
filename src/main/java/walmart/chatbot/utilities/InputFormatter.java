package walmart.chatbot.utilities;


import org.apache.commons.lang3.StringUtils;

public class InputFormatter {

    /**
     * Trim space before and after the whole string, only leave one space between words.
     * Covert string to lowercase.
     *
     * @param input
     * @return string in lowercase
     */

    public String trimSpace(String input) {
        return input.isEmpty() || input.trim().length() == 0 ? "h" : input.trim().toLowerCase().replaceAll("\\s+", " ");
    }

    /**
     * Capitalize the first letter in each word.
     *
     * @param str
     * @param splitter
     * @return String, first letter in every word is in uppercase.
     */

    public String capitalizeMulWords(String str, String splitter) {
        String[] words = str.split(splitter);
        String res = "";

        for (int i = 0; i < words.length; i++) {
            res += capitalizeSingleWord(words[i]);

            if (i != words.length - 1) {
                res += " ";
            }
        }
        return res;
    }

    public String capitalizeSingleWord(String str) {
        return StringUtils.capitalize(str);
    }
}
