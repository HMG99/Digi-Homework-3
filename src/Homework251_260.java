public class Homework251_260 {
    public static void main(String[] args) {

        int[] array = {12, 6, -7, 25, -15, 36, 14, 99, 14, 41, 78};

        // xndir 251
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);

        //xndir 252
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);


        //xndir 253
        min = array[0];
        max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min + max);


        //xndir 254

        min = array[0];
        max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min * max);


        //xndir 255
        max = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        System.out.println(max + index);


        //xndir 256

        min = array[0];
        index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        System.out.println(min + index);


        //xndir 257

        int[] array2 = {2, -7, 5, 15, -78, 36, -78, 100, 25, 41, 100, 36, 9};
        max = array2[0];
        index = 0;
        for(int i = 0; i < array2.length; i++)
        {
            if(array2[i] > max)
            {
                max = array2[i];
                index = i;
            }
        }
        System.out.println(index);


        //xndir 258

        max = array2[0];
        index = 0;
        for(int i = 0; i < array2.length; i++)
        {
            if(array2[i] >= max)
            {
                max = array2[i];
                index = i;
            }
        }
        System.out.println(index);


        //xndir 259

        min = array2[0];
        index = 0;
        for(int i = 0; i < array2.length; i++)
        {
            if(array2[i] < min)
            {
                min = array2[i];
                index = i;
            }
        }
        System.out.println(index);


        //xndir 260

        min = array2[0];
        index = 0;
        for(int i = 0; i < array2.length; i++)
        {
            if(array2[i] <= min)
            {
                min = array2[i];
                index = i;
            }
        }
        System.out.println(index);

    }
}
