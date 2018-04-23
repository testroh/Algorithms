import java.util.ArrayList;
import java.util.List;
/**
 * Created by Rohith on 12/7/2017.
 */
// Method to return duplicate elements in a list

public class list{

    public static List<ArrayList> duplicates(ArrayList eliminateDuplicates){
        ArrayList data = new ArrayList();
        for(int i = 0; i<eliminateDuplicates.size();i++){
            if (!(data.contains(eliminateDuplicates.get(i)))){
                data.add(eliminateDuplicates.get(i));
            }
        }
        return data;
    }
    public static void main(String[]args){
        ArrayList eliminateDuplicates = new ArrayList<>();
        eliminateDuplicates.add("rohith");
        eliminateDuplicates.add("mahesh");
        eliminateDuplicates.add("rohith");
        eliminateDuplicates.add("sitara");
        System.out.println(list.duplicates(eliminateDuplicates));
    }
}

