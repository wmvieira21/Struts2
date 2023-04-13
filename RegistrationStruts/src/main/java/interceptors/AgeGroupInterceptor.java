package interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;

public class AgeGroupInterceptor implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("AgeGroupInterceptor - destroy()");

	}

	@Override
	public void init() {
		System.out.println("AgeGroupInterceptor - init()");

	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		System.out.println("AgeGroupInterceptor - pre");

		ValueStack stack = arg0.getStack();
		Integer age = (Integer) stack.findValue("age");

		String ageGroup = "Adult";
		if (age < 18) {
			ageGroup = "Kid";
		}

		stack.set("age", age + "(" + ageGroup + ")");
		
		System.out.println("AgeGroupInterceptor - invoke");
		String result = arg0.invoke();
		System.out.println("AgeGroupInterceptor - pos");
		return result;
	}

}
