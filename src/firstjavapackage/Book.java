package firstjavapackage;

public class Book {
    private int noOfCopies = 0;

    public Book(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public void setNoOfCopies (int noOfCopies) {
        if (noOfCopies > 0) {
            this.noOfCopies = noOfCopies;
        }
    }

    public void increaseNoOfCopies (int howMuch) {
        this.noOfCopies = this.noOfCopies + howMuch;
    }

    public void decreaseNoOfCopies (int howMuch) {
        this.noOfCopies = this.noOfCopies - howMuch;
    }
}
