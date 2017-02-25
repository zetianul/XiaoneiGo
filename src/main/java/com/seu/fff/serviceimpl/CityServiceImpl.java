package com.seu.fff.serviceimpl;

import com.seu.fff.dao.CityMapper;
import com.seu.fff.pojo.City;
import com.seu.fff.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 城市业务逻辑实现类
 *
 *
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityMapper cityMapper;

    public List<City> findAllCity(){
        return cityMapper.findAllCity();
    }

    public City findCityById(Long id) {
        return cityMapper.findById(id);
    }

    @Override
    public Long saveCity(City city) {
        return cityMapper.saveCity(city);
    }

    @Override
    public Long updateCity(City city) {
        return cityMapper.updateCity(city);
    }

    @Override
    public Long deleteCity(Long id) {
        return cityMapper.deleteCity(id);
    }

}
