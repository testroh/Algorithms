/**
 * Created by Rohith on 4/5/2018.
 */
public class DataStructures {

// TwoSum Brute Force
    public int numbers(int[] num){
        int count = 0;
        for (int i =0; i< num.length;i++){
            for (int j=1;j<num.length -1;j++){
                if (num[i] + num[j] == 6){
                    count = count + 1;
                    System.out.println("pairs are" + num[i] + "&" + num[j]);
                }
            }
        }
        return count;
    }
    public String dataInQuotes(String[] numbers){
        // Loop through data, convert to integers, add numbers, convert back to string & return
        int count = 0;
        for (int i = 0; i < numbers.length; i++){
            int element = Integer.parseInt(numbers[i]);
            count = count + element;
        }
        return String.valueOf(count);
    }
    public static void main(String args[]){
        int num[] = {1,2,3,4,5,6,7,8,9,10,-4,-5,-3};
        String[] numbers = {"2","3","4","5","6"};
        DataStructures obj = new DataStructures();
        DataStructures strobj = new DataStructures();
        //StringBuilder testobj = new StringBuilder();
        int result = obj.numbers(num);
        String res = strobj.dataInQuotes(numbers);
        System.out.println(result);
        System.out.println(res);
    }
}
