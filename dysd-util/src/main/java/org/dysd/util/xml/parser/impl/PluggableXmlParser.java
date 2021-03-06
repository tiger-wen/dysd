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
package org.dysd.util.xml.parser.impl;

import org.dysd.util.exception.ExceptionCodes;
import org.dysd.util.exception.Throw;
import org.dysd.util.xml.XmlHelper;
import org.dysd.util.xml.context.IXmlParserContext;
import org.dysd.util.xml.parser.INamespaceParser;
import org.springframework.core.io.Resource;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * 可扩展的XML解析实现类
 * @author linjisong
 * @version 0.0.1
 * @date 2016-11-12
 */
public class PluggableXmlParser<E extends IXmlParserContext> extends AbstractXmlParser<E>{
	
	@Override
	protected void parseDocument(E parserContext, Document document, Resource resource) {
		Element root = document.getDocumentElement();
		INamespaceParser<E> parser = getNamespaceParser(document.getDocumentElement());
		if(null == parser){
			Throw.createException(ExceptionCodes.DYSD010009, "not found the namespace parser. ["+XmlHelper.getNamespaceURI(root)+"] ");
		}
		parser.parse(parserContext, document, resource);
	}
	
	@Override
	protected void onFinishParse(E parserContext) {
		if(null != parserContext.getDelegate()){
			parserContext.getDelegate().onFinishParse();
		}
		super.onFinishParse(parserContext);
	}
}
