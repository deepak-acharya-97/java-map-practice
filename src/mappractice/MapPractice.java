/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mappractice;

import java.util.*;

/**
 *
 * @author Deepak
 */
public class MapPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>(); //the order in which data items are inserted
        map.put("Deepak Acharya", 99);
        map.put("Pranay Shetty", 90);
        map.put("Rakesh Hegde", 90);
        map.put("Ramnath Shanbhag", 93);
        map.put("Manoj Shetty",94);
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey().toString()+' '+m.getValue());
        }
        /*
        OUTPUT :
        Deepak Acharya 99
        Pranay Shetty 90
        Rakesh Hegde 90
        Ramnath Shanbhag 93
        Manoj Shetty 94
        */
        System.out.println(map.containsValue(99));
        // TODO code application logic here
        Map<String, Double> cricketStars = new LinkedHashMap<>(); // no specific order for the map
        cricketStars.put("Virat Kohli", 77.98);
        cricketStars.put("Manish Pandey", 80.56);
        cricketStars.put("KL Rahul", 76.99);
        cricketStars.put("Rohit Sharma", 70.34);
        cricketStars.put("Mayank Agarwal", 76.87);
        for (Map.Entry m : cricketStars.entrySet()){
            System.out.println(m.getKey().toString()+' '+m.getValue());
        }
        /*OUTPUT
        Virat Kohli 77.98
        Rohit Sharma 70.34
        Mayank Agarwal 76.87
        Manish Pandey 80.56
        KL Rahul 76.99
        */
        Map<String, Double> copiedMap = new TreeMap<>(); //Ascending Order Of Keys the map is stored
        copiedMap.putAll(cricketStars); // copying map
        System.out.println(copiedMap.remove("KL Rahul")); // removes the entry
        System.out.println(copiedMap.entrySet());
    }
    
}
