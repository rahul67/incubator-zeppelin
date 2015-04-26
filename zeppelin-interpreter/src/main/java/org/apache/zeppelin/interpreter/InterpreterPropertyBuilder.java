/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.zeppelin.interpreter;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * InterpreterPropertyBuilder
 */
public class InterpreterPropertyBuilder {

  Logger logger = LoggerFactory.getLogger(InterpreterPropertyBuilder.class);

  Map<String, InterpreterProperty> properties = new HashMap<String, InterpreterProperty>();

  public InterpreterPropertyBuilder add(String name, String defaultValue, String description){
    logger.debug("Interpreter Configuration: {} = {}", name, defaultValue);
    properties.put(name, new InterpreterProperty(defaultValue, description));
    return this;
  }

  public Map<String, InterpreterProperty> build(){
    return properties;
  }
}
