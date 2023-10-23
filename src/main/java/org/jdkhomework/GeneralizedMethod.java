package org.jdkhomework;

public class GeneralizedMethod {
    public static <T> boolean compareArrays (T [] array1,T [] array2){
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])){
                return false;
            }
        }
        return true;
    }
}
