package snippet;

public class Snippet {
	 <mvc:interceptors>
			<mvc:interceptor>
				<mvc:mapping path="/**" />
				<bean class="net.togogo.talent.web.interceptor.LoginInterceptor"></bean>
			</mvc:interceptor>
		 </mvc:interceptors>
}

