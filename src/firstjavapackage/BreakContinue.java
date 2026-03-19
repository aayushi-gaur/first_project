package firstjavapackage;

public class BreakContinue {

    public static void main (String[] args) {

        BreakContinue bc = new BreakContinue();
        bc.breakExample();
        bc.continueExample();
    }

    /*
    For break, the loop will instantly be exited and not printed further.
     */
    public void breakExample() {
        int i;
        for (i=0; i<5; i++){
            if (i==3) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("i=" + i);
    }

    /* For continue the value of i will keep incrementing and the loop will continue until the condition is false.
    In this example when i is greater than 3, the loop will skip the print statement and continue to the next iteration.
    So it will print 0, 1, 2, 3 and then skip 4 and print "i=5" at the end. */
    public void continueExample() {
        int i;
        for (i=0; i<5; i++){
            if (i>3) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("i=" + i);
    }
}
