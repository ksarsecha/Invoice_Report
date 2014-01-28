
package com.billing.software.reports;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Invoice {
	private Integer id = 1;
	private BigDecimal shipping = new BigDecimal(10);
	private Double tax = 12.5;
	private Customer billTo = new Customer();
	private Customer shipTo = new Customer();
	private List<Item> items = new ArrayList();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getShipping() {
		return shipping;
	}

	public void setShipping(BigDecimal shipping) {
		this.shipping = shipping;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Customer getBillTo() {
		return billTo;
	}

	public void setBillTo(Customer billTo) {
		this.billTo = billTo;
	}

	public Customer getShipTo() {
		return shipTo;
	}

	public void setShipTo(Customer shipTo) {
		this.shipTo = shipTo;
	}

	public List<Item> getItems() {
            items.add(new Item());
            items.add(new Item());
            return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
}
