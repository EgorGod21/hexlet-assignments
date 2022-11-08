package exercise;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {
    List <Integer> numbers1;
    List <Integer> numbers2;
    @BeforeEach
     void init(){
        numbers1=new ArrayList<>();
        Collections.addAll(numbers1, 1,2,3,4);
        numbers2=new ArrayList<>();
        Collections.addAll(numbers2, 7,3,10);
    }

    @Test
    void testTake1() {
        List <Integer> expected=new ArrayList<>(Arrays.asList(1, 2));
        Assertions.assertThat(App.take(numbers1,2))
                .isEqualTo(expected);
    }
    @Test
    void testTake2() {
        List <Integer> expected=new ArrayList<>(Arrays.asList(7,3,10));
        Assertions.assertThat(App.take(numbers2, 8))
                .isEqualTo(expected);
    }
}
