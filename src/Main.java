// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.


        // Press Shift+F10 or click the green arrow button in the gutter to run the code.

        for(int i=0;i<=100;i++){
          if(i%2==0)
              System.out.println("even: "+i);
          else if(i%2!=0)
              System.out.println("odd: "+i);
        }
        System.out.println("-----while loop------");
   int x=0;
        while(x<=100){
            if(x%2==0)
                System.out.println("even: "+x);
            else if(x%2!=0)
                System.out.println("odd: "+x);
            x++;
        }
        System.out.println("-----DO-WHILE-----");

        int y = 0;
        do {
            if(y%2==0)
                System.out.println("even: "+y);
            else if (y%2!=2)
                System.out.println("odd: "+y);
            y++;
        }
        while (y <=100);
    }
}