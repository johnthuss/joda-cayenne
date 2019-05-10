package com.icsusa.joda.cgen;


import java.util.Optional;

import org.apache.cayenne.exp.property.DateProperty;
import org.apache.cayenne.gen.PropertyDescriptor;
import org.apache.cayenne.gen.property.PropertyDescriptorCreator;

public class JodaPropertyDescriptorCreator implements PropertyDescriptorCreator {
	
    @Override
    public Optional<PropertyDescriptor> apply(Class<?> aClass) {
        if (aClass.getName().startsWith("org.joda.time.")) {
            return Optional.of(new PropertyDescriptor(DateProperty.class.getName(), "PropertyFactory.createDate"));
        }
        return Optional.empty();
    }
    
}
