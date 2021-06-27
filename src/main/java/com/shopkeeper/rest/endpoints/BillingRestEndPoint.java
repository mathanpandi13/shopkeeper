package com.shopkeeper.rest.endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopkeeper.rest.beans.AddBillRequest;
import com.shopkeeper.rest.endpoints.constants.BillingEndPointConstants;

/**
 * Rest APIs related to Billing.
 * @author ef6mrs mathan
 *
 */
@RequestMapping(BillingEndPointConstants.BILLING)
@RestController
public class BillingRestEndPoint {

	@GetMapping(value = BillingEndPointConstants.BILL + "/{billId}")
	public String getBill(@PathVariable String billId) {
		return "bill";
	}

	@PostMapping(value= BillingEndPointConstants.BILL)
	public void addBill(@RequestBody AddBillRequest addBillRequest) {
	}
}
