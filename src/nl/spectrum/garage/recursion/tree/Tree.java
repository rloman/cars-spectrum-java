package nl.spectrum.garage.recursion.tree;

public class Tree {

    private Integer value;

    private Tree left; // contains smaller items than value
    private Tree right;

    public void add(int value) {
        if(this.value == null) {
            this.value = value;

            this.left = new Tree();
            this.right = new Tree();
        }
        else {
            if(value < this.value) {
                this.left.add(value);
            }
            else {
                this.right.add(value);
            }
        }
    }

    public void print() {
        if(this.left !=null) {
            this.left.print();
        }
        if(this.value != null) {
            System.out.println(this.value);
        }
        if(this.right != null) {
            this.right.print();
        }
    }


    public int size() {
        if(this.value == null) {
            return 0;
        }
        else {
            return 1+this.left.size()+this.right.size();
        }
    }


}
