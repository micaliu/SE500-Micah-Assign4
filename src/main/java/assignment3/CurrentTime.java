package assignment3;

import com.google.inject.Singleton;

import java.util.Date;

/**
 * 获取当前时间标准实现: 获取当前真实时间, 相应的, 不允许设置当前时间值
 * <a href="mailto:nathanael4ever@gmail.com">Nathanael Yang</a> 4/20/2016 1:13 PM
 */
@Singleton
public class CurrentTime implements Now {
    @Override
    public Date get() {
        return new Date();
    }

    @Override
    public void set(Date date) {
        System.err.println("Warning: It does not make sense to set current time and it won't effect anything.");
    }
}
