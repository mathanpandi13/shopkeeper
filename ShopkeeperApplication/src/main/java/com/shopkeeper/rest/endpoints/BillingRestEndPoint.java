package com.shopkeeper.rest.endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopkeeper.rest.beans.AddBillRequest;

/**
 * Rest APIs related to Billing.
 * @author ef6mrs
 *
 */
@RequestMapping("/billing")
@RestController
public class BillingRestEndPoint {

	@GetMapping(value = "/bill{billId}")
	public String getBill() {
		return "bill";
	}

	@PostMapping(value="/bill")
	public void addBill(AddBillRequest addBillRequest) {
	}
}
