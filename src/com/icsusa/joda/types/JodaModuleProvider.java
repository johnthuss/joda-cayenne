package com.icsusa.joda.types;

import java.util.Collection;
import java.util.Collections;

import org.apache.cayenne.configuration.server.CayenneServerModuleProvider;
import org.apache.cayenne.di.Module;

public class JodaModuleProvider implements CayenneServerModuleProvider {
	
    public Module module() {
        return new JodaModule();
    }

    public Class<? extends Module> moduleType() {
        return JodaModule.class;
    }

    public Collection<Class<? extends Module>> overrides() {
        return Collections.emptyList();
    }
    
}