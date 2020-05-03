package khankazanraees.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Test Case: Input Number => n = 12
        //Output: 1 2 4 5 7 9 10 12 14 16 17 19 

        int n = 12;
        ArrayList<Integer> getTerms;
        getTerms = getTheTermsInSequence(n);

        System.out.println("The First " + n + " Terms are: ");
        for (int i = 0; i < getTerms.size(); i++) {
            System.out.print(getTerms.get(i) + " ");
        }

    }

    static ArrayList<Integer> getTheTermsInSequence(int number) {

        ArrayList<Integer> getNumberOfTerms = new ArrayList<>();
        double temp;

        for (int i = 0; i < number; i++) {
            int a = (i + 1);
            temp = (2 * a) - (0.5 * (1 + (Math.sqrt((8 * a) - 7))));
            getNumberOfTerms.add((int) Math.ceil(temp));
        }

        return getNumberOfTerms;
    }

}
