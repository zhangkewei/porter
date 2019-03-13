/*
 * Copyright ©2018 vbill.cn.
 * <p>
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
 * </p>
 */

package cn.vbill.middleware.porter.common.cluster.command;

import cn.vbill.middleware.porter.common.config.DataLoaderConfig;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 数据源推送
 * 
 * @author guohongjian[guo_hj@suixingpay.com]
 *
 */
@AllArgsConstructor
public class DataSourcePushCommand implements ClusterCommand {

    @Getter
    private DataLoaderConfig loader;

}
