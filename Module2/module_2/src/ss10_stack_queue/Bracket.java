package ss10_stack_queue;

import java.util.Stack;

public class Bracket {
   public String checkBracket(String str){
       Stack bStack = new Stack();
       for (int i = 0; i < str.length(); i++) {
           if (str.charAt(i) == '('){
               bStack.push(str.charAt(i));
           }
       }
       for (int i = 0; i < str.length(); i++) {
           if (str.charAt(i) == ')'){
               if (bStack.size() > 0 ){
                   bStack.pop();
               }else {
                   return "Not Well";
               }
           }
       }
       if (bStack.size() == 0) {
           return "Well";
       }
       return "Not Well";
   }

    public static void main(String[] args) {
     Bracket bracket = new Bracket();
        System.out.println(bracket.checkBracket("(– b + (b^2 – 4*a*c)^(0.5/ 2*a))"));
   }

}
