
package com.billing.software.reports;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class InvoiceData {
	private Invoice invoice = new Invoice();

	public InvoiceData() {
		// invoice = createInvoice();
	}
        
        public InvoiceData(Item item, Customer customer, Invoice invoice){
                invoice = createInvoice(item, customer, invoice);
        }

	private Invoice createInvoice(Item item, Customer customer, Invoice invoice) {
		// Invoice invoice = new Invoice();
            
            // this data is for setting up invoce details
		invoice.setId(invoice.getId());
		invoice.setShipping(new BigDecimal(10));
		invoice.setTax(0.2);
                
                // this data is to setting up billing and shipping details of customer
		invoice.setBillTo(createCustomer(customer.getName(), customer.getAddress(), customer.getCity(), customer.getEmail()));
		// invoice.setShipTo(createCustomer(customer.getName(), customer.getAddress(), customer.getCity(), customer.getEmail()));

                // This data is to add new item in order of customer.
		List<Item> items = new ArrayList<Item>();
		items.add(createItem("Notebook", 1, new BigDecimal(1000)));
		items.add(createItem("DVD", 5, new BigDecimal(40)));
		items.add(createItem("Book", 2, new BigDecimal(10)));
		items.add(createItem("Phone", 1, new BigDecimal(200)));
		invoice.setItems(items);

		return invoice;
	}

	private Customer createCustomer(String name, String address, String city, String email) {
		Customer customer = new Customer();
		customer.setName(name);
		customer.setAddress(address);
		customer.setCity(city);
		customer.setEmail(email);
		return customer;
	}

	private Item createItem(String description, Integer quantity, BigDecimal unitprice) {
		Item item = new Item();
		item.setDescription(description);
		item.setQuantity(quantity);
		item.setUnitprice(unitprice);
		return item;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public JRDataSource createDataSource() {
		return new JRBeanCollectionDataSource(invoice.getItems());
	}
}
