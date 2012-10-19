package try_git.client.place;

import com.google.inject.Inject;
import try_git.client.activity.HelloActivity;
import com.oxit.fwk.gwt.mvp.client.place.ActivityPlace;


public class HelloPlace extends ActivityPlace<HelloActivity> {

    public static final String NAME = HelloPlace.class.getName();

    @Inject
    public HelloPlace(HelloActivity activity) {
    	super(activity);
    }

    @Override
    public String getToken() {
        return NAME;
    }

}
