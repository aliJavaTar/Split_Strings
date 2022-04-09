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
    public void evenCharacter()
    {
        String[] solution = stringSplit.solution("aa");
        String [] excepted={"aa"};
        assertArrayEquals(excepted,solution);

        String[] solution1 = stringSplit.solution("alia");
        String [] excepted1={"al","ia"};
        assertArrayEquals(excepted1,solution1);

        String[] solution2 = stringSplit.solution("alierfagha");
        String [] excepted2={"al","ie","rf","ag","ha"};
        assertArrayEquals(excepted2,solution2);

    }
    @Test
    public void oddCharacter() {
        String[] solution1 = stringSplit.solution("ali");
        String [] excepted1={"al","i-"};
        assertArrayEquals(excepted1,solution1);

        String[] solution2 = stringSplit.solution("alier");
        String [] excepted2={"al","ie","r-"};
        assertArrayEquals(excepted2,solution2);

        String[] solution3 = stringSplit.solution("alierfagh");
        String [] excepted3={"al","ie","rf","ag","h-"};
        assertArrayEquals(excepted3,solution3);
    }
}