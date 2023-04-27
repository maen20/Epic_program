//import java.util.Arrays;
public class Assignment3 {
    public static void main(String[] args) {
   int[] array={-1,5,0,1,9,3}; //6

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
        for(int i = 0 ; i < array.length;i++)
        {
            for(int j = i+1 ; j< array.length;j++)
            {
                if(array[i] > array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.print(array[i]+" ");
        }

    }


}
