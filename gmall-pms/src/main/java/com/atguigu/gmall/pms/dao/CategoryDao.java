package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Young
 * @email Young@atguigu.com
 * @date 2020-06-08 21:32:32
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
