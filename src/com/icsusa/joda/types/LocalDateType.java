/*****************************************************************
 *   Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 ****************************************************************/

package com.icsusa.joda.types;

import java.sql.Date;

import org.apache.cayenne.access.types.ValueObjectType;
import org.joda.time.LocalDate;

/**
 * Handles <code>org.joda.time.LocalDate</code> type mapping.
 *
 */
public class LocalDateType implements ValueObjectType<LocalDate, Date> {

    @Override
    public Class<Date> getTargetType() {
        return Date.class;
    }

    @Override
    public Class<LocalDate> getValueType() {
        return LocalDate.class;
    }

    @Override
    public LocalDate toJavaObject(Date value) {
        return new LocalDate(value.getTime());
    }

    @Override
    public Date fromJavaObject(LocalDate object) {
        return new Date(object.toDate().getTime());
    }

    @Override
    public String toCacheKey(LocalDate object) {
        return object.toString();
    }
    
}
