public class CountofDigit {
    public static void main(String[] args) {
        long arr[] = { 9896696318L, 9894496318L, 9890393318L, 9866396318L, 9822396318L, 9890006318L };
        int oddcounter, evencounter, r;
        for (int i = 0; i < arr.length; i++) {
            long n = arr[i];
            oddcounter = 0;
            evencounter = 0;
            while (n > 0) {
                r = (int) n % 10;
                if (r % 2 == 0) {
                    evencounter++;
                } else {
                    oddcounter++;
                }
                n = n / 10;
            }
            System.out.print(
                    String.format("Mobile number %d odd digit and %d even digit", (i + 1), oddcounter, evencounter));
            if (oddcounter > evencounter) {
                System.out.println("ODD based Number..!!");
            } else if (oddcounter < evencounter) {
                System.out.println("Even based Number..!!");
            } else {
                System.out.println("Natural Number..!!!");
            }

        }
    }
}
