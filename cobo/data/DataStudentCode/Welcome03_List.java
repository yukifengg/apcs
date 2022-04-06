/*
TEAM YAK: Yuki Feng, Anjini Katari, Kevin Li
APCS pd 08
L08: America's Next Top Data Scientist
2022-04-06
Time spent: 1.0 hours
*/

/*
 * Arrays of objects
 */

import core.data.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Welcome03_List {
   public static void main(String[] args) {
      DataSource ds = DataSource.connect("http://weather.gov/xml/current_obs/index.xml").load();
      ArrayList<WeatherStation> allstns = ds.fetchList("WeatherStation", "station/station_name",
             "station/station_id", "station/state",
             "station/latitude", "station/longitude");
      System.out.println("Total stations: " + allstns.size());

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a state abbreviation: ");
      String state = sc.next();
      System.out.println("Stations in " + state);
      for (WeatherStation ws : allstns) {
         if (ws.isLocatedInState(state)) {
            System.out.println("  " + ws.getId() + ": " + ws.getName());
         }
      }
      //YAK IMP------------------
      WeatherStation southernmost = allstns.get(0);

      for (int i = 1; i < allstns.size(); i++) {
        WeatherStation ws = allstns.get(i);
        if (ws.getLat() > southernmost.getLat()) {
          southernmost = ws;
        }
      }

      System.out.println("The Southernmost station is " + southernmost.getName() + " and its latitude is " + southernmost.getLat());
      //------------------YAK IMP

   }
}
