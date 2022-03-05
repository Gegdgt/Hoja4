import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Tests {
    
    StackFactory<Integer> SF = new StackFactory<Integer>();
    Stack<Integer> stack = null;
    
    @Test
    public void testALStack(){
        stack = SF.Create(1);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(5);
        stack.pull();
        Integer i = 3;
        assertEquals(i, stack.pull());
    }

    @Test
    public void testVStack(){
        stack = SF.Create(2);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(5);
        stack.pull();
        Integer i = 3;
        assertEquals(i, stack.pull());
    }

    @Test
    public void testSLLStack(){
        stack = SF.Create(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(5);
        stack.pull();
        Integer i = 3;
        assertEquals(i, stack.pull());
    }

    @Test
    public void testDLLStack(){
        stack = SF.Create(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(5);
        stack.pull();
        Integer i = 3;
        assertEquals(i, stack.pull());
    }
}
