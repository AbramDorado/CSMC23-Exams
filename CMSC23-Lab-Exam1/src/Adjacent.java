
public class Adjacent {
    static int[] iterator(int[] sums, int i){
        int initial =0;
        int initial1 =0;
        int initial2 =0;
        if (i==1){
            initial = 0;
            initial1 = 1;
            initial2 = 2;
        }
        else{
            initial = i-1;  //1,2,3
            initial1 = i;   //2,3,4
            initial2 = i+1; //3,4,5
        }
        if ((sums[initial1] - sums[initial] >= 2) && (sums[initial1] - sums[initial2 ] >= 2)) {
            sums[initial] = sums[initial] + 1;
            sums[initial1] = sums[initial1] - 2;
            sums[initial2 ] = sums[initial2 ] + 1;
        }
        if ((sums[initial] - sums[initial1] >= 2) && (sums[initial2] - sums[initial1] >= 2)) {
            sums[initial] = sums[initial] - 1;
            sums[initial1] = sums[initial1] + 2;
            sums[initial2] = sums[initial2 ] - 1;
        }
        return sums;
    }
    static void evenUp(int[] sums) {

        if (sums.length == 3) {
            if ((sums[1] - sums[0] >= 2) && (sums[1] - sums[2] >= 2)) {
                sums[0] = sums[0] + 1;
                sums[1] = sums[1] - 2;
                sums[2] = sums[2] + 1;
            }
            if ((sums[0] - sums[1] >= 2) && (sums[2] - sums[1] >= 2)) {
                sums[0] = sums[0] - 1;
                sums[1] = sums[1] + 2;
                sums[2] = sums[2] - 1;
            }
            System.out.print("[");
            for(int j = 0; j < sums.length; j++){
                if(j<sums.length-1) System.out.print(sums[j] + ", ");
                else System.out.print(sums[j]);
            }
            System.out.print("]");
            System.out.println();
        }
        int groups = 0;
        if(sums.length % 2 == 0)
            groups = sums.length/2;
        else
            groups = (sums.length/2) + 1;

        if (sums.length > 3) {
            for (int i = 1; i < groups+1; i++) {
                sums = iterator(sums, i);
                System.out.print("[");
                for(int j = 0; j < sums.length; j++){
                    if(j<sums.length-1) System.out.print(sums[j] + ", ");
                    else System.out.print(sums[j]);
                }
                System.out.print("]");
                System.out.println();

            }
        }
    }

    public static void main(String[] args) {
        int[] testCase1 = new int[]{1, 8, 2};
        int[] testCase2 = new int[]{1, 8, 2, 6};
        System.out.println("Test Case 01: ");
        System.out.print("[");
        for(int j = 0; j < testCase1.length; j++){
            if(j<testCase1.length-1) System.out.print(testCase1[j] + ", ");
            else System.out.print(testCase1[j]);
        }
        System.out.print("]");
        System.out.println();
        evenUp(testCase1);

        System.out.println("\nTest Case 02: ");
        System.out.print("[");
        for(int j = 0; j < testCase2.length; j++){
            if(j<testCase2.length-1) System.out.print(testCase2[j] + ", ");
            else System.out.print(testCase2[j]);
        }
        System.out.print("]");
        System.out.println();
        evenUp(testCase2);
    }

}
