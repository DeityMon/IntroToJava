package Chapter7;

/**
 * Created by Wilbur Hsu on 2017/12/26.
 *VarArgsDemo
 */
public class Code7_5 {
    public static void main(String[] args) {
        printMax(34,3,3,2,56.5);
        printMax(new double[]{1,2,3});
    }

    public static void printMax(double... numbers){
        if(numbers.length == 0){
            System.out.println("No argument passed");
            return;
        }

        double result = numbers[0];

        for(int i=1;i<numbers.length;i++)
            if(numbers[i] > result)
                result = numbers[i];

        System.out.println("The max value is " + result);
    }
}