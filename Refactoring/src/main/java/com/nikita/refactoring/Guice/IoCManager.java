package com.nikita.refactoring.Guice;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Created by nikita on 22/11/15.
 */
public class IoCManager
{
    private Injector injector;

    public IoCManager() {
        this.injector = Guice.createInjector(new RefactorModule());
    }

    public <T> T getInstance(Class<T> var1) {
        return injector.getInstance(var1);
    }
}
