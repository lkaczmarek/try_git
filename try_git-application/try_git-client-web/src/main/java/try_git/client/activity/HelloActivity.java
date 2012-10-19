package try_git.client.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import try_git.client.Blank;
import try_git.client.ClientFactory;
import try_git.client.ui.hello.HelloView;
import try_git.client.ui.hello.HelloViewImpl;

public class HelloActivity extends AbstractActivity implements HelloView.Presenter {

	private HelloView view = null;

	private ClientFactory clientFactory;

	@Inject
	public HelloActivity(ClientFactory clientFactory){
		this.clientFactory=clientFactory;
	}

	/* (non-Javadoc)
	 * @see com.google.gwt.activity.shared.Activity#start(com.google.gwt.user.client.ui.AcceptsOneWidget, com.google.gwt.event.shared.EventBus)
	 */
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		if (view==null){
			view = new HelloViewImpl();
			view.setPresenter(this);
		}
		panel.setWidget(view);
	}


	public void doSomething(){
		// Do something
		// like change place
		clientFactory.getPlaceController().goTo(Blank.appGinjector.getHelloPlace());
	}
}
