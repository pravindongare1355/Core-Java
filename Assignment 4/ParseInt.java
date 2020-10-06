
public class ParseInt{ 
      public static void main(String[] args) {
        String str = "67 89 23 67 12 55 66";
        int sum=0;

        String[] stringArray = str.trim().split("\\s+");//remove any leading, trailing white spaces and split the string from rest of the white spaces
    
        int[] intArray = new int[stringArray.length];//create a new int array to store the int values
    
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);//parse the integer value and store it in the int array
            System.out.println(intArray[i]);
            sum = sum+intArray[i];
        }
        System.out.println("Sum is:"+sum);

          
      }
}