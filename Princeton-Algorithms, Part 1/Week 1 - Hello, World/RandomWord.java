/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RandomWord {

    public static void main(String[] args) {

        int index = 1;
        String champion = "";
        while (!StdIn.isEmpty()) {
            String word = StdIn.readString();

            // run the probability of setting word as champion
            if (StdRandom.bernoulli(1 / index)) {
                champion = word;
            }
            index++;
        }
        
        StdOut.println(champion);
    }
}
