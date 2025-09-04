package DecoratorPattern;
import FactoryMethodPattern.*;
/**
 * Concrete Decrator : บริการห่อของขวัญ
 */
public class GiftWrapDecorator extends ShipmentDecorator {
    public GiftWrapDecorator(Shipment wrappedShipment){
        super(wrappedShipment);
    }
    
    @Override
    public  String getInfo(){
        return super.getInfo() + "+ Gift Wrapped";
    }

    @Override
    public double getCost() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCost'");
    }
}
