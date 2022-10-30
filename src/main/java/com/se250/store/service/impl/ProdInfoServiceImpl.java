package com.se250.store.service.impl;

import com.se250.store.entity.ProdInfo;
import com.se250.store.mapper.ProdInfoMapper;
import com.se250.store.service.ProdInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class ProdInfoServiceImpl implements ProdInfoService{
    private ProdInfoMapper prodInfoMapper;

    @Autowired
    public ProdInfoServiceImpl(ProdInfoMapper prodInfoMapper){
        this.prodInfoMapper = prodInfoMapper;
    }

    @Override
    public List<ProdInfo> lists(){
        return prodInfoMapper.lists();
    }

}
/**
 * (ProdInfo)表服务实现类
 *
 * @author makejava
 * @since 2022-10-25 18:59:38
 */
/*
@Service("prodInfoService")
public class ProdInfoServiceImpl implements ProdInfoService {
    @Resource
    private ProdInfoMapper prodInfoMapper;

    */
/**
     * 通过ID查询单条数据
     *
     * @param prodId 主键
     * @return 实例对象
     *//*

    @Override
    public ProdInfo queryById(Integer prodId) {
        return this.prodInfoMapper.queryById(prodId);
    }

    */
/**
     * 分页查询
     *
     * @param prodInfo 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     *//*

    @Override
    public Page<ProdInfo> queryByPage(ProdInfo prodInfo, PageRequest pageRequest) {
        long total = this.prodInfoMapper.count(prodInfo);
        return new PageImpl<>(this.prodInfoMapper.queryAllByLimit(prodInfo, pageRequest), pageRequest, total);
    }

    */
/**
     * 新增数据
     *
     * @param prodInfo 实例对象
     * @return 实例对象
     *//*

    @Override
    public ProdInfo insert(ProdInfo prodInfo) {
        this.prodInfoMapper.insert(prodInfo);
        return prodInfo;
    }

    */
/**
     * 修改数据
     *
     * @param prodInfo 实例对象
     * @return 实例对象
     *//*

    @Override
    public ProdInfo update(ProdInfo prodInfo) {
        this.prodInfoMapper.update(prodInfo);
        return this.queryById(prodInfo.getProdId());
    }

    */
/**
     * 通过主键删除数据
     *
     * @param prodId 主键
     * @return 是否成功
     *//*

    @Override
    public boolean deleteById(Integer prodId) {
        return this.prodInfoMapper.deleteById(prodId) > 0;
    }
}
*/
