import java.io.*;
import java.util.Scanner;
class MostOccurance{

  public void check()
  {
      int num[] = new int[4];
  	  int store[];
  	  int digits[] = new int[10];
    
     Scanner sc = new Scanner(System.in);
   	 for(int i = 0;i < 4;i++)
    	num[i] = sc.nextInt();
     int l = 0;
     for(int i = 0;i < 4;i++)
          l = l + String.valueOf(num[i]).length();
     store = new int[l];
     int k = 0;
     for(int i = 0;i < 4;i++)
     {
       
      	  int temp = num[i];
       	  int rem; 
       	  while(temp > 0)
          { 
           	rem = temp%10;
            temp = temp/10;
            store[k] = rem;
            k++;	
          }   
       
     }
    
     for(int i = 0;i < 10;i++)
    	digits[i] = 0; 			
    
     for(int i = 0;i < store.length;i++) 
     {  	
     		switch(store[i])
            {
              case 0:
                	 digits[0]++;
                	 break;
              case 1:
                	 digits[1]++;
                	 break;
              case 2:
                	 digits[2]++;
                	 break;
              case 3:
                	 digits[3]++;
                	 break;
              case 4: 
                	 digits[4]++;
                	 break;
              case 5: 
                	 digits[5]++;
                   	 break;
              case 6:
                	 digits[6]++;
                	 break;
              case 7:
                	 digits[7]++;
                	 break;
              case 8:
                	 digits[8]++;
                 	 break;
              case 9:
                	 digits[9]++;
                	 break; 
            }
     }
     int max = digits[0];
     int pos = 0;
     for(int i = 0;i < 10;i++)
     {
      	if(digits[i] > max)
        {
          	max = digits[i];
          	pos = i;
        }
     }
     System.out.println(pos);	
  }
  
}
public class TestClass{
	 public static void main(String[] args){ 
		
       MostOccurance m = new MostOccurance();
       m.check();
	}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        