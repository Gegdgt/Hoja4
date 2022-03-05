import java.util.Scanner;
public class Controlador {
    
    public static void main(String[] args){
        Calculator calculadora = new Calculator();
        StackFactory<String> creator = new StackFactory<String>();
        Stack<String> expresiones = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("¿Qué implementación de Stack desea usar? \n 1. ArrayList  \n 2. Vector \n 3. Lista Simplemente Encadenada \n. 4. Lista Doblemente Encadenada");
    }
}
