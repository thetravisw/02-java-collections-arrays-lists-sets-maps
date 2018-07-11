import java.lang.reflect.Array;
import java.util.*;


public class Lab02 {
    public static void main(String args[]) {
    }


    public static int[] roll ( int n){
        int[] results = new int[n];
        for (int i = 0; i < n; i++) {
            Random rand = new Random();
            int diceroll = 1 + (rand.nextInt((6)));
                results[i]=diceroll;
        }
        return results;
    }


    public static boolean containsDuplicates (int[] array){
    boolean results = false;
    for (int i=0; i < array.length-1; i++)
    {
        for (int j=i+1; j < array.length; j++){
            if (array[i] == array [j]) results = true;
        }
    }
    return results;
    }

    public static float calcAvg (int[] array){
        float average;
        float sum=0;
        for(int i =0; i < array.length; i++){
            sum += array[i];
        }
        average = sum / (array.length);
        return average;
    }

    public static int[] lowAvg (int[][] arrayOfArrays){
        float [] averages = new float [arrayOfArrays.length];

        for (int i =0; i < arrayOfArrays.length; i++){
            float avg = calcAvg(arrayOfArrays[i]);
            averages[i] = avg;
        }

        int lowindex = 0;
        for (int i = 0; i < averages.length; i++){
            if (averages[i]< averages[lowindex]) lowindex = i;
        }

        return arrayOfArrays[lowindex];
    }


    public static void Analyze (int[][] weatherData) {
        //  Builds out Hashset
        HashSet<Integer> set = new HashSet<>();
        for (int i =0; i < weatherData.length; i++){
            for (int j = 0; j < weatherData[i].length; j++){
                set.add(weatherData[i][j]);
            }
        }

        //Find Min/Max
        int minimum = Collections.min(set);
        int maximum = Collections.max(set);


        //create list for unseen temps
        List temps = new ArrayList<Integer>();
        //Iterate through to see if they are in hash set
        for (int i = minimum+1; i < maximum-1; i++){
            if (set.contains(i)){
                temps.add(i);
            }
        }

        //  print
        System.out.println("High Temp:  " + maximum);
        System.out.println("Low Temp:  " + minimum);


        for (int i=0; i < temps.size(); i++){
            System.out.println("Never saw temperature:  " + temps.get(i));
        }
    }

//    public static String tally (List votes){
//        List voteCount = new ArrayList<Array>();
//
//
//
//
//    }

}

