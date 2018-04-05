package com.github.chhonker.javautils.chhonkerjava.managers;

public class PracticeManager {

    public static void main(String[] args) {
        //reverse a string
        String a = "sumit";
        PracticeManager manager = new PracticeManager();
        ////
        String revRec = manager.reverseRecursively(a,new StringBuilder()).toString();
        System.out.println(revRec);
        System.out.println("Public Fx: "+manager.getReverseString(a));

        /////
        manager.reverseIteratively(a);
    }

    private StringBuilder reverseRecursively(String a, StringBuilder sb) {
        if (a.length() > 1) {
            sb.append(a.charAt(a.length() - 1));
            reverseRecursively(a.substring(0,a.length()-1),sb);
        } else if (a.length() == 1) {
            sb.append(a);
        }
        return sb;
    }
    public String getReverseString(String a) {
        return reverseRecursively(a,new StringBuilder()).toString();
    }
    private String reverseIteratively(String a) {
        return null;
    }
}
