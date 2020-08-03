//package com.geektrust;
//
//import java.com.geektrust.util.HashMap;
//
//public class Verifier {
//
//    public static boolean checkInclusion(String message, String emblem) {
//        HashMap<Character, Integer> freq = new HashMap<>();
//        for (char ch : message.toCharArray()) {
//            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
//        }
//        for (char ch : emblem.toCharArray()) {
//            if (!freq.containsKey(ch)) {
//                return false;
//            }
//            freq.put(ch, freq.get(ch) - 1);
//            if (freq.get(ch) == 0) {
//                freq.remove(ch);
//            }
//        }
//        return true;
//    }
//}

package com.geektrust;

import java.util.HashMap;
import java.util.Map;

/**
 * Class contains string matching and char count logic.
 */
public class Verifier {

    // Check whether small string is available in large string or not.
    public static boolean verify(String message, String emblem) {
        HashMap<Character, Integer> messageMap = new HashMap<>();
        for (char c : message.toCharArray()) {
            messageMap.put(c, messageMap.getOrDefault(c, 0) + 1);
        }
        for (char c : emblem.toCharArray()) {
            if (!messageMap.containsKey(c)) {
                return false;
            }
            messageMap.put(c, messageMap.get(c) - 1);
            if (messageMap.get(c) == 0) {
                messageMap.remove(c);
            }
        }
        return true;
    }
}

