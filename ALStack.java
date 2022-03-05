import java.util.ArrayList;


/*
* Es la clase que emplea ArrayList para crear un Stack.
*/
public class ALStack<T> extends Stack<T> {

	private ArrayList<T> array;
	
	public ALStack() {
		array = new ArrayList<T>();
	}
	
	
	/*** 
	 * Pushes a value into the stack 				
	 * @param value T
	 */
	@Override
	public void push(T value) {		
		array.add(0, value);
	}

	
	/***
	 * Errases and returns the last pushed value in the stack
	 * @return value T (last value pushed)
	 */
	@Override
	public T pull() {
		return array.remove(0);
	}

	
	/***
	 * Returns the last value pushed into the stack 
	 * @return T (last value pushed)
	 */
	@Override
	public T peek() {
		return array.get(0);
	}

	
	/***
	 * Returns the length of the stack
	 * @return int length
	 */
	@Override
	public int count() {
		return array.size();
	}

	
	/***
	 * Tells if the stack is empty or not
	 * @return boolean
	 */
	@Override
	public boolean isEmpty() {		
		return array.isEmpty();
	}

}
