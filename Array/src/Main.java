public class Main {

    public static void main(String[] args) {
       int[] myIntArray = new int[25];


       for(int i=0; i<myIntArray.length; i++) { //length shows you what the length is
           myIntArray[i] = 1*10;
       }
       printArray(myIntArray);

    }
    public static void printArray(int[] array) {
       for(int i=0; i<array.length; i++) {
           System.out.println("Element " + i + " , value is " + array[i]);
       }
    }
}
// look up an array with float variable