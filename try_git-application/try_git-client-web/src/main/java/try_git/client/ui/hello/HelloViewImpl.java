package try_git.client.ui.hello;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class HelloViewImpl extends Composite implements HelloView {
		
	private final Label helloLabel = new Label("Hello!");

	private Presenter presenter;
	
	public HelloViewImpl() {
		// Create view content
		VerticalPanel container = new VerticalPanel();
		container.setSpacing(20);
		
	    container.add(helloLabel);
	    
	    // Initialize this view.
	    initWidget(container);
	}

	

	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
	}
	
	public void someEvent(){
		presenter.doSomething();
	}
}

