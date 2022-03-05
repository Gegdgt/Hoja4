import java.util.Arrays;
public class Calculator implements IPosfixCalc {
    Stack<Integer> Stack;
    StackFactory<Integer> SF = new StackFactory<Integer>();

    //Constructor where the stack is created
    public Calculator(int tipo){
        Stack = SF.Create(tipo);
    }
    /** 
     * @param expresion in posfix
     * @return int Result of the hole expresion
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
                            throw new Exception();
                        }
                        else Stack.push(n/n1);;
                    }
                    else throw new Exception();
                }
                else throw new Exception();
            }
            return Stack.pull();
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            return -9999;
        }
    }
}
