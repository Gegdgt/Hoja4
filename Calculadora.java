import java.util.Arrays;
public class Calculadora implements IPosfixCalc {
    
    StackArrayList<Integer> Stack = new StackArrayList<Integer>();
    
    
    /** 
     * @param expresion in posfix
     * @return int Result of the hole expresion
     * @throws DivideByZero, IncorrectOperator, InsufficientOperands
     */
    public int Evaluate(String expresion){
        String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        try{
            for(int i = 0; i < expresion.length(); i++){
                String l = expresion.substring(i, 1);
                if(Arrays.asList(numbers).contains(l)){
                    Stack.push(Integer.parseInt(l));
                }
                else if (Stack.count() == 2){
                    if(l.equals("+")){
                        Stack.push((Stack.pull() + Stack.pull()));
                    }
                    else if (l.equals("-")){
                        Stack.push(Stack.pull() - Stack.pull());
                    }
                    else if(l.equals("*")){
                        Stack.push(Stack.pull() * Stack.pull());
                    }
                    else if(l.equals("/")){
                        int n = Stack.pull();
                        int n1 = Stack.pull();
                        if(n1 == 0){
                            throw new DivideByZero("No es posible realizar una división entre cero.");
                        }
                        else Stack.push(n/n1);;
                    }
                    else throw new IncorrectOperator("Operador desconocido.");
                }
                else throw new InsufficientOperands("No hay operandos suficientes.");
            }
            return Stack.pull();
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            return -9999;
        }
    }
}
