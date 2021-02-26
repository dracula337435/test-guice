package io.dracula.test.guice;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import io.dracula.test.guice.github.example.BillingService;
import io.dracula.test.guice.github.example.HelloService;
import io.dracula.test.guice.github.example.impl.BillingServiceImpl;
import io.dracula.test.guice.github.example.impl.HelloServiceImpl;
import org.junit.Test;

/**
 * @author dk
 */
public class TestGuice {

    @Test
    public void test(){
        Injector injector = Guice.createInjector(new MyModule());
        BillingService billingService = injector.getInstance(BillingService.class);
        billingService.print();
        billingService = injector.getInstance(BillingService.class);
        billingService.print();
        //
        injector = Guice.createInjector(new MyModule());
        billingService = injector.getInstance(BillingService.class);
        billingService.print();
    }

    public static class MyModule extends AbstractModule {
        @Override
        protected void configure() {
            bind(HelloService.class).to(HelloServiceImpl.class);
            bind(BillingService.class).to(BillingServiceImpl.class);
        }
    }

}
