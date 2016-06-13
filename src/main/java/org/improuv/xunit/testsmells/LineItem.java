package org.improuv.xunit.testsmells;

import java.math.BigDecimal;

/**
 * just enough to make it compile
 */
public class LineItem {
    private Invoice inv;
    private Product prod;
    private int quantity;
    private BigDecimal percentDiscount;
    private BigDecimal unitPrice;
    private BigDecimal extendedPrice;

    public Invoice getInv() {
        return inv;
    }

    public Product getProd() {
        return prod;
    }

    public int getQuantity() {
        return quantity;
    }

    public BigDecimal getPercentDiscount() {
        return percentDiscount;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public BigDecimal getExtendedPrice() {
        return extendedPrice;
    }
}
