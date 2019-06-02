package com.kodilla.hibernate.invoice.dao;


import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
     ProductDao productDao;
    @Autowired
     ItemDao itemDao;
    @Autowired
     InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Product1");
        Product product2 = new Product("Product2");
        Product product3 = new Product("Product3");

        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);

        Invoice invoice1 = new Invoice("1/06/2019", new ArrayList<>());

        Item item1 = new Item(product1, new BigDecimal("10"), 2, new BigDecimal("20"));
        Item item2 = new Item(product2, new BigDecimal("5"), 3, new BigDecimal("15"));
        Item item3 = new Item(product3, new BigDecimal("20"), 1, new BigDecimal("20"));

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);

        invoice1.getItems().stream()
                .forEach(item -> item.setInvoice(invoice1));

        //When
        invoiceDao.save(invoice1);
        int id = invoice1.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        productDao.deleteAll();
        itemDao.deleteAll();
        invoiceDao.deleteById(id);
    }
}
