package sebinsunny.chatp;

import android.app.Application;

import com.parse.Parse;

/**
 * The Class ChattApp is the Main Application class of this app. The onCreate
 * method of this class initializes the Parse.
 */
public class ChattApp extends Application
{

	/* (non-Javadoc)
	 * @see android.app.Application#onCreate()
	 */
	@Override
	public void onCreate() {
		super.onCreate();
		Parse.enableLocalDatastore(this);
		// set applicationId, and server server based on the values in the Heroku settings.
		// clientKey is not needed unless explicitly configured
		// any network interceptors must be added with the Configuration Builder given this syntax
		Parse.initialize(new Parse.Configuration.Builder(this)
				.applicationId("america")
				.clientKey("sebin")

				.server("http://sebinsunny.com:1337/parse/").build()
		);

	}
}
