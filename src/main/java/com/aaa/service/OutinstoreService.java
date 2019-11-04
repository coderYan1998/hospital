package com.aaa.service;

import com.aaa.entity.Baoque;
import com.aaa.entity.Drugstore;
import com.aaa.entity.Ypharmacy;

import java.util.List;

public interface OutinstoreService {
    //查询报缺单
    List<Baoque> selbaoquedan(Baoque baoque);
    //根据补给单的名字查询对应的仓库药品
    List<Drugstore>selbaoquedrugname(Drugstore drugstore);
    //减去库存数量
    int updatedrugnumber(Drugstore drugstore);
    //减去报缺表
    int upbaoquenumber(Drugstore drugstore);
    //库房减去的=加上药房数量
    int uppharmacynumber(Drugstore drugstore);
    //查询库房给出补给时的数量=这条药品的最大数量
    int seldrugnamenum(Drugstore drugstore);
    //查询库房给出补给时的数量=这条药品的最大数量  仓库这批药品全部出库 删除这条
    int deldrugnamenum(Drugstore drugstore);
    //查询报缺表的数据是否有补给完毕的
    int selbaoquenamenum(Drugstore drugstore);
    //删除报缺数为小于1 的数据
    int delbaoquenamenum();
    //直接出库添加药品表数据
    int addpharmacy(Ypharmacy ypharmacy);
    //出库药品前查询药品是否已存在
    int selpharymacyname(Ypharmacy ypharmacy);
    //已经存在则修改则添加数量
    int uppharymacy(Ypharmacy ypharmacy);
    //查询报缺表一共有几条数据
    int selbaoquecount();
}