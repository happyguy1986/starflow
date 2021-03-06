/*
 * Copyright 2010-2011 the original author or authors.
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

package com.googlecode.starflow.service.spi;

import com.googlecode.starflow.engine.model.ActivityInst;
import com.googlecode.starflow.engine.model.ProcessInstance;

/**
 * 环节异常策略：自动执行规则逻辑
 * 执行接口
 * 
 * @author libinsong1204@gmail.com
 * @version 1.0
 */
public interface IApplicationExecptionAction {
	
	/**
	 * 
	 * @param exception 
	 * @param processInstance 流程实例
	 * @param activityInst 环节实例
	 */
	public void execute(Exception exception, ProcessInstance processInstance, ActivityInst activityInst);
}