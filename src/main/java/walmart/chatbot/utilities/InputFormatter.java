package walmart.chatbot.utilities;


public class InputFormatter {
    public String format(String input) {
        return input.isEmpty()|| input.trim().length() == 0 ? "h": input.trim().toLowerCase().replaceAll("\\s+", " ");
    }
}
