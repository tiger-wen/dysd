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
package org.dysd.dao.mybatis.schema.script;

import java.util.List;

import org.apache.ibatis.parsing.XNode;
import org.apache.ibatis.scripting.xmltags.SqlNode;
import org.apache.ibatis.session.Configuration;

/**
 * 语句级元素处理器
 * @author linjisong
 * @version 0.0.1
 * @date 2016-11-12
 */
public interface IScriptHandler {

	/**
	 * 处理语句级元素
	 * @param configuration
	 * @param node
	 * @param targetContents
	 */
	void handleScriptNode(Configuration configuration, XNode node, List<SqlNode> targetContents);
}
