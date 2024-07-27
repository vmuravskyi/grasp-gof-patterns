package gof.design.patterns.grasp.creator;

import java.math.BigDecimal;

public class Goods {

    private BigDecimal price;

    public Goods(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}
