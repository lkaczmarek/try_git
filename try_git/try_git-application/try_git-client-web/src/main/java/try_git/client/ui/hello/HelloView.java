package try_git.client.ui.hello;

import com.google.gwt.user.client.ui.IsWidget;

public interface HelloView extends IsWidget {
	
	void setPresenter(Presenter listener);

	public interface Presenter {
		public void doSomething();
	}
	
}

