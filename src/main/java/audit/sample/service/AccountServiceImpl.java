package audit.sample.service;

import java.util.ArrayList;
import java.util.List;

import audit.sample.annotation.Audit;

public class AccountServiceImpl implements AccountService {

	@Audit
	public List<String> getAccountIds(Customer customer) {
		List<String> customerNames = new ArrayList<String>();
		return customerNames;
	}

}
