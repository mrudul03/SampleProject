package audit.sample.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AuditInterceptor implements MethodInterceptor {

	public Object invoke(MethodInvocation invocation) throws Throwable {
		//invocation.getArguments()
		System.out.println("Audit the method invocation");
		for(Object obj: invocation.getArguments()){
			System.out.println("Argument:"+obj.getClass());
		}
		return invocation.proceed();
	}

}
