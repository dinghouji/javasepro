package arraylist;

import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("黑马");
        list.add("枸杞");
        list.add("宁夏枸杞");
        list.add("java枸杞");


        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i);
            if(temp.contains("枸杞")){
                list.remove(temp);
                i--;
            }

        }
        System.out.println(list);
    }
}
