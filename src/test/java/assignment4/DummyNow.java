package assignment4;

import java.util.Date;

/**
 * 测试场景下可随意设定当前时间的辅助类
 * <a href="mailto:nathanael4ever@gmail.com">Nathanael Yang</a> 4/20/2016 1:25 PM
 */
public class DummyNow implements Now {
    private Date date;

    @Override
    public synchronized Date get() {
        return date == null ? new Date() : date;
    }

    @Override
    public synchronized void set(Date date) {
        this.date = date;
    }
}
