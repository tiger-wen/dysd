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
package org.dysd.util.parser.impl;

import java.util.Collection;

import org.dysd.util.parser.IParseEventListener;
import org.dysd.util.parser.IParserContext;
import org.springframework.core.io.Resource;

/**
 * 解析器侦听器支持类
 * @author linjisong
 * @version 0.0.1
 * @date 2016-11-12
 */
public class ParseEventListenerSupport implements IParseEventListener{

	@Override
	public void onBeforeParse(IParserContext context, Collection<Resource> resources) {
		
	}

	@Override
	public void onFinishParse(IParserContext context, Collection<Resource> resources) {
		
	}

	@Override
	public void onBeforeParseOneResource(IParserContext context, Resource resource) {
		
	}

	@Override
	public void onFailureParseOneResource(IParserContext context, Resource resource, Exception e) {
		
	}

	@Override
	public void onSuccessParseOneResource(IParserContext context, Resource resource) {
		
	}
}
