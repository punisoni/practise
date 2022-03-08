package Assignment3;
//collection topic.
//List ArrayList.
import java.util.ArrayList;

public class Program1 
{
public ArrayList<Integer> list=new ArrayList<Integer>();
        public ArrayList<Integer> saveEvenNumbers(int N)
        {
        
        list=new ArrayList<Integer>();
         
        for(int i=2;i<=N;i++)
        {
       if(i%2==0)list.add(i);
      }
    	   
      return list;
     }
        public ArrayList<Integer>printEvenNumbers()
        {
        	ArrayList<Integer>newList=new ArrayList<Integer>();
        	for (int item:list)
        	{
        		newList.add(item*2);
        		System.out.println(item*2);
        	}
        	return newList;
        	
	}
      public static void main(String[]args)
      {
    Program1 pro=new Program1();
    pro.saveEvenNumbers(10);
    pro.printEvenNumbers();
    
      }
}
