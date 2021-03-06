/**
 * @Title:fegin调用
 * @Description:调用authorize服务
 * Copyright 2018 GemFrame技术团队 http://www.gemframe.cn
 * Company: DianShiKongJian (Beijing) Technology Co., Ltd.
 * @author Ryan
 * @date 2018-11-1 16:06:06
 * @version V1.0
 *
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package cn.gemframe.business.feign;

import cn.gemframe.business.vo.GemUserRoleVo;
import cn.gemframe.config.response.ResultData;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Title:fegin调用
 * @Description:调用authorize服务
 * @author Ryan
 * @date 2018-11-1 16:06:06
 * @version V1.0
 */
@FeignClient(name = "authorize")
public interface GemRoleFeginClient {

	/**
	 * @Description:保存用户角色关系信息
	 * @param userRole 用户角色关系信息
	 * @author: Ryan
	 * @date 2018年11月6日
	 */
	@PostMapping("role/saveUserAndRole")
	public ResponseEntity<ResultData> saveUserAndRole(@RequestBody GemUserRoleVo userRole);
}
