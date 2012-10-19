package try_git.client.place;

import try_git.client.Blank;
import com.oxit.fwk.gwt.mvp.client.place.holder.AppPlaceHolder;

public class ModuleAppPlaceHolder extends AppPlaceHolder {

	private static final ModuleAppPlaceHolder instance = new ModuleAppPlaceHolder();

	private ModuleAppPlaceHolder() {}

	@Override
	public void configure() {
		registerHelloPlace();
		// ...
	}

	private void registerHelloPlace() {
		final HelloPlace place = Blank.appGinjector.getHelloPlace();
		registerPlace(place);
	}


	/**
	 * @return the instance
	 */
	public static ModuleAppPlaceHolder getInstance() {
		return instance;
	}
}

