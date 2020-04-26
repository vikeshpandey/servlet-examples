package io.github.vikeshpandey;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class HttpSessionListenerExample implements HttpSessionListener {

	private static int sessions;

	public static int getTotalNoOfActiveSession() {
		return sessions;
	}

	@Override
	public void sessionCreated(HttpSessionEvent arg) {
		sessions++;
		System.out.println("Inside sessionCreated one session is added to counter");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg) {
		sessions--;
		System.out.println("Inside sessionDestroyed one session is removed from counter");
	}
}
