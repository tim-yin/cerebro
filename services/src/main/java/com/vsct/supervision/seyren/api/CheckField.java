/*
 * This file is part of the Cerebro distribution.
 * (https://github.com/voyages-sncf-technologies/cerebro)
 * Copyright (C) 2017 VSCT.
 *
 * Cerebro is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, version 3 of the License.
 *
 * Cerebro is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.vsct.supervision.seyren.api;

/**
 * Created by francois_nollen on 30/03/2016.
 */
public enum CheckField {

    ID("id"),
    NAME("name"),
    DESCRIPTION("description"),
    TARGET("target"),
    FROM("from"),
    UNTIL("until"),
    WARN("warn"),
    ERROR("error"),
    ENABLED("enabled"),
    LIVE("live"),
    STATE("state"),
    LASTCHECK("lastCheck"),
    SUBSCRIPTIONS("subscriptions");

    String fieldName;

    CheckField(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldName() {
        return fieldName;
    }
}
