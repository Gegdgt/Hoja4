public class StackFactory<T>  {
    
    public Stack<T> Create(String type){
        if(type.equals("AL")){
           return new ALStack<T>();
        }
        else if(type.equals("V")){
            return new VStack<T>();
        }
        else if(type.equals("L")){
            return new LStack<T>();
        }
        else{
            return null;
        }
    }
}
