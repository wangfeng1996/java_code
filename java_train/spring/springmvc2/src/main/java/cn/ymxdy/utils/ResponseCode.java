package cn.ymxdy.utils;

/**
 * @author wf
 * @date 2021/12/30 18:55
 * @description
 */
public class ResponseCode {

    /**
     * 查询
     */
    public static final Integer CODE_200010 = 200010;
    public static final String CODE_200010_MSG = "查询数据成功！";
    /**
     * 修改
     */
    public static final Integer CODE_200011 = 200011;
    public static final String CODE_200011_MSG = "修改数据成功！";

    public static final Integer CODE_200001 = 200001;
    public static final String CODE_200001_MSG = "修改数据失败！";

    /**
     * 添加
     */
    public static final Integer CODE_200012 = 200012;
    public static final String CODE_200012_MSG = "添加数据成功！";

    public static final Integer CODE_200002 = 200002;
    public static final String CODE_200002_MSG = "添加数据失败！";

    /**
     * 删除
     */
    public static final Integer CODE_200013 = 200013;
    public static final String CODE_200013_MSG = "删除数据成功！";

    public static final Integer CODE_200003 = 200003;
    public static final String CODE_200003_MSG = "删除数据失败！";

    /**
     * 身份证验证
     */

    public static final Integer CODE_300010 = 300010;
    public static final String CODE_300010_MSG = "身份证输入错误,请输入正确的身份证信息！";

    /**
     * 当用户末填写是否接种新冠疫苗项时，提醒用户：请确认您的疫茧接种状态
     */
    public static final Integer CODE_300011 = 300011;
    public static final String CODE_300011_MSG = "请确认您的疫茧接种状态";

    /**
     * 当用户末填写48小时内核酸检测结果时，提醒用户：请确认您48小时内的核酸检测结果
     */
    public static final Integer CODE_300012 = 300012;
    public static final String CODE_300012_MSG = "请确认您48小时内的核酸检测结果";


    public static final Integer CODE_300013 = 300013;
    public static final String CODE_300013_MSG = "参数异常";

    public static final Integer CODE_300070 = 300070;
    public static final String CODE_300070_MSG = "当前用户未配置权限，无法登录！请联系管理员！";

    ///**
    // * 缺少必要参数！
    // */
    //public static final Integer CODE_200010 = 200010;
    //public static final String CODE_200010_MSG = "缺少必要参数！";
    ///**
    // * 无效的操作！请检查参数信息是否正确！
    // */
    //public static final Integer CODE_200020 = 200020;
    //public static final String CODE_200020_MSG = "无效的操作！请检查参数信息是否正确！";
    //
    ///**
    // * 添加或修改的对象已存在！
    // */
    //public static final Integer CODE_200030 = 200030;
    //public static final String CODE_200030_MSG = "添加或修改的对象已存在！";
    ///**
    // * 添加或修改失败！请重新尝试或联系管理员！
    // */
    //public static final Integer CODE_200040 = 200040;
    //public static final String CODE_200040_MSG = "添加或修改失败！请重新尝试或联系管理员！";
    ///**
    // * 导出失败！请重新尝试或联系管理员！
    // */
    //public static final Integer CODE_200050 = 200050;
    //public static final String CODE_200050_MSG = "导出失败！请重新尝试或联系管理员！";
    //
    ///**
    // * 用户名不存在
    // */
    //public static final Integer CODE_300010 = 300010;
    //public static final String CODE_300010_MSG = "当前机构用户不存在！";
    ///**
    // * 用户名或密码错误！
    // */
    //public static final Integer CODE_300020 = 300020;
    //public static final String CODE_300020_MSG = "用户名或密码错误！";
    ///**
    // * 该用户被冻结或关闭，无法登陆！请联系管理员！
    // */
    //public static final Integer CODE_300030 = 300030;
    //public static final String CODE_300030_MSG = "该用户被冻结或关闭，无法登陆！请联系管理员！";
    ///**
    // * 同一账号不可重复登录！
    // */
    //public static final Integer CODE_300040 = 300040;
    //public static final String CODE_300040_MSG = "同一账号不可重复登录！";
    ///**
    // * 获取当前用户信息失败！缓存失效或用户已退出登录！
    // */
    //public static final Integer CODE_300050 = 300050;
    //public static final String CODE_300050_MSG = "获取当前用户信息失败！缓存失效或用户已退出登录！";
    ///**
    // * 当前系统没有账号登录，退出异常！
    // */
    //public static final Integer CODE_300060 = 300060;
    //public static final String CODE_300060_MSG = "当前系统没有账号登录，退出异常！";
    ///**
    // * 当前用户未配置权限，无法登录！请联系管理员！
    // */
    //public static final Integer CODE_300070 = 300070;
    //public static final String CODE_300070_MSG = "当前用户未配置权限，无法登录！请联系管理员！";

}
