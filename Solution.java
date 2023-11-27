import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //Scanner input = new Scanner(System.in);
    
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String lines = new String();
        ArrayList<String> allLines = new ArrayList<>();
        int n=0;
        //boolean loop=true;
        
        do {
        
            try {
                lines=br.readLine();
                allLines.add(lines);
            } catch (Exception e) {
                System.out.println("There is something wrong with the input....!!!!");
            }
        } while(lines != null);
            
        n=allLines.size();
        
        for (int i=0; i<n-1; i++) {
            System.out.println((i+1) + " "+allLines.get(i));
        }

        //br.close();
        }
    }