package cn.ymxdy.service;

import cn.ymxdy.pojo.Passenger;
import cn.ymxdy.utils.BaseResponse;

/**
 * @author wf
 * @date 2021/12/30 18:59
 * @description
 */

public interface PassengerSevice {
    /**
     * 查询所有的值
     *
     * @return 返回所有的结果
     */
    BaseResponse findAll();


    /**
     * 根据id进行删除信息
     *
     * @param id
     * @return
     */
    BaseResponse del(int id);

    /**
     * 添加信息
     *
     * @param passenger
     * @return
     */
    BaseResponse addPass(Passenger passenger);

    /**
     * 修改参数信息
     *
     * @param passenger
     * @return
     */
    BaseResponse updatePass(Passenger passenger);
}
