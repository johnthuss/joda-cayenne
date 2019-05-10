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

import java.sql.Time;

import org.apache.cayenne.access.types.ValueObjectType;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;

/**
 * Handles <code>org.joda.time.LocalTime</code> type mapping.
 *
 */
public class LocalTimeType  implements ValueObjectType<LocalTime, Time> {

    private static final LocalDate EPOCH = new LocalDate(0, DateTimeZone.UTC);

    @Override
    public Class<Time> getTargetType() {
        return Time.class;
    }

    @Override
    public Class<LocalTime> getValueType() {
        return LocalTime.class;
    }

    @Override
    public LocalTime toJavaObject(Time value) {
        return new LocalTime(value.getTime());
    }

    @Override
    public Time fromJavaObject(LocalTime object) {
        long millis = EPOCH.toDateTime(object).getMillis();
        return new Time(millis);
    }

    @Override
    public String toCacheKey(LocalTime object) {
        return object.toString();
    }
    
}
