package ss9_dsa_danh_sach.bai_tap.implement_method_arraylist;


public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList (){
        elements = new Object[DEFAULT_CAPACITY];
    }


    public MyList(int capacity){
     elements = new Object[capacity];
    }
    public void add(int index , E element){
     if (index < 0|| index > size){
         throw new IndexOutOfBoundsException();
     } else if(size == elements.length){
         ensureCapacity();
     } else {
         for (int i = size; i >= index; i--) {
             elements[i + 1] = elements[i];
         }
         elements[index] = element;
         size++;
     }
    }
    public boolean add(E element){
        if (size >= elements.length){
            return false;
        }
        elements[size++] = element;
        return true;
    }
    public int size(){
        return size;
    }
    E get(int i){
        if (i < 0 || i > size()){
            return null;
        }
        return (E) elements[i];
    }
    public boolean isEmpty(){
        if (size == 0){
            return true;
        }
        return false;
    }
    public Object clone(){
        Object[] newArr = new Object[size];
        for (int i = 0; i < size(); i++) {
            newArr[i] = elements[i];
        }
        return newArr;
    }
    public E remove(int index){
        E temp = (E) elements[index];
        if (index < 0||index > size){
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < size() ; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return temp;
    }
    public void clear (){
        for (int i = 0; i <= size(); i++) {
          elements[i] = null;
        }
        size = 0;
    }
    public int indexOf(E o){
        for (int i = 0; i < size(); i++) {
            if (o.equals(elements[i])){
                return i;
            }
        }
        return -1;

    }

    public boolean contains(E o){
        for (int i = 0; i < size(); i++) {
            if(o.equals(elements[i])){
                return true;
            }
        }
        return false;

    }
    public void ensureCapacity(){
           elements = new Object[elements.length + elements.length/2];
    }


}
