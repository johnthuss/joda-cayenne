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

import java.sql.Timestamp;

import org.apache.cayenne.access.types.ValueObjectType;
import org.joda.time.DateTime;

/**
 * Handles <code>org.joda.time.DateTime</code> type mapping.
 *
 */
public class DateTimeType implements ValueObjectType<DateTime, Timestamp> {

    @Override
    public Class<Timestamp> getTargetType() {
        return Timestamp.class;
    }

    @Override
    public Class<DateTime> getValueType() {
        return DateTime.class;
    }

    @Override
    public DateTime toJavaObject(Timestamp value) {
        return new DateTime(value.getTime());
    }

    @Override
    public Timestamp fromJavaObject(DateTime object) {
        return new Timestamp(object.getMillis());
    }

    @Override
    public String toCacheKey(DateTime object) {
        return object.toString();
    }
}
