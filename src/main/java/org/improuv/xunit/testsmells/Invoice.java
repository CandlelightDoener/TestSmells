package org.improuv.xunit.testsmells;

import java.util.List;

/**
 * just enough to make it compile
 */
public class Invoice {
    private List<LineItem> lineItems;

    public Invoice(Customer customer) {
    }

    public void addItemQuantity(Product product, int amount) {

    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }
}
