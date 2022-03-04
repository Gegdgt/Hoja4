import java.io.*;
public class Archivos { 
    /***
     * Class constructor to instance the File
     */

    /***
     * Reads the file "expresiones.txt" and pushes every expresion into the stack
     * @param StackArrayList<String> Which is the stack that will take all the expresions in it
     */

    private FileReader fr;
    private BufferedReader buffi;
    private String line;
    public void Read(Stack stack){
        try{
            fr = new FileReader("datos.txt");
            buffi = new BufferedReader(fr);
            line = "";
            while((line = buffi.readLine()) != null){
                stack.push(line);
            }
        }
        catch(Exception e){
            System.out.println("Error: "+ e.getMessage());
        }
    }

}
