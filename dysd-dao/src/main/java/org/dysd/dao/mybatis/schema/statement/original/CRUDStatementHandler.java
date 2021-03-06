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
package org.dysd.dao.mybatis.schema.statement.original;

import org.apache.ibatis.builder.IncompleteElementException;
import org.apache.ibatis.builder.xml.XMLStatementBuilder;
import org.apache.ibatis.parsing.XNode;
import org.apache.ibatis.session.Configuration;
import org.dysd.dao.mybatis.component.impl.MybatisComponents;
import org.dysd.dao.mybatis.schema.SchemaSqlMapperParserDelegate;
import org.dysd.dao.mybatis.schema.statement.StatementHandlerSupport;

/**
 * select|update|insert|delete元素处理器
 * @author linjisong
 * @version 0.0.1
 * @date 2016-11-12
 */
public class CRUDStatementHandler extends StatementHandlerSupport{

	@Override
	public void handleStatementNode(Configuration configuration, SchemaSqlMapperParserDelegate delegate, XNode node) {
		String databaseId = configuration.getDatabaseId();
		if(databaseId != null){
			buildStatementFromContext(configuration, delegate, node, databaseId);
		}
		buildStatementFromContext(configuration, delegate, node, null);
	}

	private void buildStatementFromContext(Configuration configuration, SchemaSqlMapperParserDelegate delegate, XNode node, String requiredDatabaseId) {
		XMLStatementBuilder statementParser = MybatisComponents.newXMLStatementBuilder(configuration, delegate.getBuilderAssistant(),
				node, requiredDatabaseId);
		try {
			statementParser.parseStatementNode();
		} catch (IncompleteElementException e) {
			configuration.addIncompleteStatement(statementParser);
		}
	}
}
