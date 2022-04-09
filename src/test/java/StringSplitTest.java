import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringSplitTest {
    StringSplit stringSplit;

    @BeforeEach
    public void createObject() {
        stringSplit = new StringSplit();
    }

    @Test
    public void enterEmpty() {
        String[] solution = stringSplit.solution("");
        assertNull(solution);
    }

    @Test
    public void oddCharacter() {
        String[] solution = stringSplit.solution("a");
        String [] excepted={"a-"};
        assertArrayEquals(excepted,solution);

        String[] solution1 = stringSplit.solution("ali");
        String [] excepted1={"a","l","i","-"};
        assertArrayEquals(excepted1,solution1);
//
//        String[] solution2 = stringSplit.solution("alierfagh");
//        String [] excepted2={"a","l","i","e","r","f","a","g","h","-"};
//        assertArrayEquals(excepted2,solution2);

    } @Test
    public void evenCharacter() {
        String[] solution = stringSplit.solution("aa");
        String [] excepted={"a","a"};
        assertArrayEquals(excepted,solution);

        String[] solution1 = stringSplit.solution("alia");
        String [] excepted1={"a","l","i","a"};
        assertArrayEquals(excepted1,solution1);

        String[] solution2 = stringSplit.solution("alierfagha");
        String [] excepted2={"a","l","i","e","r","f","a","g","h","a"};
        assertArrayEquals(excepted2,solution2);

    }
}