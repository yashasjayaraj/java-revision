public class Arraysrev{
    public static void main(String[] args){
        
        // Normal or One Dimensional Array - Creation 
        //int[] arrayName = new int[size]

        //example
        int[] emptyArr = new int[5];

        int[] arrWithValue = {10,20,30};

        int[] arrWithInitializationList = new int[]{10,20,30};

        // Multidimensional Arrays 

        //int[][] arrayName = new int[row][column];

        // Example 

        int[][] multiDimensionalArray = new int[3][4];

        // so i have 3 arrays inside mulltiDimensionalArray and each array is of size 4. 

        int[][] multiDimentionWithValues = {{1,2,3,4},{5,6,7,8}}; // so 2 Arrays inside multiDimentionWithValues Array and each array is of size 4.



        // how to access Arrays Data elements, of course we know that array is most efficient while accessing only i.e O(1) time complexity. 

        // For One-Dimentional Array
        System.out.println(arrWithValue[0]);

        // For Multi-Dimentional Array
        System.out.println(multiDimentionWithValues[0][1]);

        // Search - linear search and binary search for sorted arrays

        // One-Dimentionsal array 
        for(int i : arrWithValue){
            System.out.print(i+" ");
        }

        // Multi-Dimenstional Array
        for(int arr[]: multiDimentionWithValues){
            System.out.println();
            for( int data: arr){
                System.out.print(data+" ");
            }
        }

        // Update and Deletion 

        // if we want to update directly using index then it will take O(1) time complexity
        arrWithValue[1] = 50;

        // but if we want to update all element with element * 2 or sometime then it will take O(n)

        // Deletion at specific index - we can't just delete element because array size is fixed so deletion is done by shifting elements.

        int deleteIndex = 1;

        for (int i = deleteIndex; i < arrWithValue.length - 1; i++) {
            arrWithValue[i] = arrWithValue[i + 1];
        }

        printArray(arrWithValue);

        // Arrays of Object 

        Student s1 = new Student(1, "Yashas");
        Student s2 = new Student(2, "Varsha");

        Student[] studentArray = new Student[2];
        studentArray[0] = s1;
        studentArray[1] = s2;

    }

    public static void printArray(int[] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}