package try_git.client;

import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;
import try_git.client.place.HelloPlace;
import com.oxit.fwk.gwt.mvp.client.activity.mapper.AppActivityMapper;


public class AppGinModule extends AbstractGinModule {

	@Override
	protected void configure() {
		
		bind(ActivityMapper.class).to(AppActivityMapper.class).in(Singleton.class);
		
		bind(ClientFactory.class).to(ClientFactoryImpl.class).in(Singleton.class);
		
		bind(HelloPlace.class).in(Singleton.class);
	}

}
