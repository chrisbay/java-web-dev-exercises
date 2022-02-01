package org.launchcode.java.demos.lessons.ch3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Chris Bay
 */
public class CollectionExamples {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Chris");
        names.add("Jackson");
        names.add("Annie");

        for (String name : names) {
            System.out.println(name);
        }

        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Chris", 39);
        ages.put("Jackson", 12);

//        System.out.println(ages.values());

        for (Integer age : ages.values()) {
            System.out.println(age);
        }

        for (String name : ages.keySet()) {
            System.out.println(name + ":" + ages.get(name));
        }

    }

}
