public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        this.size = capacity;
    }

    public void add(E e) {
        if (size == elements.length) {
            System.out.println("keets thuc");
        } else {
            elements[size++] = e;
        }
    }

    public E remote(int index) {
        E[] newElement = (E[]) new Object[DEFAULT_CAPACITY];
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        E removed = (E) elements[index];
        for (int i = 0, j = 0; i < this.size; i++, j++) {
            if (i == index) {
                j--;
                continue;
            }
            newElement[j] = (E) elements[i];
        }
        elements = newElement;
        size--;
        return removed;
    }

    }



