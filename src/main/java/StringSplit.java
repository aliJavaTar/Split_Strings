import java.util.Arrays;
import java.util.regex.Pattern;

public class StringSplit {
    public String[] solution(String text) {
        if (validation(text)) {
                return convertToEven(text);
        } else return null;

    }

    private String[] convertToEven(String text) {
        int length = text.length() + 1;
        String[] mainArray = text.split("");
        String[] goal = new String[length / 2];
        Arrays.fill(goal, "");

        int  i= 0;
        for (int index = 0; index < goal.length; index++) {
            if (goal[index].length() < 2)
            {
                if (i == mainArray.length-1)
                {
                    goal[index] = mainArray[i] + "-";
                } else goal[index] = mainArray[i] +mainArray[i + 1];
                i += 2;
            }

        }
        return goal;
    }

    private boolean validation(String value) {
        String regex = "[a-z]+";
        return Pattern.matches(regex, value);
    }

}
