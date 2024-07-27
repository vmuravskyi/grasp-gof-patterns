package gof.design.patterns.grasp.creator;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public class Order {

    private final List<OrderItem> orders;

    public Order(List<OrderItem> orders) {
        this.orders = orders;
    }

    public BigDecimal getSum() {
        BigDecimal result = new BigDecimal(BigInteger.ZERO);
        for (OrderItem order : orders) {
            result = result.add(order.getSubSum());
        }
        return result;
    }

}
