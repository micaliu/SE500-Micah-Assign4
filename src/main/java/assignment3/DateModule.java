package assignment3;

import com.google.inject.AbstractModule;

class DateModule extends AbstractModule {

    protected void configure() {
        this.bind(Now.class).to(CurrentTime.class);
    }

}
