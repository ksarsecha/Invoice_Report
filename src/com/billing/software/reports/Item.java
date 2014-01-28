
package com.billing.software.reports;

import java.math.BigDecimal;

public class Item {
	private String description = "default description";
	private Integer quantity = 10;
	private BigDecimal unitprice = new BigDecimal(100);

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(BigDecimal unitprice) {
		this.unitprice = unitprice;
	}
}
