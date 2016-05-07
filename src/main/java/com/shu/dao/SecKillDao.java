package com.shu.dao;

import com.shu.entity.SecKill;

import java.util.Date;
import java.util.List;

/**
 * Created by wxl on 2016/5/7.
 */
public interface SecKillDao  {
    /**
     * 减库存
     * @param secKillId
     * @param killTime
     * @return
     */
    int reduceNum(Long secKillId, Date killTime);

    /**
     * 根据ID查询
     * @param secKillId
     * @return
     */
    SecKill queryById(Long secKillId);

    /**
     * 根据偏移量查询
     * @param offset
     * @param limit
     * @return
     */
    List<SecKill> queryAll(int offset, int limit);
}
