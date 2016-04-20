package assignment3;

import com.google.inject.AbstractModule;

/**
 * 测试场景日期模块定义
 * <a href="mailto:nathanael4ever@gmail.com">Nathanael Yang</a> 4/20/2016 1:18 PM
 */
public class DummyDateModule extends AbstractModule {

    protected void configure() {
        this.bind(Now.class).to(DummyNow.class).asEagerSingleton();
    }

}
