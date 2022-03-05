import java.io.File;
import java.util.Scanner;

import javax.naming.LinkRef;
public class Conversor {

    Stack operaciones;
    public void leer()
    {
        File Arch = new File("");
        Scanner linea = new Scanner(Arch);
        while (linea.hasNextLine()){
          operaciones.push(InfaPst(linea));
        }

    }
    public String InfaPst(String op){
        String r = "";
        Stack<String> stack = null;
        StackFactory<String> st = new StackFactory<String>();
        stack = st.Create(1);
        for (int i = 0; i <op.length() ; i++) {
            String c =  Character.toString(op.charAt(i));
            if(jerarquia(c)>0)
            {
                while(stack.isEmpty()==false && jerarquia(stack.peek())>=jerarquia(c))
                {
                    r += stack.pull();
                }
                stack.push(c);
            }
            else if(c==")")
            {
                String l = stack.pull();
                while(l!="(")
                {
                    r += l;
                    l = stack.pull();
                }
            }
            else if(c=="(")
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