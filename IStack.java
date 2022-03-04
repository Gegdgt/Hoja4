public interface IStack<T> {
    //@params value, is the value that will be pushed in the stack.
	void push(T value);
	
    /*
    *removes and returns the last pushed value in the stack
    *@returns the las pushed value in the stack
    */
	T pull();
	
    /*
    *@returns the las pushed value in the stack
    */
	T peek();
	
    /*
    *@returns the number of elements in the stack
    */
	int count();
	
    /*
    *@returns the status of the stack
    */
	boolean isEmpty();
}
