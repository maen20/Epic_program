import java.util.Stack;

public class Validation {
    public static void main(String[] args) {
        String par1 = "(())";
        String par2 = "))((";
        String par3 = "((((((";
        String par4 = ")()";

        boolean check1 = isValid(par1);
        boolean check2 = isValid(par2);
        boolean check3 = isValid(par3);
        boolean check4 = isValid(par4);

        System.out.println(par1 + " is valid? " + check1);
        System.out.println(par2 + " is valid? " + check2);
        System.out.println(par3 + " is valid? " + check3);
        System.out.println(par4 + " is valid? " + check4);

    }
    public static boolean isValid(String data){
        //TODO need to be implemented
        Stack<Character> parenthesesStack=new Stack<>();
        for (char x:data.toCharArray()){
            if(x=='('){
                parenthesesStack.push(x);
            }
            else if(x == ')'){
                if(parenthesesStack.isEmpty())
                    return false;
                parenthesesStack.pop();
            }
        }
        return parenthesesStack.isEmpty();
    }
}
