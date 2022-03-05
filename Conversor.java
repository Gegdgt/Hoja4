import java.util.Scanner;
import java.io.*;

public class Conversor {

    /*
    * Construct of the class that generates the stack
    * @params type of the stack used as param again in the Factory
    */
    public Conversor(int tipo){
        operaciones = SF.Create(tipo);
    }
    public Stack<String> operaciones;
    StackFactory<String> SF = new StackFactory<String>();

    /*
    * Method that will read the file "datos.txt"
    */
    public void leer()
    {
        try {
            File arch = new File("datos.txt");
            Scanner leer = new Scanner(arch);
            while (leer.hasNextLine()) {
              String data = leer.nextLine();
              operaciones.push(InfaPst(data));
            }
            leer.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }

    }

    /*
    * Method that will convert an expresion in infix to postfix
    * @params String op that has the operation to convert
    * @returns the operation converted to postfix
    */
    public String InfaPst(String op){
        String r = "";
        Stack<String> stack = null;
        StackFactory<String> st = new StackFactory<String>();
        stack = st.Create(1);
        for (int i = 0; i <op.length() ; i++) {
            String c = Character.toString(op.charAt(i));
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

    /*
    * Method that gets the hierarchy of the operator
    * @params String x that is the operator to be evaluated
    * @returns the hierarchy of the operator in a numeric value
    */
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