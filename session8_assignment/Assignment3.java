import java.util.Arrays;
public class Assignment3 {
    public static void main(String[] args) {
   int[] array={-1,5,0,1,9,3}; //6
        System.out.println("array.length = " + array.length);
        System.out.println("min(array) = " + min(array));
        System.out.println("max(array) = " + max(array));
        System.out.println("avg(array) = " + avg(array));
        System.out.print("sorted array: ");
        sorting(array);
    }
 private static int min(int[] array){
        int min = array[0];
        for(int value:array){
            if(value<min){
                min=value;
            }
        }
        return min;
 }
    private static int max(int[] array){
        int max = array[0];
        for(int value:array){
            if(value>max){
                max=value;
            }
        }
        return max;
    }
    private static double avg(int[] array){
        double avg;
        double sum=0;
        for(int value:array){
            sum+=value;
        }
        avg= sum /(array.length);
        return avg;
    }
    private static void sorting(int[] array){
        Arrays.sort(array);
        for(int value:array){
            System.out.print(value+", ");
        }
    }
}
