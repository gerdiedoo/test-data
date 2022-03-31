import java.util.Scanner;
public class linearSearch
{
    public static void main(String args[])
    {
        //Declaration 
        Scanner sc = new Scanner(System.in);
        int n, key, position = 0 , index = 0;
        int a[]; 
        boolean flag = false; 

        //Prompt and Accept the number of students  
        System.out.println("Please enter the number of students: ");
        n = sc.nextInt(); 

        //Create a new Array
        a = new int[n]; 

        //Reading the Array Elements from the user 
        System.out.println("Please enter the number(s): ");
        for(int i = 0  ; i < a.length ; i++)
        {
            a[i] = sc.nextInt();
        }
        
        //accepting the value to be searched from the user 
        System.out.println("Please enter the number to be searched ");
        key = sc.nextInt(); 
        
        //linear Search 
        for(int i = 0 ; i < a.length ; i++)
        {
            if( key == a[i])
            {
                flag = true; 
                index = i; 
                position = i+1;
                break;
            }
        } 
        
        //dislpaying the result after searching 
        if(flag == true)
        {
            System.out.println(key + " was found at position " + position + ", index: " + index );
        }
        else if ( flag == false)
        {
            System.out.println(key + " was not found");
        }
    }
}
