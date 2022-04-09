import java.util.regex.Pattern;

public class StringSplit {
    public String[] solution(String text) {
        if (validation(text)) {
            if (isOdd(text.length()))
                return convertToEven(text);
            else
                return text.split("");

        } else return null;

    }

    // test = a
    // text -> "a-"
    private String[] convertToEven(String text) {
        String[] split = text.split("");
        split[0] = text + "-";
        return split;
    }

    private boolean validation(String value) {
        String regex = "[a-z]+";
        return Pattern.matches(regex, value);
    }

    public boolean isOdd(int length) {
        return length % 2 != 0;
    }
}

