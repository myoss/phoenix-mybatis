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

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;

import app.myoss.cloud.mybatis.mapper.annotation.RegisterMapper;
import app.myoss.cloud.mybatis.mapper.template.select.impl.SelectIncludeLogicDeleteMapperTemplate;
import app.myoss.cloud.mybatis.table.annotation.Column;

/**
 * 查询记录通用 Mapper 接口，不会过滤掉已经被标记为逻辑删除（{@link Column#logicDelete}）的数据
 *
 * @param <T> 实体类
 * @author Jerry.Chen
 * @since 2018年6月11日 下午11:02:45
 */
@RegisterMapper
public interface SelectByPrimaryKeyIncludeLogicDeleteMapper<T> {
    /**
     * 根据主键id查询实体对象，不会过滤掉已经被标记为逻辑删除（{@link Column#logicDelete}）的数据
     *
     * @param id 主键id
     * @return 对应的实体对象
     * @see SelectIncludeLogicDeleteMapperTemplate#selectByPrimaryKeyIncludeLogicDelete
     */
    @SelectProvider(type = SelectIncludeLogicDeleteMapperTemplate.class, method = "dynamicSql")
    T selectByPrimaryKeyIncludeLogicDelete(Serializable id);

    /**
     * 根据主键字段查询实体对象，可以支持多主键字段的表，不会过滤掉已经被标记为逻辑删除（{@link Column#logicDelete}）的数据
     *
     * @param condition 匹配的条件，主键有值的实体对象
     * @return 对应的实体对象
     * @see SelectIncludeLogicDeleteMapperTemplate#selectWithPrimaryKeyIncludeLogicDelete
     */
    @SelectProvider(type = SelectIncludeLogicDeleteMapperTemplate.class, method = "dynamicSql")
    T selectWithPrimaryKeyIncludeLogicDelete(T condition);

    /**
     * 根据主键字段查询实体对象，可以支持查询多个主键，不会过滤掉已经被标记为逻辑删除（{@link Column#logicDelete}）的数据
     *
     * @param ids 多个主键id
     * @return 对应的实体对象
     * @see SelectIncludeLogicDeleteMapperTemplate#selectListByPrimaryKeyIncludeLogicDelete
     */
    @SelectProvider(type = SelectIncludeLogicDeleteMapperTemplate.class, method = "dynamicSql")
    List<T> selectListByPrimaryKeyIncludeLogicDelete(@Param("ids") Collection<? extends Serializable> ids);

    /**
     * 根据主键字段查询实体对象，可以支持查询多个主键，不会过滤掉已经被标记为逻辑删除（{@link Column#logicDelete}）的数据
     *
     * @param ids 多个主键id
     * @return 对应的实体对象
     * @see SelectIncludeLogicDeleteMapperTemplate#selectListWithPrimaryKeyIncludeLogicDelete
     */
    @SelectProvider(type = SelectIncludeLogicDeleteMapperTemplate.class, method = "dynamicSql")
    List<T> selectListWithPrimaryKeyIncludeLogicDelete(@Param("ids") Collection<T> ids);
}
