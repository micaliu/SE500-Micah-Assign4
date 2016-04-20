package assignment3;

import com.google.inject.Guice;
import com.google.inject.Inject;

import java.text.SimpleDateFormat;

class Worker {
    @Inject private Now now;

    @NotOnSunday
    public void workLikeADog() {
        String dayOfWeek = new SimpleDateFormat("EEEE").format(now.get());
        System.out.println("I am working now(" + dayOfWeek + ")...and I want to work even on Sunday to make more money...");
    }

    public static void main(String[] args) {
        Worker worker = Guice.createInjector(new DateModule(), new RestOnSundayModule()).getInstance(Worker.class);
        worker.workLikeADog();
    }

}