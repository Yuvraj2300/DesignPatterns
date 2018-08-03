package com.dp.DesignPatterns.di;


import static java.lang.annotation.ElementType. FIELD ;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({FIELD})
public @interface Mongo {

}
