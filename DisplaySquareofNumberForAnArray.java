// From an arrya display the perfect number.
public class DisplaySquareofNumberForAnArray {
    public static void main(String[] args) {
        // int arr[]={25,9,13,6,2};
        // for(int i=0;i<arr.length;i++)
        // {
        // System.out.println(arr[i]*arr[i]);
        // }

        // int n = (int) (Math.sqrt(13));
        // System.out.println(n);

        int arr[]={25,9,13,16,21};

        for(int n:arr)
        {
            int sq=(int)Math.sqrt(n);
            if(sq*sq==n)
            {
                    System.out.println(n);  
            }
        }
    }
}
