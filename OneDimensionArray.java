public class OneDimensionArray {
    public static void main(String[] args){
        int[] numbers = new int[5];
        //number is already declared as integer
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        int[] values = {60, 70, 90, 90, 99};

        //for (int i = 0; i < numbers.length; i++){
           // System.out.println(numbers[i]);
       // }

        for(int value: values){
            if(value ==70){
                System.out.println("The value is 70");
            }
        }
    }
}
//filter CGPA for scholarship