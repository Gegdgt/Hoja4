import java.util.ArrayList;
/**
 * @author moises.alonso
 *
 */
public class ALStack<T> extends Stack {

	private ArrayList<T> coreList;
	
	public ALStack() {
		coreList = new ArrayList<T>();
	}
	
	
	/*** 
	 * Pushes a value into the stack 				
	 * @param value T
	 */
	@Override
	public void push(T value) {		
		coreList.add(0, value);
	}

	
	/***
	 * Errases and returns the last pushed value in the stack
	 * @return value T (last value pushed)
	 */
	@Override
	public T pull() {
		return coreList.remove(0);
	}

	
	/***
	 * Returns the last value pushed into the stack 
	 * @return T (last value pushed)
	 */
	@Override
	public T peek() {
		return coreList.get(0);
	}

	
	/***
	 * Returns the length of the stack
	 * @return int length
	 */
	@Override
	public int count() {
		return coreList.size();
	}

	
	/***
	 * Tells if the stack is empty or not
	 * @return boolean
	 */
	@Override
	public boolean isEmpty() {		
		return coreList.isEmpty();
	}

}
