public class Controlador {
    
    public static void main(String[] args){
        Calculator calculadora = new Calculator();
        StackFactory<String> creator = new StackFactory<String>();
        Stack<String> expresiones = creator.Create("AL");

    }
}
