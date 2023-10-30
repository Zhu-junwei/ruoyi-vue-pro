package cn.iocoder.yudao.module.crm.service.permission;


import cn.iocoder.yudao.module.crm.dal.dataobject.permission.CrmPermissionDO;
import cn.iocoder.yudao.module.crm.framework.enums.CrmEnum;
import cn.iocoder.yudao.module.crm.service.permission.bo.CrmPermissionCreateBO;
import cn.iocoder.yudao.module.crm.service.permission.bo.CrmPermissionUpdateBO;
import cn.iocoder.yudao.module.crm.service.permission.bo.TransferCrmPermissionBO;

import javax.validation.Valid;

/**
 * crm 数据权限 Service 接口
 *
 * @author HUIHUI
 */
public interface CrmPermissionService {

    /**
     * 创建数据权限
     *
     * @param createBO 创建信息
     * @return 编号
     */
    Long createCrmPermission(@Valid CrmPermissionCreateBO createBO);

    /**
     * 更新数据权限
     *
     * @param updateBO 更新信息
     */
    void updateCrmPermission(@Valid CrmPermissionUpdateBO updateBO);

    /**
     * 删除数据权限
     *
     * @param id 编号
     */
    void deleteCrmPermission(Long id);

    /**
     * 获得数据权限
     *
     * @param crmType 数据类型 关联 {@link CrmEnum}
     * @param crmDataId 数据编号 关联 {@link CrmEnum} 对应模块 DO#getId()
     * @return 数据权限
     */
    CrmPermissionDO getCrmPermissionByCrmTypeAndCrmDataId(Integer crmType, Long crmDataId);

    /**
     * 数据权限转移
     *
     * @param transferCrmPermissionBO 数据权限转移请求
     */
    void transferCrmPermission(@Valid TransferCrmPermissionBO transferCrmPermissionBO);

}