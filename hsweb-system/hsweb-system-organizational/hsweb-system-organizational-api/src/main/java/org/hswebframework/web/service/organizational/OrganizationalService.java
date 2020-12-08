/*
 *  Copyright 2020 http://www.hswebframework.org
 *  
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *  
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  
 */
package org.hswebframework.web.service.organizational;

import org.hswebframework.web.entity.organizational.OrganizationalEntity;
import org.hswebframework.web.service.CrudService;
import org.hswebframework.web.service.TreeService;

import java.util.List;

/**
 * 组织 服务类
 *
 * @author hsweb-generator-online
 */
public interface OrganizationalService extends
        TreeService<OrganizationalEntity, String>
        , CrudService<OrganizationalEntity, String> {

    void disable(String id);

    void enable(String id);

    OrganizationalEntity selectByCode(String code);

    OrganizationalEntity selectByName(String name);

}
