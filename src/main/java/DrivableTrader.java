/* TODO: Create a subclass of Trader named DrivableTrader
 * This class should be identical to Trader, except that it takes
 * only Drivable objects in its inventory, wishlist, etc.
 *
 * The sellingPrice returned should also be overridden. The selling price
 * should be equal to the:
 *     Object's price + Object's max speed
 * If the object is Tradable (and Tradable.MISSING_PRICE otherwise.)
 *
 * Look at DomesticatableTrader.java for an example.
 */

import java.util.ArrayList;
import java.util.List;
class DrivableTrader extends Trader<Drivable> {


    /**
     * Construct a DrivableTrader,
     *
     * @param inventory - object's in the tRaders inventory
     * @param wishlist  - object in the trader's wishlist
     * @param money     - the trader's money
     */
    public DrivableTrader(List<Drivable> inventory, List<Drivable> wishlist,
                          int money) {
        super(inventory, wishlist, money);
    }



    /**
     * Construct a DrivableTrader with an empty wishlist and inventory
     */

    public DrivableTrader(int money) {
        super(money);
    }

    /**
     * Overide the sellingPrice method to return Object's price + Object's max speed if Tradable
     */

    @Override
    public int getSellingPrice(Drivable items) {
        if (items instanceof Tradable) {
            return ((Tradable) items).getPrice() + items.getMaxSpeed();

        }
        else {
            return Tradable.MISSING_PRICE;
        }
    }
}







