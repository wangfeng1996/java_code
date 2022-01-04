package cn.ymxdy.dao;

import cn.ymxdy.pojo.Passenger;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author wf
 * @date 2021/12/30 19:01
 * @description
 */
@Mapper
public interface PassengerDao {

    /**
     * 查询所有的数据
     *
     * @return
     */
    List<Passenger> selectAll();

    /**
     * 根据id删除用户的信息
     *
     * @param id
     * @return
     */
    int del(@Param("id") int id);

    /**
     * 添加数据信息
     *
     * @param passenger
     * @return
     */
    int addPass(Passenger passenger);

    int updatePass(Passenger passenger);
}
