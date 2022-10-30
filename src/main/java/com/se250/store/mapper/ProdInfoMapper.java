package com.se250.store.mapper;

import com.se250.store.entity.ProdInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (ProdInfo)表数据库访问层
 *
 * @author makejava
 * @since 2022-10-25 18:59:30
 */
@Mapper
public interface ProdInfoMapper {

    List<ProdInfo> lists();

    /**
     * 通过ID查询单条数据
     *
     * @param prodId 主键
     * @return 实例对象
     */
    ProdInfo queryById(Integer prodId);

    /**
     * 查询指定行数据
     *
     * @param prodInfo 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<ProdInfo> queryAllByLimit(ProdInfo prodInfo, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param prodInfo 查询条件
     * @return 总行数
     */
    long count(ProdInfo prodInfo);

    /**
     * 新增数据
     *
     * @param prodInfo 实例对象
     * @return 影响行数
     */
    int insert(ProdInfo prodInfo);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<ProdInfo> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<ProdInfo> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<ProdInfo> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<ProdInfo> entities);

    /**
     * 修改数据
     *
     * @param prodInfo 实例对象
     * @return 影响行数
     */
    int update(ProdInfo prodInfo);

    /**
     * 通过主键删除数据
     *
     * @param prodId 主键
     * @return 影响行数
     */
    int deleteById(Integer prodId);

}

