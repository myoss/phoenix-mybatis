/*
 * Copyright 2018-2018 https://github.com/myoss
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package app.myoss.cloud.mybatis.mapper.template.select;

import app.myoss.cloud.mybatis.mapper.annotation.RegisterMapper;
import app.myoss.cloud.mybatis.table.annotation.Column;

/**
 * 读取（Retrieve）操作，通用 Mapper 接口，不会过滤掉已经被标记为逻辑删除（{@link Column#logicDelete}）的数据
 *
 * @param <T> 实体类
 * @author Jerry.Chen
 * @since 2018年4月29日 下午5:14:41
 */
@RegisterMapper
public interface RetrieveIncludeLogicDeleteMapper<T> extends SelectOneIncludeLogicDeleteMapper<T>,
        SelectListIncludeLogicDeleteMapper<T>, SelectCountIncludeLogicDeleteMapper<T>,
        SelectPageIncludeLogicDeleteMapper<T>, SelectByPrimaryKeyIncludeLogicDeleteMapper<T> {
}
