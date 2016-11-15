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
package org.dysd.util.base;

/**
 * 校验工具类
 * @author linjisong
 * @version 0.0.1
 * @since 0.0.1
 * @date 2016-11-8
 */
public abstract class BaseCheckUtils {

	private static final BaseCheckUtils instance = new BaseCheckUtils(){};
	private BaseCheckUtils(){
	}
	
	/**
	 * 获取单实例
	 * @return
	 */
	/*package*/ static BaseCheckUtils getInstance(){
		return instance;
	}
	
	/**
	 * 是否为空白字符串
	 * @param cs 字符串序列
	 * @return 是否为空白字符串
	 */
	public boolean isBlank(CharSequence cs) {
		int strLen;
        if (cs == null || (strLen = cs.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if (Character.isWhitespace(cs.charAt(i)) == false) {
                return false;
            }
        }
        return true;
	}
}
