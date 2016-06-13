package org.improuv.xunit.testsmells;

import org.junit.Before;

import java.math.BigDecimal;

public class AddressSetup {

    Address billingAddress, shippingAddress;
    Customer customer;
    Product product, product2;
    Invoice invoice, invoiceEmpty;

    @Before
    public void setUp() throws Exception {
        //   Fixture Setup
        billingAddress = new Address("1222 1st St SW","Calgary", "Alberta","T2N 2V2", "Canada");
        shippingAddress = new Address("1333 1st St SW","Calgary", "Alberta","T2N 2V2", "Canada");
        customer = new Customer( 99, "John", "Doe",new BigDecimal("30"),billingAddress,shippingAddress);
        product = new Product( 88, "Fahrrad",new BigDecimal("199.99"));
        product2 = new Product( 77, "Kühlschrank",new BigDecimal("700.00"));
        invoice = new Invoice( customer );
        invoice.addItemQuantity( product, 5 );
        invoice.addItemQuantity( product2, 1 );
        invoiceEmpty = new Invoice( customer );
    }
}
