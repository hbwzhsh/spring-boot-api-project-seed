package com.company.project.service;


import com.company.project.model.WeatherResponse;

/**
 * 天气数据服务.
 * 
 */
public interface WeatherDataService {

	/**
	 * 根据城市ID查询天气数据
	 * @param cityId
	 * @return
	 */
	WeatherResponse getDataByCityId(String cityId);
	
	/**
	 * 根据城市名称查询天气数据
	 * @param cityId
	 * @return
	 */
	WeatherResponse getDataByCityName(String cityName);
}
