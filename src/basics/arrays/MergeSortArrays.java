package basics.arrays;

public class MergeSortArrays {

    public static void main(String[] args){


        int arr1[]={-1,0,2,6,9,};
        int arr2[]={-2,3,5,7,8};

        int arr[]=new int[arr1.length+arr2.length];
        int k=0;


        for(int i=0; i<arr1.length;i++){

            boolean flag=false;
            for(int j=0;j<arr2.length;j++){

                if(arr2[j] < arr1[i]){
                    arr[k]=arr2[j];
                    System.out.println(arr[k]);
                    int temp[] = new int[arr2.length-1];
                    System.arraycopy(arr2,1,temp,0,temp.length);
                    arr2=temp;
                    System.out.println("hello"+arr2.length);
                    flag=true;
                    i--;
                  break;
                }
                //System.out.println(arr[k]);

            }
            if(flag == false){
                arr[k]=arr1[i];
                System.out.println(arr[k]);
            }
            k++;

        }

        for(int m=0; m<arr.length;m++){
            System.out.println(arr[m]);
        }

       /* for(){

        }*/

    }




}
