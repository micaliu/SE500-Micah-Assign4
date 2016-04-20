package assignment3;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

public class RestOnSundayModule extends AbstractModule {

    protected void configure() {
        SundayBlocker sundayBlocker = new SundayBlocker();
        this.requestInjection(sundayBlocker);
        this.bindInterceptor(Matchers.any(), Matchers.annotatedWith(NotOnSunday.class), sundayBlocker);
    }
}
