class PropagationDemo 
{
    static void calculate() 
    {
        String str = null;
        System.out.println(str.length()); 
    }

    public static void main(String args[]) 
    {
        try 
        {
            int num = Integer.parseInt("123");
            calculate();                       
        } 
        catch(NumberFormatException e) 
        {
            System.out.println("Number Format Exception: " + e);
        } 
        catch(NullPointerException e) 
        {
            System.out.println("Null Pointer Exception: " + e);
        }
    }
}