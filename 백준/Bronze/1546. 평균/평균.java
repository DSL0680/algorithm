import java.util.*;
 
 
public class Main {
 
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        
        int subnum = sc.nextInt();
        float max;
        float tot=0;
        float[] score = new float[subnum];
        
        for(int i=0; i<subnum; i++) {
            score[i] = sc.nextInt();
        }
        max = score[0];
        for(int i=1; i<score.length; i++) {
            if(max<score[i]) max = score[i];
        }
        for(int i=0; i<score.length; i++) {
            score[i] = score[i]/max*100;
            tot += score[i];
        }
        tot = tot/subnum;
        System.out.println(tot);
        }
    }