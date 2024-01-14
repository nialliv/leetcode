package ru.artemev.leetcode.tasks;

import java.util.HashMap;
import java.util.Map;

public class ParseMolecule {
    public static Map<String, Integer> getAtoms(String formula) {
        Map<String, Integer> result = new HashMap<>();
        // Mg(OH)2
        // H20
        // K4[ON(SO3)2]2

        String parseSquare = formula.substring(formula.indexOf("[") + 1, formula.indexOf("]")); // квадратные
        String parseRound = formula.substring(formula.indexOf("(") + 1, formula.indexOf(")")); // круглые
        String parseCurl = "";  // никаких

        System.out.println(parseRound);
        System.out.println(parseSquare);

        return result;
    }
}
