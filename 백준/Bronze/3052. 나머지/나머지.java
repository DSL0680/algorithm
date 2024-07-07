import java.util.*;
 
 
public class Main {
 
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        
        int[] num = new int[10];
        int[] size = new int[42];
        int count=0;
        
        for(int i=0; i<num.length; i++) {
            num[i] = sc.nextInt();
        }
        for(int i=0; i<num.length; i++) {
            num[i] = num[i]%42;
            for(int j=0; j<size.length; j++) {
                if(num[i]==j) size[j]++;
            }
            
        }
        
        for(int i=0; i<size.length; i++) {
            if(size[i]!=0)
                count++;
        }
        
        System.out.println(count);
        }
    }