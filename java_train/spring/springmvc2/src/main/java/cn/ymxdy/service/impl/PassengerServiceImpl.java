package cn.ymxdy.service.impl;

import cn.ymxdy.dao.PassengerDao;
import cn.ymxdy.pojo.Passenger;
import cn.ymxdy.service.PassengerSevice;
import cn.ymxdy.utils.BaseResponse;
import cn.ymxdy.utils.ResponseCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author wf
 * @date 2021/12/30 18:59
 * @description
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class PassengerServiceImpl implements PassengerSevice {

    @Autowired
    private PassengerDao passengerDao;

    @Override
    public BaseResponse findAll() {
        List<Passenger> passengers = passengerDao.selectAll();
        return BaseResponse.successed(ResponseCode.CODE_200010, ResponseCode.CODE_200010_MSG, passengers);
    }

    @Override
    public BaseResponse del(int id) {
        int result = passengerDao.del(id);
        if (result > 0) {
            return BaseResponse.successed(ResponseCode.CODE_200013, ResponseCode.CODE_200013_MSG);
        } else {
            return BaseResponse.failed(ResponseCode.CODE_200003, ResponseCode.CODE_200003_MSG);
        }
    }

    @Override
    public BaseResponse addPass(Passenger passenger) {
        try {
            passengerDao.addPass(passenger);
            return BaseResponse.successed(ResponseCode.CODE_200012, ResponseCode.CODE_200012_MSG);
        } catch (Exception e) {
            return BaseResponse.successed(ResponseCode.CODE_200012, ResponseCode.CODE_200012_MSG);
        }
    }

    @Override
    public BaseResponse updatePass(Passenger passenger) {
        try {
            passengerDao.updatePass(passenger);
            return BaseResponse.successed(ResponseCode.CODE_200011, ResponseCode.CODE_200011_MSG);
        } catch (Exception e) {
            return BaseResponse.successed(ResponseCode.CODE_200001, ResponseCode.CODE_200001_MSG);
        }
    }
    
}
