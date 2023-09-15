package ss9_dsa_danh_sach.bai_tap.implement_method_arraylist;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList (){
    }
    public MyList(int capacity){
     elements = new Object[capacity];
    }
    void add(int index , E element){

    }
    void ensureCapacity(int minCapacity){
        if(size >= elements.length){

        }
    }

}
