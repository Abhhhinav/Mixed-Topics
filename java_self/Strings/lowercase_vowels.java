package Strings;
import java.util.Scanner;
public class lowercase_vowels {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = in.next();
        int count = 0;
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a' ||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'){
                count++;
            }
        }
        System.out.println(count);
        in.close();
    }
}
