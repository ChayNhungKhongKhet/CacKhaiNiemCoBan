package com.cackhainiemcoban.Arrays;

public class FindElementOfArray {
    public static int[] increaseOneOfArray(){
        int[] A= new int[]{3, 15, 2, 7, 9, 1, 6, 12, 19, 10};
        //Insert Array
        for (int i=0;i< A.length;i++){
            A[i]=A[i]+1;
            System.out.println("A"+"["+i+"]"+"="+A[i]);
        }
        return A;
    }
    public static int maxNumber (int[] A){
        int max=A[0];
        for (int i=0;i<A.length;i++) {
            if (max < A[i]) {
                max = A[i];
            }
        }
//        System.out.println("Element biggest: "+max);
        return max;
    }
    public static int minNumber (int[] A){
        int min=A[0];
        for (int i=0;i< A.length;i++) {
            if (min > A[i]) {
                min = A[i];
            }
        }
//        System.out.println("Element smallest: "+min);
        return min;
    }
    public static boolean findNumber10 (int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 10) {
                return true;
//                Nếu như chạy hết vòng lặp không có giá trị bằng 10 thì return false = kết luận k có
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Array come to");
        int[] array2=increaseOneOfArray();
        int max,min;
        System.out.println("Element bigger is :"+(max=maxNumber(array2)));
        System.out.println("Element smallest is :"+(min=minNumber(array2)));
        if(findNumber10(array2)==true){
            System.out.println("Array has  element equal 10");
        }
        else {
            System.out.println("Array has not element equal 10");
        }
    }
}
