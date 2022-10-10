/* Below is the DrivableMap class, which is a map that contains a
 * HashMap mapping Strings to Drivable objects.
 * (Think of Python dictionaries as a comparison -- the concept is
 * similar!)
 *
 * Implement the requested methods as stated in the TODOs. We've
 * created the constructor for you already.
 */

import java.util.*;

class DrivableMap {
    HashMap<String, Drivable> drivable_map;

    /**
     * A generic constructor that initializes car_map
     * as an empty HashMap.
     */
    public DrivableMap() {
        drivable_map = new HashMap<>();
    }

    /* Adds the id and Drivable object to the hash map if it isn't already in the map.
     */
    public boolean addDrivable( String ID, Drivable item1) {
        if(!(drivable_map.containsKey(ID))) {
            drivable_map.put(ID, item1);
            return true;
        }
        return false;
    }




    /* Returns true if there is at least 1 item in drivable_map with a speed >= the given integer.
     * You may want to use drivable_map.keys() or drivable_map.values() to
     * iterate through drivable_map.
     */
    public boolean hasFasterThan(int speed) {
        // enhanced for loop
       for (Drivable value: drivable_map.values()) {
           if (value.getMaxSpeed() >= speed) {
               return true;
           }
       }
        return false;
    }






    /* Return a list of all the Tradable items in drivable_map.
     */
    public List<Tradable> getTradable() {
        List<Tradable> itradable = new ArrayList<>();
        for (Drivable values: drivable_map.values()) {
            if(values instanceof Tradable) {
                itradable.add((Tradable) values);
            }
        }
        return itradable;
    }



    
}