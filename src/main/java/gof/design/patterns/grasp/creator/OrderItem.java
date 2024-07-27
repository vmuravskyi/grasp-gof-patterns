package gof.design.patterns.grasp.creator;

import java.math.BigDecimal;

public class OrderItem {

    private Goods goods;
    private int amount;

    public OrderItem(Goods goods, int amount) {
        this.goods = goods;
        this.amount = amount;
    }

    public BigDecimal getSubSum() {
        return goods.getPrice().multiply(BigDecimal.valueOf(amount));
    }

}
