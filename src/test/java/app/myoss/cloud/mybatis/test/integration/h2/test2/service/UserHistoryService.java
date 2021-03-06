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

package app.myoss.cloud.mybatis.test.integration.h2.test2.service;

import java.util.List;

import app.myoss.cloud.mybatis.repository.service.CrudService;
import app.myoss.cloud.mybatis.test.integration.h2.test2.entity.UserHistory;

/**
 * This service interface access the database table t_sys_user_history
 * <p>
 * Database Table Remarks: 系统用户信息历史备份表
 * </p>
 *
 * @author jerry
 * @since 2018年5月14日 下午3:39:43
 */
public interface UserHistoryService extends CrudService<UserHistory> {
    /**
     * 查询相似的记录
     *
     * @param name 名字
     * @return 匹配的记录
     */
    List<UserHistory> findLikeName(String name);
}
