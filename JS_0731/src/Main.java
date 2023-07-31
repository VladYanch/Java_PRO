import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("task-01.txt"))) {

            var categories = 0;
            var count = 0;
            String str = "";
            String catName = "";
            List<String> array = new ArrayList<>();

            for (int lines = 0; lines < 42; lines++) {
                str = reader.readLine(); //.replaceFirst(" ","");
                if (str.contains("<li class=\"item\">")) {
//                    array[count]=str;
                    array.add(str);

//                    String str1 = reader.readLine().replaceFirst(" ","");
//                    if (str1.startsWith("<h2>")) {
//                        catName = str.substring(4, str.lastIndexOf("<"));
//                        System.out.println("Category: "+catName);
//                        categories++;
//                    }

//                    System.out.println(count + " :" + str);
                    count++;
                }
            }
            array.forEach(elem-> {System.out.println(elem);
                System.out.println("***********************");
            });
            System.out.println("-".repeat(100));
            System.out.println(array.get(2));
//            System.out.println("Number of categories: "+ categories);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}