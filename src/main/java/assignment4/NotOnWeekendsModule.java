package assignment4;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

public class NotOnWeekendsModule extends AbstractModule {

    protected void configure() {
        WeekendBlocker weekendsBlocker = new WeekendBlocker();
        this.requestInjection(weekendsBlocker);
        this.bindInterceptor(Matchers.any(), Matchers.annotatedWith(NotOnWeekends.class), weekendsBlocker);
    }
}
