package qwe;

public class trycatching {
	public static void main(String[] args) {
        try 
        {
            int result = 10 / 0; 
            System.out.println("Result" + result); 
        } 
        catch (ArithmeticException e)
        {
            System.out.println("error");
        }
    }

}
