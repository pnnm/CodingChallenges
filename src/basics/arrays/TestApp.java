package basics.arrays;

public class TestApp {
    public static void main(String[] args){
        int array[] = {7,2,9,4,3};
        int temp;
        //min sum of 4 numbers
        // max sum of 4 numbers

        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array [j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        int minSum=0;
        int maxSum=0;
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
            if(i<array.length-1){
                minSum = minSum+array[i];
            }

            if(i != 0){
                maxSum = maxSum + array[i];
            }

        }

    }

}
