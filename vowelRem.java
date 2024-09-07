import java.util.Scanner;
/*
public class vowelRem {

    public static void singleVowel(String s){
        String result = "";
        int n = s.length();
        
        for(int i=0; i<n; i++){
            boolean vowel = isVowel(s.charAt(i));
            boolean keep = true;
            
            if(vowel){
                if(i>0 && i<n-1){
                    if(isVowel(s.charAt(i-1)) || isVowel(s.charAt(i+1))){
                        keep = true;
                    }
                    else{
                        keep = false;
                    }
                }
                    
                else if(i==0){
                    if(isVowel(s.charAt(1))){
                        keep = true;
                    }
                    else{
                        keep = false;
                    }
                }
                else if(i==n-1){
                    if(isVowel(s.charAt(n-2))){
                        keep = true;
                    }
                    else{
                        keep = false;
                    }
                }
            }
            if(keep){
                result = result+s.charAt(i);
            }
         }
        System.out.println(result);
    }

    public static boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
               c=='A' || c=='E' || c=='I' || c=='O' || c=='U' ;
    } 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        singleVowel(s);
    }
} */

public class vowelRem{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for(int i=0; i<s.length(); i++){
            if("aeiouAEIOU".indexOf(s.charAt(i)) != -1){
                if((i<s.length()-1 && s.charAt(i) == s.charAt(i+1)) || (i>1 && s.charAt(i)==s.charAt(i-1))){
                    System.out.print(s.charAt(i));
                }
            }
            else{
                System.out.print(s.charAt(i));
            }
        }
    }
}