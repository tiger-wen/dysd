/**
 * Copyright (c) 2016-2017, the original author or authors (dysd_2016@163.com).
 * <p>
 * Licensed under the GPL, Version 3.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.gnu.org/licenses/gpl.html
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.dysd.util.logger.termination;

import org.dysd.util.logger.level.LogLevel;
import org.dysd.util.logger.stack.IStack;

/**
 * 日志终端
 * @author linjisong
 * @version 0.0.1
 * @date 2016-11-10
 */
public interface ILogTermination {

	/**
	 * 根据日志级别写日志
	 * @param level  日志级别
	 * @param stack  日志堆栈信息
	 */
	public void write(LogLevel level, IStack stack);
}