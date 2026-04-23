import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineKittensParamTest {
    private final int count;
    private final int expected;

    public FelineKittensParamTest(int count, int expected) {
        this.count = count;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{ {1, 1}, {5, 5}, {0, 0} };
    }

    @Test
    public void shouldReturnCorrectKittensCount() {
        Feline feline = new Feline();
        assertEquals(expected, feline.getKittens(count));
    }
}
