package com.wyk.generator.mapper;

import com.wyk.generator.domain.CaptureAppVersion;

public interface CaptureAppVersionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CaptureAppVersion record);

    int insertSelective(CaptureAppVersion record);

    CaptureAppVersion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CaptureAppVersion record);

    int updateByPrimaryKey(CaptureAppVersion record);
}