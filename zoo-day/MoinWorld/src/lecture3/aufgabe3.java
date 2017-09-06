package lecture3;

public class aufgabe3 {
    public static void main(String[] args) {

        int a = 1;
        int b = 5;

        System.out.println(a);

 if(a > b){
        System.out.println("a > b");
    }else if(a < b){
       System.out.println("a < b");
    }else {
        System.out.println("a == b");
    }

    if(a != b){
        System.out.println("a != b");
    }

    if(a == b){
       System.out.println("a == b");
   }

        String string1 = "text1";
        String string2 = "text2";

        System.out.println("string1 has length = " + string1.length());
        System.out.println("string2 has length = " + string2.length());

        if(string1.length() > string2.length()){
            System.out.println("string1 is longer then string2");
        }else {
            System.out.println("string1 is shorter then string2");
        }

        if(string1.equals(string2)){
            System.out.println("string1 equals to string2");
        }else {
            System.out.println("string1 and string2 are different");
        }



    }
}
