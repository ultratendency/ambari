/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ambari.server.state;

import java.util.Map;

import org.apache.ambari.server.AmbariException;
import org.apache.ambari.server.controller.ServiceComponentResponse;

public interface ServiceComponent {

  public String getName();

  public String getServiceName();

  public long getClusterId();

  // TODO
  public String getClusterName();

  public State getDesiredState();

  public void setDesiredState(State state);

  public Map<String, Config> getDesiredConfigs();

  public void updateDesiredConfigs(Map<String, Config> configs);

  public StackVersion getDesiredStackVersion();

  public void setDesiredStackVersion(StackVersion stackVersion);

  public Map<String, Config> getConfigs();

  public void updateConfigs(Map<String, Config> configs);

  public Map<String, ServiceComponentHost> getServiceComponentHosts();

  public ServiceComponentHost getServiceComponentHost(String hostname)
      throws AmbariException;

  public void addServiceComponentHosts(Map<String, ServiceComponentHost>
      hostComponents) throws AmbariException ;

  public void addServiceComponentHost(ServiceComponentHost hostComponent)
      throws AmbariException ;

  public ServiceComponentResponse convertToResponse();

  public void debugDump(StringBuilder sb);
}
