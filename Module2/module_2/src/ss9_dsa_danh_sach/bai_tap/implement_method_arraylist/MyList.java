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
    void add(int index , E element){
     if (index < 0|| index > size){
         throw new IndexOutOfBoundsException();
     } else if(index== size){
         ensureCapacity();
     } else {
         for (int i = size; i >= index; i--) {
             elements[i + 1] = elements[i];
         }
         elements[index] = element;
         size++;
     }
    }
    boolean add(E element){
        if (size >= elements.length){
            return false;
        }
        elements[size++] = element;
        return true;
    }
    int length(){
        return elements.length;
    }
    int size(){
        return size;
    }
    E get(int i){
        if (i < 0 || i > size()){
            return null;
        }
        return (E) elements[i];
    }
    boolean isEmpty(){
        if (size == 0){
            return true;
        }
        return false;
    }
   protected Object clone(){
        Object[] newArr = new Object[size];
        for (int i = 0; i < size(); i++) {
            newArr[i] = elements[i];
        }
        return newArr;
    }
    E remove(int index){
        for (int i = index; i < size() ; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return (E) elements[index];

    }
    void clear (){
        for (int i = 0; i <= size(); i++) {
          elements[i] = null;
        }
        size = 0;
    }
    int indexOf(E o){
        for (int i = 0; i < size(); i++) {
            if (o == elements[i]){
                return i;
            }
        }
        return -1;

    }

    boolean contains(E o){
        for (int i = 0; i < size(); i++) {
            if(o==elements[i]){
                return true;
            }
        }
        return false;

    }
    void ensureCapacity(){
           elements = new Object[elements.length + elements.length/2];
    }


}
