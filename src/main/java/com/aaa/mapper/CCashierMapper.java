package com.aaa.mapper;

import com.aaa.entity.CCashier;
import com.aaa.entity.CPharmacy;
import com.aaa.entity.CWarehuose;
import com.aaa.entity.ReportVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CCashierMapper {
    //查询挂号的所有信息用于页面表格展示
    List<ReportVo> sel();
    //查询所有药房
    List<CWarehuose> selware();
    //根据药房查询所有药品信息在药品详情框中展示
    List<CPharmacy> selpharm();
    //查询这个用户的处方表上有没有这个药
    Integer selcadr(CCashier cCashier);
    //添加处方药品
    Integer addchu(CCashier cCashier);
    //查询该用户的处方
    List<CCashier> selpepi(Integer perid);
    //删除处方中的药品
    Integer del(CCashier cCashier);
    //减少药房中的数量
    Integer deldrunum(CPharmacy cPharmacy);
}