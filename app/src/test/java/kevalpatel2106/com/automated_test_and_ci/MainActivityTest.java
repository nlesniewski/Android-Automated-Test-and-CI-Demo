package kevalpatel2106.com.automated_test_and_ci;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Keval on 09-Nov-16.
 *
 * @author {@link 'https://github.com/kevalpatel2106'}
 */
public class MainActivityTest {

    /**
     * Unit test for email.
     *
     * @throws Exception if test fails.
     */
    @Test
    public void validateEmail() throws Exception {
        assertSame(true, MainActivity.validateEmail("kevalpatel2106@gmail.com"));
        assertSame(false, MainActivity.validateEmail("kevalpatel2106gmail.com"));
        assertSame(false, MainActivity.validateEmail(""));
        assertSame(false, MainActivity.validateEmail("k@com"));
    }

}