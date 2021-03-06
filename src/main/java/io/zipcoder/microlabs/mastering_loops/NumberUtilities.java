package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {

        StringBuilder even = new StringBuilder();


        if (start %2 != 0){

            start += 1;

        }

        for (int i = start; i < stop; i += 2){

            even.append(i);
        }

        return even.toString();
    }


    public static String getOddNumbers(int start, int stop) {

        StringBuilder odd = new StringBuilder();

        if (start %2 == 0){

            start -= 1;

        }

        for (int i = start; i < stop; i += 2){

            odd.append(i);
        }

        return odd.toString();
    }


    public static String getSquareNumbers(int start, int stop, int step) {

        StringBuilder square  = new StringBuilder();

        for (int i = start; i < stop; i += step)  {

            int sqrRoot = (int) Math.pow(i,2);
            square.append(sqrRoot);
        }

        return square.toString();

    }


    public static String getRange(int start, int stop, int step) {

        StringBuilder range = new StringBuilder();

        for (int i = start; i < stop; i += step){

             range.append(i);
        }

        return range.toString();

    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {

        StringBuilder expon = new StringBuilder();

        for (int i = start; i < stop; i += step){

            int exponVar = exponent;

            int startExpon = (int) Math.pow(i, exponVar);

            expon.append(startExpon);

        }

        return expon.toString();

    }
}
