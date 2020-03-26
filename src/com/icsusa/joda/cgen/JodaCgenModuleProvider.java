package com.icsusa.joda.cgen;

import java.util.Collection;
import java.util.Collections;

import org.apache.cayenne.di.Module;
import org.apache.cayenne.tools.CayenneToolsModuleProvider;

public class JodaCgenModuleProvider implements CayenneToolsModuleProvider {
	
    public Module module() {
        return new JodaCgenModule();
    }

    public Class<? extends Module> moduleType() {
        return JodaCgenModule.class;
    }

    public Collection<Class<? extends Module>> overrides() {
        return Collections.emptyList();
    }
    
}