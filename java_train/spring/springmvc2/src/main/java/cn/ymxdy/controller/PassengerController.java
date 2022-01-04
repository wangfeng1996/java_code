package cn.ymxdy.controller;

import cn.ymxdy.pojo.Passenger;
import cn.ymxdy.service.PassengerSevice;
import cn.ymxdy.utils.BaseResponse;
import cn.ymxdy.utils.ResponseCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author wf
 * @date 2021/12/30 18:49
 * @description
 */
@RestController
@RequestMapping("/passenger")
public class PassengerController {

    @Autowired
    private PassengerSevice passengerSevice;

    /**
     * 查询
     *
     * @return
     */
    @GetMapping("/all")
    public BaseResponse findAllPass() {
        BaseResponse result = passengerSevice.findAll();
        return result;
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public BaseResponse delById(@PathVariable int id) {
        BaseResponse result = passengerSevice.del(id);
        return result;
    }

    /**
     * 添加
     *
     * @param passenger
     * @return
     */
    @PostMapping("/add")
    public BaseResponse add(@RequestBody Passenger passenger) {
        String cardId = passenger.getCardId();
        String pattern = "(^\\d{15}$)|(^\\d{18}$)|(^\\d{17}(\\d|X|x)$)";
        Pattern compile = Pattern.compile(pattern);
        Matcher matcher = compile.matcher(cardId);
        if (!matcher.matches()) {
            return BaseResponse.failed(ResponseCode.CODE_300010, ResponseCode.CODE_300010_MSG);
        } else if (passenger.getVaccinated() == 0) {
            return BaseResponse.failed(ResponseCode.CODE_300011, ResponseCode.CODE_300011_MSG);
        } else if (passenger.getNecleicAcidResult48() == 0) {
            return BaseResponse.failed(ResponseCode.CODE_300012, ResponseCode.CODE_300012_MSG);
        } else {
            return passengerSevice.addPass(passenger);
        }
    }


    @PutMapping("/update")
    public BaseResponse updatePass(@RequestBody Passenger passenger) {
        String cardId = passenger.getCardId();
        String pattern = "(^\\d{15}$)|(^\\d{18}$)|(^\\d{17}(\\d|X|x)$)";
        Pattern compile = Pattern.compile(pattern);
        Matcher matcher = compile.matcher(cardId);
        if (!matcher.matches()) {
            return BaseResponse.failed(ResponseCode.CODE_300010, ResponseCode.CODE_300010_MSG);
        } else if (passenger.getVaccinated() == 0) {
            return BaseResponse.failed(ResponseCode.CODE_300011, ResponseCode.CODE_300011_MSG);
        } else if (passenger.getNecleicAcidResult48() == 0) {
            return BaseResponse.failed(ResponseCode.CODE_300012, ResponseCode.CODE_300012_MSG);
        } else {
            return passengerSevice.updatePass(passenger);
        }
    }
}
