package class26;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    /*
   Create a Map that will store Employee name and salary.
   Write a logic to retrieve an employee who gets the highest salary. Output should be in the below format
   John Smith=$100000
    */
    public static void main(String[] args) {
        Map<String, Integer> employee = new HashMap<>();
        employee.put("Karen Vargas", 120_000);
        employee.put("May Ven", 50_000);
        employee.put("Mia Sam", 60_000);
        employee.put("Paul Lopez", 60_000);
        employee.put("Sonia Wen", 70_000);

        int maxValue = 0;
        for (Map.Entry<String, Integer> entry : employee.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
            }}
        for(Map.Entry<String,Integer> e:employee.entrySet()){
            if(e.getValue()==maxValue){
                System.out.println(e.getKey()+"=$"+e.getValue());
            }
        }
    }
}
