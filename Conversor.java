public class Conversor {

    public static String InfaPst(String op){

        String r = "";
        Stack stack = new Stack();
        for (int i = 0; i <op.length() ; i++) {
            char c = op.charAt(i);
            if(jerarquia(c)>0)
            {
                while(stack.isEmpty()==false && jerarquia(stack.peek())>=jerarquia(c))
                {
                    r += stack.pop();
                }
                stack.push(c);
            }
            else if(c==')')
            {
                char l = stack.pop();
                while(l!='(')
                {
                    r += l;
                    l = stack.pop();
                }
            }
            else if(c=='(')
            {
                stack.push(c);
            }
            else
            {
                r += c;
            }
        }
        for (int i = 0; i <=stack.size() ; i++) {
            r += stack.pop();
        }
        return r;
    }
    static int jerarquia(char c){
        switch (c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
}