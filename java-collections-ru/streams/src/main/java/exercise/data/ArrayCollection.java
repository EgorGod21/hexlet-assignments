package exercise.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayCollection<T> implements Collection<T> {

    private T[] array = (T[]) new Object[1];

    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size(); i++) {
            if (array[i].equals(o)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayCollectionIterator();
    }

    @Override
    public Object[] toArray() {
        if (isEmpty())
            return new Object[]{};
        Object [] newArray=new Object[size()];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i]=array[i];
        }
        return newArray;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return (T1[]) toArray();
    }

    @Override
    public boolean add(T t) {
       if (size()>=array.length){
           T [] oldArray=array;
           array=(T[]) new Object[array.length*2];
           System.arraycopy(oldArray,0,array,0,size());
       }
       array[size]=t;
       size++;
       return true;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < size(); i++) {
           if (array[i].equals(o)){
           System.arraycopy(array,i+1,array,i,size()-1-i);
           size--;
           return true;
           }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object o:c){
          if (!this.contains(o))
          return false;
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        for (T t:c){
            this.add(t);
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        for (Object o:c){
            this.remove(o);
        }
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        for (T o:array){
            if (!c.contains(o)){
                this.remove(o);

            }
        }
        return false;
    }

    @Override
    public void clear() {
     array= (T[]) new Object[0];
     size=0;
    }
    private class ArrayCollectionIterator implements Iterator<T>{
private int index=0;
        @Override
        public boolean hasNext() {
            return index<size();
        }

        @Override
        public T next() {
            if (!hasNext())
                throw new NoSuchElementException();
            return array[index++];
        }
    }
}
