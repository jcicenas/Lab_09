import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        //Part 1
        int[] dataPoints = new int[100];
        
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = (int)(Math.random() * (101 - 1) + 1);


        }
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i] + " | ");
        }


        int max = dataPoints[0];
        int min = dataPoints[0];
        int sum = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }

            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
            sum = sum + dataPoints[i];
        }
        System.out.println("");
        System.out.println("Max: " + max);
        System.out.println("Function Max: " + max(dataPoints));
        System.out.println("Min: " + min);
        System.out.println("Function Min: " + min(dataPoints));
        System.out.println("Sum: " + sum);
        System.out.println("Function Sum: " + sum(dataPoints));
        System.out.println("Average: " + (sum / dataPoints.length));

        //Part 2
        int temp = InputHelper.getRangedInt(scan, "Enter Ranged int 1 - 100", 1, 100);
        int counter = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            if (temp == dataPoints[i]) {
                counter++;
            }
        }
        System.out.println("Input Value Found: " + counter + " times");
        System.out.println("Function Result: " + occurenceScan(dataPoints, temp) + " times");


        int temp2 = InputHelper.getRangedInt(scan, "Enter Another Ranged int 1 - 100", 1, 100);
        boolean found = false;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == temp2) {
                System.out.println("Value " + temp2 + " found at position " + i + " in list.");
                found = true;
                break;
            }
        }
        if(found == false){
            System.out.println("Value " + temp2 +" not found");
        }
        System.out.println("Function Result");
        System.out.println("Found: " + contains(dataPoints, temp2));


        
    }
    //Part 3
    public static int min(int values[]){
        int temp = values[0];
        for (int i = 0; i < values.length; i++) {
            if(values[i] < temp){
                temp = values[i];
            }
        }
        return temp;
    }

    public static int max(int values[]){
        int temp = values[0];
        for (int i = 0; i < values.length; i++) {
            if(values[i] > temp){
                temp = values[i];
            }
        }
        return temp;
    }

    public static int occurenceScan(int values[], int target){
        int counter = 0;
        for (int i = 0; i < values.length; i++) {
            if (target == values[i]) {
                counter++;
            }
        }
        return counter;
    }

    public static int sum(int values[]){
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            
            sum = sum + values[i];
        }
        return sum;
    }

    public static boolean contains(int values[], int target){
        HashSet<Integer> setMap = new HashSet<>();
        for (int i = 0; i < values.length; i++) {
            setMap.add(values[i]);
        }
        if (setMap.contains(target)) {
            return true;
        }else{
            return false;
        }
    }
    
}
