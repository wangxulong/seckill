package com.shu.dao;

import com.shu.entity.SucceedSecKill;

/**
 * Created by wxl on 2016/5/7.
 */
public interface SucceedSecKillDao {

    /**
     * 插入购买明细
     * @param secKillId
     * @param userPhone
     * @return
     */
    int insert(long secKillId,String userPhone);

    SucceedSecKill queryByIdWithSecKill(Long secKillId);
}
