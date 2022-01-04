package cn.ymxdy.pojo;

import lombok.Data;

/**
 * @author wf
 * @date 2021/12/26 19:34
 * @description
 */
@Data
public class Passenger {
    /**
     * 主键id
     */
    private int id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 身份证号
     */
    private String cardId;
    /**
     * 客户来源，1-手机APP用户，2-网站用户，3-门店用户，4-其他
     */
    private int source;
    /**
     * 是否接种新冠疫苗，1-接种，0-未接种,9-未登记
     */
    private int vaccinated;
    /**
     * 48小时内核酸检测结果，1-阳性，0-阴性，9-未检测
     */
    private int necleicAcidResult48;





}
