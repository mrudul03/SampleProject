package audit.sample.interceptor;

import java.util.ArrayList;
import java.util.List;

import audit.sample.annotation.Audit;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

public class AuditModule extends AbstractModule {
	
	private List<Object> injectees = new ArrayList<Object>();
	
	protected void configure() {
		
		AuditInterceptor interceptor = new AuditInterceptor();
		bindInterceptor(Matchers.any(), Matchers.annotatedWith(Audit.class),
				interceptor);
		
		injectees.add(interceptor);
	}
	
	public List<Object> getInjectees() {
        return injectees;
    }
}
