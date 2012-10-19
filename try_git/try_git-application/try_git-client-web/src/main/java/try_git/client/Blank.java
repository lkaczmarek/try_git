package try_git.client;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.web.bindery.event.shared.EventBus;
import try_git.client.place.HelloPlace;
import try_git.client.place.ModuleAppPlaceHolder;
import com.oxit.fwk.gwt.mvp.client.history.AppPlaceHistoryMapper;
import com.oxit.fwk.gwt.mvp.client.history.AppPlaceHistoryMapperImpl;
import com.oxit.fwk.gwt.mvp.client.place.holder.AppPlaceHolder;

/**
 * Application entry point
 */
public class Blank implements EntryPoint {
	public static final AppGinjector appGinjector = GWT.create(AppGinjector.class);

	public void onModuleLoad() {
		// Create a panel that we can set as primary goal of MVP
		ScrollPanel scrollPanel=new ScrollPanel();
		RootPanel.get("content").add(scrollPanel);

		// Define the default place
		HelloPlace defaultPlace = appGinjector.getHelloPlace();

		// retrive eventBus, placeController
		ClientFactory clientFactory = appGinjector.getClientFactory();
		EventBus eventBus = clientFactory.getEventBus();
		PlaceController placeController = clientFactory.getPlaceController();

		// Start ActivityManager for the main widget with our ActivityMapper
		ActivityMapper activityMapper = appGinjector.getActivityMapper();
		ActivityManager activityManager = new ActivityManager(activityMapper,eventBus);
		activityManager.setDisplay(scrollPanel);

		// Start PlaceHistoryHandler with our PlaceHistoryMapper
		AppPlaceHolder aPlaceHolder = ModuleAppPlaceHolder.getInstance();
		// configure place holder to register places
		aPlaceHolder.configure();
		AppPlaceHistoryMapper historyMapper = new AppPlaceHistoryMapperImpl(aPlaceHolder);

		PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(historyMapper);
		historyHandler.register(placeController, eventBus, defaultPlace);

		// Goes to place represented on URL or default place
		historyHandler.handleCurrentHistory();
	}

}
