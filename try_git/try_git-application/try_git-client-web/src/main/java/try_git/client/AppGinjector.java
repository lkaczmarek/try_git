package try_git.client;

import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import try_git.client.place.HelloPlace;


@GinModules(AppGinModule.class)
public interface AppGinjector extends Ginjector {
	// Client factory and activity mapper
	public ClientFactory getClientFactory();
	public ActivityMapper getActivityMapper();

	
	// Place declarations 
	public HelloPlace getHelloPlace();	
}
