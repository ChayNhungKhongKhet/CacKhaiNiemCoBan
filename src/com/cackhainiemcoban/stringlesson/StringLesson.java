package com.cackhainiemcoban.stringlesson;

public class StringLesson {
    public static void main(String[] args) {
        //1
        String s="ToiYeuDaNang";

        System.out.println("Order :" +s.indexOf('a')+" and "+s.lastIndexOf('a'));
        //2

        System.out.println("\nSeparation :" + s.substring(0,3)+" ," + s.substring(3,6)+" ," + s.substring(6,8)+" ," + s.substring(8,12));
        //3
        String st="Toi";
        st = st.concat("Yeu");
        st= st.concat("Da");
        st=st.concat("Nang");
        System.out.println("\n"+st);
        //Another
        String st2="Toi";
        System.out.println(st2+"Yeu"+"Da"+"Nang");
        //4
        System.out.println("\n"+ s.substring(6,12));
        //5
        String s2=s.replace("DaNang" , "HaNoi");
        System.out.println("\n"+s2);
        //6
        System.out.println("\n"+s.isEmpty());

    }
}
