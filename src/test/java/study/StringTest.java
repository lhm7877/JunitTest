package study;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;


public class StringTest {
    @Test
    public void splitTest() {
        final String test1 = "1,2";
        final String[] split1 = test1.split(",");
        assertThat(split1)
                .contains("1","2");

        final String test2 = "1";
        final String[] split2 = test2.split(",");
        assertThat(split2)
                .containsExactly("1");
    }

    @Test
    public void subStringTest() {
        final String test = "(1,2)";
        final String substring = test.substring(1, 4);
        assertThat(substring)
                .isEqualTo("1,2");
    }
}
