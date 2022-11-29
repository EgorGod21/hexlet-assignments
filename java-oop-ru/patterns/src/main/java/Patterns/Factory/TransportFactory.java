package Patterns.Factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;

public class TransportFactory {


    public Transport getTransport(Transp transp) {
        return getTransportMap().get(transp).get();
    }
    private Map <Transp, Supplier<Transport>> getTransportMap(){
        Map <Transp, Supplier<Transport>> map=new HashMap<>();
        map.put(Transp.SHIP,Ship::new);
        map.put(Transp.WAGON,Wagon::new);
        return map;
    }
}
