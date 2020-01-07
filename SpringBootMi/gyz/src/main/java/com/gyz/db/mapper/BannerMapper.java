package com.gyz.db.mapper;

import com.gyz.db.pojo.Banner;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

// 这个注解表示了这是一个mybatis的mapper类
//@Mapper
//@Repository
public interface BannerMapper {

    List<Banner> queryBannerList();

    Map queryShopDetail(int id);


}
