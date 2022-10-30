package com.se250.store.service;

import com.se250.store.entity.ProdInfo;

import java.util.List;

/**
 * (ProdInfo)表服务接口
 *
 * @author makejava
 * @since 2022-10-25 18:59:37
 */
public interface ProdInfoService {

    List<ProdInfo> lists();

    /**
     * 通过ID查询单条数据
     *
     * @param prodId 主键
     * @return 实例对象
     *//*
    ProdInfo queryById(Integer prodId);

    *//**
     * 分页查询
     *
     * @param prodInfo 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     *//*
    Page<ProdInfo> queryByPage(ProdInfo prodInfo, PageRequest pageRequest);

    *//**
     * 新增数据
     *
     * @param prodInfo 实例对象
     * @return 实例对象
     *//*
    ProdInfo insert(ProdInfo prodInfo);

    *//**
     * 修改数据
     *
     * @param prodInfo 实例对象
     * @return 实例对象
     *//*
    ProdInfo update(ProdInfo prodInfo);

    *//**
     * 通过主键删除数据
     *
     * @param prodId 主键
     * @return 是否成功
     *//*
    boolean deleteById(Integer prodId);*/

}
