package class26;

import java.util.LinkedHashSet;

public class Concatination {
    /*
   Create the collection that will store single uniques Objects of a String type in which order is preserved.
   Write a logic to concatenate all string from the collection.
    */
    public static void main(String[] args) {
        LinkedHashSet<String> str=new LinkedHashSet<>();
        str.add("The");
        str.add("name");
        str.add("of");
        str.add("my");
        str.add("program");
        str.add("is");
        str.add("Syntax");
        str.add("Technology");

        StringBuilder newStr=new StringBuilder();

        for (String s : str) {
            newStr.append(s+" ");
        }
        System.out.println(newStr);
    }
}
