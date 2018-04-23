/**
 * Created by Rohith on 11/14/2017.
 */
public class forl {
    public static void main(String[] args) {
        int array[] = {1, 5, 7, -1, 5};
        int num = 6;
        int count = 0;
        for (int i = 1;i<array.length;i++){
            for(int j =i+1;j<array.length;j++){
                if(array[i]+array[j] == num){
                    count+=1;
                }
            }
        }
        System.out.println(count);
    }
}
