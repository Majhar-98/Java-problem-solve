//Write a program that will count number of notes from given array
//[1000,500,200,100,50,20,10,5,2,1]
//Input: 562
public class CountNodeArray {
    static int[] notes = new int[] { 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };

    static void countNotes(int amount) {
        System.out.println("Notes for amount " + amount + " are:");
        for (int i = 0; i < notes.length; i++) {
            if (amount >= notes[i]) {
                int count = amount / notes[i];
                System.out.println(notes[i] + " " + count);
                amount = amount - count * notes[i];
            }
        }
    }

    public static void main(String[] args) {
        int amount = 562;
        countNotes(amount);
    }
}
