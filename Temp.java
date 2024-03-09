import java.util.*;
public class Temp {
    
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=1; i<=4; i++) {
            list1.add(i);
        }
        mainList.add(list1);

        for(int i=1; i<=3; i++) {
            list2.add(i*2);
        }
        mainList.add(list2);

        for(int i=0; i<mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0; j<currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
    }
}