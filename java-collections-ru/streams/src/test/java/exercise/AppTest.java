package exercise;

import exercise.data.*;

import exercise.data.University;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import org.junit.jupiter.api.BeforeAll;
import java.util.NoSuchElementException;

public class AppTest {

    private static int studentsCount = 5;
    private static Student[] students = new Student[studentsCount];

    @BeforeAll
    static void prepareData() {
        for (var i = 0; i < studentsCount; i++) {
            students[i] = new Student();
        }
    }

    @Test
    void testGroup() {

        var group = new Group(students);
        var iterator = group.iterator();

        assertThat(iterator.hasNext()).isTrue();
        assertThat(iterator.next()).isEqualTo(students[0]);
        assertThat(iterator.next()).isEqualTo(students[1]);
        assertThat(iterator.next()).isEqualTo(students[2]);
        assertThat(iterator.next()).isEqualTo(students[3]);
        assertThat(iterator.next()).isEqualTo(students[4]);

        assertThatThrownBy(() ->  iterator.next()).isInstanceOf(NoSuchElementException.class);
    }

    @Test
    void testUniversity() {

        var university = new University(students);
        var iterator = university.iterator();

        assertThat(iterator.hasNext()).isTrue();
        assertThat(iterator.next()).isEqualTo(students[0]);
        assertThat(iterator.next()).isEqualTo(students[1]);
        assertThat(iterator.next()).isEqualTo(students[2]);
        assertThat(iterator.next()).isEqualTo(students[3]);
        assertThat(iterator.next()).isEqualTo(students[4]);

        assertThatThrownBy(() ->  iterator.next()).isInstanceOf(NoSuchElementException.class);
    }
}
