public class array1 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        array1[3] = 4;
        array1[4] = 5;

        int[] array2 = {1, 2, 3};

        String[] stringArray1 = new String[3];
        stringArray1[0] = "ab";
        stringArray1[1] = "abc";
        stringArray1[2] = "abcd";

        String[] stringArray2 = {"ab", "abc", "abcd"};

        System.out.println(array1);
        System.out.println("array1 length = " + array1.length);
        System.out.println("array1[0] = " + array1[0]);
        System.out.println("array1[1] = " + array1[1]);
        System.out.println("array1[2] = " + array1[2]);
        System.out.println("array1[3] = " + array1[3]);
        System.out.println("array1[4] = " + array1[4]);

//        System.out.println("Original Array : " + Arrays.toString(array1));
//        System.out.println("Original Array : " + Arrays.toString(stringArray2));

//      Kommentar

//        for (int i = 0; i < array1.length; i++) {
//            System.out.println("array1[" + i + "] = " + array1[i]);
//        }

//        for (int i = array1.length - 1; i > -1; i--) {
//            System.out.println("array1[" + i + "] = " + array1[i]);
//        }

//        for (int i = 0; i < stringArray2.length; i++) {
//
//            System.out.println("stringArray2[" + i + "] " + stringArray2[i]);
//        }

//      Aufgaben

        int[] intArray5 = {1, 2, 3, 4, 5};
        int[] intArray6 = {1, 2, 3};
        String[] stringArray3 = {"ab", "abc", "abcd"};

//        System.out.println(intArray5);
//        System.out.println("intArray5 length = " + intArray5.length);
//        System.out.println("intArray5 [0] = " + intArray5[0]);
//        System.out.println("intArray5 [1] = " + intArray5[1]);
//        System.out.println("intArray5 [2] = " + intArray5[2]);
//        System.out.println("intArray5 [3] = " + intArray5[3]);
//        System.out.println("intArray5 [4] = " + intArray5[4]);

//        System.out.println("Total Array : "+ Arrays.toString(intArray5));

        for (int i = 0; i < intArray5.length; i++) {
            System.out.println("intArray5 [" + i + "] = " + intArray5[i]);
        }

        for (int i = intArray5.length - 1; i > -1; i--) {
            System.out.println("intArray5 [" + i + "] = " + intArray5[i]);
        }

        int k = 0;
        while (k < intArray5.length) {
            System.out.println("intArray5 [" + k + "] = " + intArray5[k]);
            k++;
        }

        int l = intArray5.length - 1;
        while (l > -1) {
            System.out.println("intArray5 [" + l + "] = " + intArray5[l]);
            l--;
        }

        int sum = 0;
        for (int i = 0; i < intArray5.length; i++) {
            sum = sum + intArray5[i];
        }
        System.out.println(sum);

        int i = 0;
        while (i < 10){
            System.out.println(i); break;
       }

//        int j = 0;
  //      while (j < intArray5.length) {
    //        intArray5[j] += 1;
      //      j++;
     //   }
      //  System.out.println("New Array : " + Arrays.toString(intArray5));

        for (int m = 0; m < intArray5.length; m++) {
            intArray5[m] += 1;
        }
//        System.out.println("New Array 2 : " + Arrays.toString(intArray5));

        int[] intArray7 = {1, 2, 3};
        int[] intArray8 = new int[3];

        for (int n = 0; n < intArray7.length; n++) {
            intArray8[n] = intArray7[intArray7.length - 1 - n];
        }
//        System.out.println("New Array 8 : " + Arrays.toString(intArray8));

        double avg = 0;
        for (int i2 = 0; i2 < intArray8.length; i2++) {
            avg = (avg + (((double) intArray8[i2]) / intArray8.length));
        }
        System.out.println("Average = " + avg);

// Aufgaben 3.6-3.10

        int[] array10 = {1, 2, 3, 4, 5, 10, 7, 8, 9};

        int h = 0;
        for (int ia = 0; ia < array10.length; ia++){
            if (array10[h] >= array10[ia]) {
                h = h;
            } else {
                h = ia;
            }
        }
            System.out.println("der Maximale Wert ist: " + array10[h]);
        System.out.println("Die Poition des maximalen Wertes ist: " + h);

//      3.7
        int[] array11 = {1, 2, 3, 4, 5, 10, 7, 8, 9};

        int j = 10;
        int m = array11.length + 1;
        for (int n = 0; n < array11.length; n++) {
            if (j == array11[n]) {
                m = n;
            } else {
                m = m;
            }
        }

        if (m == array11.length + 1) {
            System.out.println("Die Zahl " + j + " ist nicht im array enthalten.");
            } else {
            System.out.println("Der Index der Zahl " + j + " ist: " + m);
        }

//      3.8

        int[] array12 = {1, 2, 3, 4, 5, 10, 7, 8, 9};
        int[] array13 = {1, 2, 3, 4, 5, 10, 7, 8, 9};

        int o = 0;
        for (int p = 0; p < array12.length; p++) {
        if (array12.length != array13.length) {
            p = array12.length;
        } else if (array12[p] == array13[p]) {
            o = o + 1;
        } else {
            o = o;
        }
        }

        if (o == array12.length) {
            System.out.println("Die Arrays sind gleich.");
        } else {
            System.out.println("Die Arrays sind nicht gleich.");
        }


 //   3.9

        int[] array14 = {1, 2, 3, 4, 5, 10, 0, 8, 9};


        int o2 = 1;
        for (int p2 = 0; p2 < array14.length; p2++) {
            if ((o2 * array14[p2] != 0) && (o2 * array14[p2] != - o2)) {
                o2 = o2 + 1 ;
            } else {
                o2 = o2;
            }
        }

        if (o2 == array14.length + 1) {
            System.out.println("Die Aufgabe ist erfüllt.");
        } else {
            System.out.println("Die Aufgabe ist nicht erfüllt.");
        }




    }
}