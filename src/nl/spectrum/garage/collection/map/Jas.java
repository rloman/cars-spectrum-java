package nl.spectrum.garage.collection.map;

public class Jas implements Comparable<Jas>  {

    private String owner;


    public Jas(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return this.owner;
    }

    @Override
    public int compareTo(Jas o) {
       return this.owner.compareTo(o.owner);
    }
}
