<<<<<<< HEAD
public class Conversor<T> {
=======
import java.util.Stack;

public class Conversor {

    Stack operaciones;
    Stack convertidas;
    public void leer()
    {
        File doc = new File("");
        Scanner obj = new Scanner(doc);
        while (obj.hasNextLine())
          operaciones.push(obj);
        for(int i =0; i <operaciones.size();i++){
            convertidas.push(InfixaPostfix(operaciones.pop()));
        }
    }
    public static String InfixaPostfix(String op){
>>>>>>> bc57ab512dd0a2e4ee919bcab01e9122705480e7

    public String InfaPst(String op){
        String r = "";
        Stack<String> stack = null;
        StackFactory<String> st = new StackFactory<String>();
        stack = st.Create("AL");
        for (int i = 0; i <op.length() ; i++) {
            char c = op.charAt(i);
            if(jerarquia(c)>0)
            {
                while(stack.isEmpty()==false && jerarquia(stack.peek())>=jerarquia(c))
                {
                    r += stack.pull();
                }
                stack.push(c);
            }
            else if(c==')')
            {
                char l = stack.pull();
                while(l!='(')
                {
                    r += l;
                    l = stack.pull();
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
        for (int i = 0; i <=stack.count() ; i++) {
            r += stack.pull();
        }
        return r;
    }
    public int jerarquia(String c){
        switch (c){
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
            case "^":
                return 3;
        }
        return -1;
    }
}