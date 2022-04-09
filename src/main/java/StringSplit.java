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


    private String[] convertToEven(String text) {
        int length = text.length() + 1;
        String[] split = new String[length];
        System.out.println(split.length);
        String[] split1 = text.split("");
        int index;
        for (index = 0; index < split1.length; index++) {
            split[index] = split1[index];
        }
        split[index] = "-";
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

