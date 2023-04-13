package interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class TesteInterceptor implements Interceptor{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("TesteInterceptor - destroy()");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("TesteInterceptor - init()");
		
	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		System.out.println("TesteInterceptor -pre-processing");
		
		System.out.println("TesteInterceptor - invoke");
		String result = ai.invoke();
		System.out.println("TesteInterceptor- pos-processing");
		return result;
	}

}
