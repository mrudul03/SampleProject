package audit.sample.service;

import java.util.List;

public interface AccountService {
	List<String> getAccountIds(Customer customer);
}
