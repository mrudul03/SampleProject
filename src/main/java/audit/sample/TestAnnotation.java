package audit.sample;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import audit.sample.interceptor.AuditModule;
import audit.sample.service.AccountServiceImpl;
import audit.sample.service.Customer;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class TestAnnotation {
	
	@Inject
    private AccountServiceImpl service;
	
	@BeforeClass
    public static void setupUsers() {
		
    }
	
	@Before
    public void setup() {
		AuditModule module = new AuditModule();
		Injector injector = Guice.createInjector(module);
		for (Object oneInjectee : module.getInjectees()) {
            injector.injectMembers(oneInjectee);
        }

        injector.injectMembers(this);
	}
	
	@Test
    public void testAuditMethodCall() throws Exception {

        Customer customer = new Customer();
        System.out.println("invoking service");
        service.getAccountIds(customer);
    }

}
