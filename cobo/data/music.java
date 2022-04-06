import java.util.ArrayList;

import core.data.*;

public class music {
    public static void main(String[] args) {
        DataSource ds = DataSource.connect("https://data.nasa.gov/api/views/gh4g-9sfh/rows.xml?accessType=DOWNLOAD");
        ds.setCacheTimeout(15 * 60);
        ds.load();
        ds.printUsageString();

        String[] fields = ds.fieldNames();
        for (String field : fields) {
            System.out.println(field);
        }

        System.out.println(ds.getCacheDirectory());

        //String[] row = ds.fetchStringArray("row");

        /*
        ArrayList<Integer> mass = ds.fetchIntList("mass");
        System.out.println("The mass of the meteorite is " + mass);
        */
    }
}
