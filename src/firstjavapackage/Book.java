package firstjavapackage;

public class Book {
    private int noOfCopies = 0;

    //Constructor
    public Book() {

    }

    public Book(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    //set number of copies of books
    public void setNoOfCopies (int noOfCopies) {
        if (noOfCopies > 0) {
            this.noOfCopies = noOfCopies;
        }
    }

    // increase and decrease number of books
    public void increaseNoOfCopies (int howMuch) {

        this.noOfCopies = this.noOfCopies + howMuch;
    }

    public void decreaseNoOfCopies (int howMuch) {

        this.noOfCopies = this.noOfCopies - howMuch;
    }
}
