import java.util.*;
public class str23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = "HELLO";
        System.out.println(a.length());
        char ch = sc.next().charAt(0);
        for(int i=0; i<a.length();i++){
            if(a.charAt(i)== ch){
                System.out.println("Character" + ch + "found at index:" + i);
            }

            sc.close();
        }

        


    }

}
