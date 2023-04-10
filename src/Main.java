// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.


        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        System.out.println("***FOR loop ***");
        int sum = 0;
        int sum2=0;
        for (int i = 0; i <= 100; i++) {
            if(i%2==0){
            sum += i;}
            else if(i%2!=0){
                sum2 +=i;}
        }
        System.out.println("The even numbers sum =" + sum);
        System.out.println("The odd numbers sum =" + sum2);
        System.out.println("***while loop ***");

        int sum3=0;
        int sum4=0;
        int i=0;
        while(i<=100){
            if(i%2==0){
                sum3 += i;}
            else if(i%2!=0){
                sum4 +=i;}
            i++;
        }
        System.out.println("The even numbers sum =" + sum3);
        System.out.println("The odd numbers sum =" + sum4);
        System.out.println("***do while***");
        int x=0;

        int sum5=0;

        do{
            sum5 += x;
            x+=2;

        }
        while(x<=100);
        System.out.println("The even numbers sum =" + sum5);
        int y=1;
        int sum6=0;
        do{
            sum6 += y;
            y+=2;

        }
        while(y<=100);
        System.out.println("The odd numbers sum =" + sum6);
    }
}