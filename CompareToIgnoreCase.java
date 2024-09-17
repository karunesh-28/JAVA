
public class ComparetoIgnoreCase {
    public static void main(String args[]){
        String string1 = "Book";
        String string2 = "book";
        String string3 = "look";
        String string4 = "abc";
        String string5 = "BEEN";
        String string6 = " Learn Share Learn ";
        String word1=string1.toLowerCase();
        String word2=string2.toUpperCase();
        String word3=string6.trim();
        String word4="fadaf";
        String word5=word4.replace("f", "r");
        String 

        char []ch=string1.toCharArray();

        System.out.println(string1.compareToIgnoreCase(string2));
        System.out.println(string1.compareToIgnoreCase(string3));
        System.out.println(string1.compareToIgnoreCase(string4));
        System.out.println(string1.compareToIgnoreCase(string5));
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(string6);
        System.out.println(word3);
        System.out.println(word4);
        System.out.println(word5);
        System.out.println(word5.contains("ra"));
        for(int i=0;i<ch.length;i++)
            System.out.print(ch[i]);
    }
}