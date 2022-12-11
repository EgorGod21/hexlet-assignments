package exercise.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class University implements Iterable<Student>
        // BEGIN (write your solution here)

        // END
//CHECKSTYLE: stop LeftCurly check
{
    //CHECKSTYLE: resume LeftCurly check
    private  Student[] students;

    public University(final Student[] realStudents) {
        this.students = realStudents;

    }

    @Override
    public Iterator<Student> iterator() {
      return new StudentIterator();
    }

    private  class StudentIterator implements Iterator<Student>{



        private int index=0;
        @Override
        public boolean hasNext() {
            return index<students.length;
        }

        @Override
        public Student next() {
            return students[index++];
        }
    }
}
