package interceptors;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import action.LoginAction;

public class LoginInterceptor implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("LoginInterceptor - destroy()");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("LoginInterceptor - init()");
	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("LoginInterceptor - intercept()");

		Object user = ServletActionContext.getRequest().getSession().getAttribute("userSession");

		if (!arg0.getAction().getClass().equals(LoginAction.class)
				&& user == null) {
			return "input";
		}
		
		return arg0.invoke();
	}
}
