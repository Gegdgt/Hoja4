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
    private String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    private String[] operators = {"+", "-", "*", "/"};
    private  int number1 = 0, number2 = 0;
    public int Evaluate(String expresion){
        try{
        	String[] values = expresion.split(" ");
            for(int i = 0; i < values.length; i++){
                if(Arrays.asList(numbers).contains(values[i])){ 
                    Stack.push(Integer.parseInt(values[i]));
                }
                else if (Arrays.asList(operators).contains(values[i])){
                	if (Stack.count() == 2){
                        if(values[i].equals("+")){
                            number2 = Stack.pull();
                            number1 = Stack.pull();
                            Stack.push(number1 + number2);
                        }
                        else if (values[i].equals("-")){
                        	number2 = Stack.pull();
                            number1 = Stack.pull();
                            Stack.push(number1 - number2);
                        }
                        else if(values[i].equals("*")){
                        	number2 = Stack.pull();
                            number1 = Stack.pull();
                            Stack.push(number1 * number2);
                        }
                        else if(values[i].equals("/")){
                        	number2 = Stack.pull();
                            number1 = Stack.pull();
                            if(number2 == 0){
                                throw new Exception();
                            }
                            else Stack.push(number1/number2);
                        }
                        else throw new Exception();
                    }
                    else throw new Exception();
                }
                else throw new Exception();
            }
            return Stack.pull();
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            return -99999;
        }
    }
}
