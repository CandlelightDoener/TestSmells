package org.improuv.xunit.testsmells;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * From XUnit-Test Patterns - slightly modified to get more smells on less space :-)
 */
public class BigTest extends AddressSetup {

    @Test
    public void testAddItemQuantity_severalQuantity_v1(){
        try {
            Product product3 = new Product( 123, "gebrauchtes Schlauchboot", new BigDecimal("50.32"));
            invoice.addItemQuantity( product3, 7 );
            // Verify Outcome
            List<LineItem> lineItems = invoice.getLineItems();
            if (lineItems.size() == 0) {
                assertTrue("Invoice should have 1 item", false);
            } else {
                for(LineItem actItem : lineItems) {
                    if(actItem.getProd().equals(product3)) {
                        assertEquals("inv", invoice, actItem.getInv());
                        assertEquals("prod", product3, actItem.getProd());
                        assertEquals("quant", 7, actItem.getQuantity());
                        assertEquals("discount", new BigDecimal("1.99"), actItem.getPercentDiscount());
                        assertEquals("unit price", new BigDecimal("50.32"), actItem.getUnitPrice());
                        assertEquals("extended", new BigDecimal("48.33"), actItem.getExtendedPrice());
                    }
                }
            }
        } catch (Exception e) {
            //huh? gthis shouod never happen
            e.printStackTrace();
        } finally {
            // Teardown
            deleteObject(invoice);
            deleteObject(product);
            deleteObject(product2);
            deleteObject(customer);
            deleteObject(billingAddress);
            deleteObject(shippingAddress);
        }
    }

    private void deleteObject(Object object) {
        //free resources ...
    }
}
