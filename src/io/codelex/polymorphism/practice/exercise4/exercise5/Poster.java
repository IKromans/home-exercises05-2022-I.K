package io.codelex.polymorphism.practice.exercise4.exercise5;

public class Poster extends Advert {

    private String dimensions;
    private int nrOfCopies;
    private double costPerCopy;

    public Poster(int fee, String size, int amount, double costPerCopy) {
        super(fee);
        this.dimensions = size;
        this.nrOfCopies = amount;
        this.costPerCopy = costPerCopy;
    }

    public int cost() {
        return (int) (fee + costPerCopy * nrOfCopies);
    }

    @Override
    public String toString() {
        return super.toString() + " Poster{" +
                "dimensions=" + dimensions +
                ", nrOfCopies=" + nrOfCopies +
                ", costPerCopy=" + costPerCopy +
                "} ";
    }
}
