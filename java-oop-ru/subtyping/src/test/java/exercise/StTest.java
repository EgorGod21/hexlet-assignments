package exercise;

import  static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StTest {

    @Test
    void addDigits() {

        assertThat(St.isBalanced("()()")).isTrue();



    }
}