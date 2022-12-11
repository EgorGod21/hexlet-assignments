package exercise.data;

import java.util.Iterator;


public class Group implements Iterable<Student> {

    private Student[] students;

    public Group(final Student[] students) {
        this.students = students;
    }

    public  Iterator<Student> iterator() {
        return new StudentsIterator(students);
    }

    private static class StudentsIterator implements Iterator<Student> {
        private Student [] students;
        private int index=0;
        public StudentsIterator(Student[] students) {
            this.students = students;
        }


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
