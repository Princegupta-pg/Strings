import java.util.*;
public class ReverseString {
    public static void main(String[] args){
        String str = "Prince Aditya Raj Rohit";
        String[] words = str.trim().split(" ");
        int left =0; int right = words.length-1;
        while(left<right){
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
        System.out.println(String.join(" ", words));
    }
}
