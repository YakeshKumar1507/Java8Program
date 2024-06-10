package JavaPrograms;

public class ArrayExample {

    public static void main(String[] args) {

         int arr[] = {8, 5, 6, 7, 9, 13, 15, -2, -6, -10, 6, 7};

       // int arr[] = {8, 5, 6, 4, 5, 6};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }

        System.out.println("-------------------");

        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                System.out.println(arr[i]);
            }
        }

    }
}
