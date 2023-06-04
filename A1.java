import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A1 {
    public static void main(String[] args) {
        int[] arr=new int[15];
        for (int i = 0; i < arr.length; i++) {
         arr[i]=i;
        }

        ArrayList<Object> list1  = new ArrayList<>();
        ArrayList<Object> list2 = new ArrayList<>();
        ArrayList<Object> list3 = new ArrayList<>();

        for (int n = 0; n <=arr.length; n++) {
            if(n<5){
                list1.add(n);
            } else if (n>=5&&n<10) {
                list2.add(n);

            } else if (n>=10) {
                list3.add(n);
            }
        }
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        System.out.println("list3 = " + list3);

        List<Integer> array=  Arrays.stream(arr)
                .filter(n->n<5)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(array);

        List<Integer> array2=  Arrays.stream(arr)
                .filter(n->n>=5&&n<=10)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(array2);

        List<Integer> array3=  Arrays.stream(arr)
                .filter(n->n>10)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(array3);


        System.out.println("reversed  = " + Arrays.toString(reverseArray(arr)));

    }
    public static int[] reverseArray(int[] array){
        int[] reverse=new int[array.length];
        int j=0;
        for (int i=array.length -1;i>=0;i--) {
            reverse[j]=array[i];
            j++;
        }
        return reverse;
    }

}
