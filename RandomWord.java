import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        int counter = 0;
        String champion = "";

        while (!StdIn.isEmpty()) {
            String current = StdIn.readString();
            counter++;

            if (StdRandom.bernoulli((double) 1 / counter)) {
                champion = current;
            }
        }
        StdOut.println(champion);
    }
}