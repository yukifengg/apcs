/*
TEAM YAK: Yuki Feng, Anjini Katari, Kevin Li
APCS pd 08
L08: America's Next Top Data Scientist
2022-04-05
Time spent: 1.0 hours
*/
import core.data.*;

public class Welcome01 {
   public static void main(String[] args) {
      String id = "KGYR";
      DataSource ds = DataSource.connect("http://weather.gov/xml/current_obs/" + id + ".xml");
      ds.setCacheTimeout(15 * 60);
      ds.load();
      //ds.printUsageString();
      float temp = ds.fetchFloat("temp_f");
      String loc = ds.fetchString("location");
      System.out.println("The temperature at " + loc + " is " + temp + "F");
   }
}
