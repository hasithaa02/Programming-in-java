package Part1a;

public interface Interface_STK {
	public void push(int element);
	public int pop();
	public void displayStack();
	public boolean isOverflow();
	public boolean isUnderflow();

}

package Part1a;

public class Fixed_stk implements Interface_STK{
	
	private int stack[]=new int[5];
	private int top=-1;
	
	

	public Fixed_stk(int[] s, int top) {
		super();
		this.stack = s;
		this.top = top;
	}

	@Override
	public void push(int element) {
		// TODO Auto-generated method stub
		if (isOverflow())
		{
			System.out.println("Stack is full");
		}
		else
		{
			top=top+1;
			stack[top]=element;
		}
		
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		int element;
		if(isUnderflow())
		{
			System.out.println("Stack is empty");
			return -1;
		}
		else
		{
			element=stack[top];
			top=top-1;
		}
		
		
		return element;
	}

	@Override
	public void displayStack() {
		// TODO Auto-generated method stub
		System.out.println("Stack elements are : ");
		
		if(isUnderflow())
		{
			System.out.println("No elements");
		}
		else
		{
			for(int i=0;i<=top;i++)
			{
				System.out.println(stack[i]+"\t");
			}
		}
		
		
	}

	@Override
	public boolean isOverflow() {
		// TODO Auto-generated method stub
		if (top==(stack.length))
			return true;
		else
			return false;
	
	}

	@Override
	public boolean isUnderflow() {
		// TODO Auto-generated method stub
		if (top==-1)
			return true;
		else 
			return false;
	}

	
	public int[] getStack() {
		return stack;
	}

	public void setStack(int stack[]) {
		this.stack = stack;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

}

package Part1a;

public class Fixed_stk_Demo {

    public static void main(String[] args) {
        // Create a Fixed_stk object
        Fixed_stk stack = new Fixed_stk(new int[5], -1);

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Display the stack
        stack.displayStack();

        // Pop elements from the stack
        int poppedElement1 = stack.pop();
        System.out.println("Popped elements " + poppedElement1 );
        stack.displayStack();
        
        int poppedElement2 = stack.pop();
        System.out.println("Popped element: " + poppedElement2);
        stack.displayStack();

        int poppedElement3 = stack.pop();
        System.out.println("Popped element: " + poppedElement3);
        stack.displayStack();
        

        
    }
}
