import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MagicEightBallTest {

    private MagicEightBall myAnswers;

    @Before
    public void before () {
        ArrayList<String> testAnswers = new ArrayList<>();
        testAnswers.add("Yes");
        testAnswers.add("No");
        testAnswers.add("Maybe");
        this.myAnswers = new MagicEightBall(testAnswers);
    }

    @Test
    public void hasNumberOfAnswers() {
        assertEquals(3, myAnswers.getAnswerCount());
    }

    @Test
    public void  canGetFirstAnswer() {
        assertEquals("Yes", myAnswers.getAnswerAtIndex(0));
    }

    @Test
    public void canAddAnswerToList() {
        myAnswers.addAnswer("You wish");
        assertEquals(4, myAnswers.getAnswerCount());
    }

    @Test
    public void canRemoveAnswerFromList() {
        myAnswers.removeAnswer("You wish");
        assertEquals(3,myAnswers.getAnswerCount());
    }

    @Test
    public void canGetRandomAnswer() {
        ArrayList<String> copy = myAnswers.getAnswers();
        String randomAnswer = myAnswers.getRandomAnswer();
        assertTrue(copy.contains(randomAnswer));
    }
}
