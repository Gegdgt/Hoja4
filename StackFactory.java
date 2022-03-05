public class StackFactory<T>  {
    
    public Stack<T> Create(int type){
        if(type == 1){
           return new ALStack<T>();
        }
        else if(type == 2){
            return new VStack<T>();
        }
        else if(type == 3){
            return new LStack<T>();
        }
        else{
            return null;
        }
    }
}
