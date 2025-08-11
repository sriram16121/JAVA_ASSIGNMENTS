import java.util.Arrays;
class swap2arr{
    public static void main(String[]args){
        int []arr1={1,2,34,5,5,6};
        int []arr2={3,4,56,7,7,8};
        System.out.println("before swapping");
        System.out.println("arr1"+ Arrays.toString(arr1) + "   "+"arr2"+Arrays.toString(arr2));
        int []temp=arr1;
        arr1=arr2;
        arr2=temp;
        System.out.println("After swapping");
        System.out.println("arr1"+ Arrays.toString(arr1) + "   "+"arr2"+Arrays.toString(arr2));
        
    }
}