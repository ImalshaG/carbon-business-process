/*
 * Copyright (c) 2010 - 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.bpel.core.ode.integration.config.analytics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Holds Analytics stream configuration data
 */
public class AnalyticsStreamConfiguration {
    private String name;
    private String nickName;
    private String description;
    private String version;
    private List<AnalyticsKey> payloadAnalyticsKeyList = new ArrayList<AnalyticsKey>();
    private List<AnalyticsKey> correlationAnalyticsKeyList = new ArrayList<AnalyticsKey>();
    private List<AnalyticsKey> metaAnalyticsKeyList = new ArrayList<AnalyticsKey>();

    public AnalyticsStreamConfiguration(String name, String nickName, String description, String version) {
        this.name = name;
        this.nickName = nickName;
        this.description = description;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public String getNickName() {
        return nickName;
    }

    public String getDescription() {
        return description;
    }

    public String getVersion() {
        return version;
    }

    public List<AnalyticsKey> getMetaAnalyticsKeyList() {
        return metaAnalyticsKeyList;
    }

    public void addMetaAnalyticsKey(AnalyticsKey analyticsKey) {
        metaAnalyticsKeyList.add(analyticsKey);
    }

    /**
     * Add a list of meta analytics keys.
     * @param analyticsKeys
     */
    public void addAllMetaAnalyticsKeys(Collection<AnalyticsKey> analyticsKeys) {
        metaAnalyticsKeyList.addAll(analyticsKeys);
    }

    public List<AnalyticsKey> getCorrelationAnalyticsKeyList() {
        return correlationAnalyticsKeyList;
    }

    /**
     * Add the given correlation key to the configuration.
     * @param analyticsKey
     */
    public void addCorrelationAnalyticsKey(AnalyticsKey analyticsKey) {
        correlationAnalyticsKeyList.add(analyticsKey);
    }

    /**
     * Add a list of correlation keys to the configuration.
     * @param analyticsKeys
     */
    public void addAllCorrelationAnalyticsKeys(Collection<AnalyticsKey> analyticsKeys) {
        correlationAnalyticsKeyList.addAll(analyticsKeys);
    }

    /**
     * Get payload analytics key list.
     * @return payloadAnalyticsKeyList
     */
    public List<AnalyticsKey> getPayloadAnalyticsKeyList() {
        return payloadAnalyticsKeyList;
    }

    /**
     * Add a payload analytics key to the key list.
     * @param analyticsKey
     */
    public void addPayloadAnalyticsKey(AnalyticsKey analyticsKey) {
        payloadAnalyticsKeyList.add(analyticsKey);
    }

    /**
     * Add a list of AnalyticsKeys to the payload analytics list.
     * @param analyticsKey
     */
    public void addAllPayloadAnalyticsKeys(Collection<AnalyticsKey> analyticsKey) {
        payloadAnalyticsKeyList.addAll(analyticsKey);
    }
}
