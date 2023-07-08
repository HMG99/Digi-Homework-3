public class Homework211_230 {
    public static void main(String[] args) {

        // xndir 211   0   1  2   3   4   5   6  7   8   9  10
        int[] array = {12, -1, 1, 8, -7, 36, -11, 5, -2, 15, 45};

        int sum = 0;
        int count = 0;
        for (int element : array) {
            if (element > 0) {
                sum += element;
                count++;
            }
        }
        System.out.println(sum / count);

        //xndir 212

        int product = 1;
        count = 0;
        for (int element : array) {
            if (element > 0) {
                product *= element;
                count++;
            }
        }
        System.out.println(product / count);


        //xndir 213

        product = 1;
        count = 0;
        for (int element : array) {
            if (element < 0) {
                product *= element;
                count++;
            }
        }
        System.out.println(product / count);

        //xndir 214
        sum = 0;
        count = 0;
        for (int element : array) {
            if (element < 0) {
                sum += element;
                count++;
            }
        }
        System.out.println(sum / count);

        //xndir 215
        sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);

        //xndir 216

        product = 1;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                product *= array[i];
            }
        }
        System.out.println(product);


        //xndir 217

        product = 1;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                product *= array[i] * array[i];
            }
        }
        System.out.println(product);


        //xndir 218
        sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                if (array[i] < 0) {
                    sum += -array[i];
                } else {
                    sum += array[i];
                }
            }
        }
        System.out.println(sum);

        //xndir 219

        int k = 36;
        count = 0;
        for (int i = 1; i < array.length; i++) {
            if (k % i == 0) {
                count++;
            }
        }
        System.out.println(count);

        //xndir 220
        count = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != 0) {
                count++;
            }
        }
        System.out.println(count);


        //xndir 221
        int a = -15;
        int b = 40;

        sum = 0;
        for (int element : array) {
            if (element >= a && element <= b) {
                sum += element;
            }
        }
        System.out.println(sum);

        //xndir 222
        product = 1;
        int c = -10;
        int d = 30;
        for (int element : array) {
            if (element >= c && element < d) {
                product *= element;
            }
        }
        System.out.println(product);

        //xndir 223
        count = 0;
        for (int element : array) {
            if (element > a && element < b) {
                count++;
            }
        }
        System.out.println(count);


        //xndir 227
        k = 3;
        count = 0;
        sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % k == 0) {
                count++;
                sum += array[i];
            }
        }
        System.out.println(sum / count);

        //xndir 228
        sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % k == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);


        // xndir 229
        product = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] - i > 0) {
                product *= array[i];
            }
        }
        System.out.println(product);


        //xndir 230
        product = 1;
        count = 0;

        for (int element : array) {
            if (element % k == 0) {
                product *= element;
                count++;
            }
        }
        System.out.println(product / count);

    }
}
