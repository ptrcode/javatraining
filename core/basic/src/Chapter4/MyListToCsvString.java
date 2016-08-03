package Chapter4;

/**
 * Created by zubair on 3/8/16.
 */

import java.util.ArrayList;
import java.util.List;

public class MyListToCsvString {

    public static void main(String a[]) {

        List<String> li1 = new ArrayList<String>() {
            {
                this.add("animal");
                this.add("nuts");
                this.add("java");
            }
        };
        MyListToCsvString mtc = new MyListToCsvString();
        System.out.println(mtc.getListAsCsvString(li1));
        List<String> li2 = new ArrayList<String>() {
            {
                this.add("java");
                this.add("unix");
                this.add("c++");
            }
        };
        System.out.println(mtc.getListAsCsvString(li2));
    }

    public String getListAsCsvString(List<String> list) {

        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            if (sb.length() != 0) {
                sb.append(",");
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
 /*   This example shows how to convert given list of strings to comma seperated values (csv) format.*/
