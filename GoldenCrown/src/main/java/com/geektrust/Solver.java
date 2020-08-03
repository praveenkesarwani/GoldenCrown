package com.geektrust;

import com.geektrust.cipher.Encryptor;

import java.util.*;

/**
 * This file contains main logic to solve the problem.
 * This file will create objects of other class to get relevant data.
 */
public class Solver {
    static List<String> kingdomList;
    static List<String> messageList;
    Encryptor encryptor;

    /**
     * This code will make a List of all the kingdoms and messages sent.
     */
    public void init(List<String> inputLines) {
        kingdomList = new ArrayList<>();
        messageList = new ArrayList<>();

        for(String line : inputLines) {
            String[] lineArray = line.split(" ");
            kingdomList.add(lineArray[0]);
            messageList.add(getMessage(lineArray));
        }
    }

    /**
     * to handle the case when there are spaces in input messages
     */
    public String getMessage(String [] messages){
        StringBuilder message = new StringBuilder();
        for (int i = 1; i < messages.length; i++) {
            message.append(messages[i]);
        }
        return message.toString();
    }

    /**
     * Build Alliance and add them to the list
     */
    public List<String > buildAlliance() {
        List<String> allies = new ArrayList<>();
        for (int i = 0; i < kingdomList.size(); i++) {
            String kingdom = kingdomList.get(i);
            String message = messageList.get(i);
            String emblem = Kingdom.getEmblem(kingdom);
            int shift = emblem.length();
            String encryptedMessage = Encryptor.getEncryptedMessage(message, shift);
            boolean verified = Verifier.verify(encryptedMessage, emblem);
            // if verified and no duplications , add it to list
            if (verified && !allies.contains(kingdom)) { allies.add(kingdom); }
        }
        return allies;
    }

    /**
     *  Function to get names of alliances or NONE if not found.
     */
    public String solveAndGetAlliancesName() {
        List<String > allies = buildAlliance();
        StringBuilder result = new StringBuilder();
        if(allies.size() >= 3){
            allies.add(0,"SPACE");
        } else{
            allies = new ArrayList<>();
            allies.add("NONE");
        }
        for(int i = 0;i < allies.size();i++){
            if(i == allies.size() - 1){
                result.append(allies.get(i));
            } else{
                result.append(allies.get(i) + " ");
            }
        }

        return result.toString();
    }
}
