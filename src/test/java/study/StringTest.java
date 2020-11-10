package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


public class StringTest {
    @Test
    public void splitTest() {
        {
            final String test = "1,2";
            final String[] splitString = test.split(",");
            assertThat(splitString)
                    .contains("1", "2");
        }

        {
            final String test = "1";
            final String[] splitString = test.split(",");
            assertThat(splitString)
                    .containsExactly("1");
        }
    }

    @Test
    public void subStringTest() {
        final String test = "(1,2)";
        final String substring = test.substring(1, 4);
        assertThat(substring)
                .isEqualTo("1,2");
    }

    @Test
    @DisplayName("charAt 테스트")
    public void charAtTest() {
        {
            final String test = "abc";
            final char charAtString = test.charAt(1);
            assertThat(charAtString)
                    .isEqualTo('b');
        }

        {
            assertThatThrownBy(() -> {
                final String test = "ab";
                test.charAt(2);
            }).isInstanceOf(IndexOutOfBoundsException.class)
                    .hasMessageContaining("index out of range: 2");
        }
    }
}
