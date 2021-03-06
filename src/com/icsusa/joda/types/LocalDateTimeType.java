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
import org.joda.time.LocalDateTime;

/**
 * Handles <code>org.joda.time.LocalDateTime</code> type mapping.
 *
 */
public class LocalDateTimeType implements ValueObjectType<LocalDateTime, Timestamp> {

    @Override
    public Class<Timestamp> getTargetType() {
        return Timestamp.class;
    }

    @Override
    public Class<LocalDateTime> getValueType() {
        return LocalDateTime.class;
    }

    @Override
    public LocalDateTime toJavaObject(Timestamp value) {
        return new LocalDateTime(value.getTime());
    }

    @Override
    public Timestamp fromJavaObject(LocalDateTime object) {
        return new Timestamp(object.toDateTime().getMillis());
    }

    @Override
    public String toCacheKey(LocalDateTime object) {
        return object.toString();
    }
}
