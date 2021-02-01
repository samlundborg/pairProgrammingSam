import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.Random;

    public class SmolTest {

        @BeforeAll
        static void setup() {
            System.out.println("Starting testsuite - (Before All)");
        }

        @BeforeEach
        void setupEach(TestInfo testInfo) {
            System.out.println("Test starts - " + testInfo.getDisplayName());
        }

        @AfterAll
        static void tearDown() {
            System.out.println("Closing testsuite - (After All)");
        }

        @AfterEach
        void tearDownEach(TestInfo testInfo) {
            System.out.println("Test closes - " + testInfo.getDisplayName());
        }

        @Test
        @DisplayName("Tests count3() in class") {
            SmolExerciseTDD testObject = new SmolExerciseTDD();
            int[] array = {3,6,3,7,3};
            int actual = testObject.count3(array);
            Assertions.assertEquals(3,actual);
        }
    }


