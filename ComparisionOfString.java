import java.util.*;
public class ComparisionOfString {         // str1.equals(str2)
    public static void main(String[] args){
        String str = "prince";
        String str2 = "prince";
        String str3 = new String("prince");
        if(str == str2){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
        if(str == str3){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        if(str.equals(str3)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
    }
}
