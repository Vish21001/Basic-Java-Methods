public class Multiply extends ConsoleProgram
{
    public void run()
    {
        multiple(2, 20);
        multiple(5, 19);
        multiple(100, 15);
        
    }
    
    private void multiple(int a, int b)
    {
        int multiple = a * b;
        System.out.println(multiple);
        // Your code here. 
        // Print out the product of a and b.
    }
}
