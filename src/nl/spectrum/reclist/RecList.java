package nl.spectrum.reclist;

public class RecList {

    private Object head;
    private RecList tail;

    public void add(Object... values) {
        for (Object value : values) {
            if (head == null) {
                head = value;

                tail = new RecList();
            } else {
                tail.add(value);
            }
        }
    }

    public boolean contains(Object o) {
        if(head == null) {
            return false;
        }
        else {
            /*
            if(head.equals(o)) {
                return true;
            }
            else {
                return tail.contains(o);
            }
            */
            return head.equals(o) || tail.contains(o);
        }
    }

    public int size() {
        if(head ==  null) {
            return 0;
        }
        else {
            return 1+tail.size();
        }
    }

    private int indexOf(Object o, int index) {
        if(this.head == null) {
            return -1;
        }
        else {
            if(this.head.equals(o)) {
                return index;
            }
            else {
                return tail.indexOf(o, index+1);
            }
        }

    }

    public int indexOf(Object o) {
        return indexOf(o, 0);
    }

    public void print() {

        if (head != null) {
            System.out.println(head);
            tail.print();
        }
    }


}
