package exercise;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void enlargeArrayImage1() {
        String[][] image = {
                {"*", "*", "*", "*"},
                {"*", " ", " ", "*"},
                {"*", " ", " ", "*"},
                {"*", "*", "*", "*"},
        };
        String [][] result={
                {"*", "*", "*", "*", "*", "*", "*", "*"},
        {"*", "*", "*", "*", "*", "*", "*", "*"},
        {"*", "*"," "  ," "  ," "  ," "  , "*", "*"},
        {"*", "*"," "  ," "  ," "  ," "  , "*", "*"},
            {"*", "*"," "  ," "  ," "  ," "  , "*", "*"},
        {"*", "*"," "  ," "  ," "  ," "  , "*", "*"},
        {"*", "*", "*", "*", "*", "*", "*", "*"},
        {"*", "*", "*", "*", "*", "*", "*", "*"},};
        Assertions.assertThat(App.enlargeArrayImage(image)).isEqualTo(result);
    }
    @Test
    void enlargeArrayImage2() {
        String[][] image = {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
        };
        String [][] result={
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},};
        Assertions.assertThat(App.enlargeArrayImage(image)).isEqualTo(result);
    }
}