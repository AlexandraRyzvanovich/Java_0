import com.epam.arrays.converter.StringToDoublesConverter;
import com.epam.arrays.reader.Reader;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        Reader reader = new Reader();
        StringToDoublesConverter converter = new StringToDoublesConverter();
        ArrayList<String> list = reader.readFile("./resources/DataFileTest");
        double[] ssss = converter.covertStringToDoubles(list);
        for (double s:
             ssss) {
            System.out.println(s);

        }


    }
}
