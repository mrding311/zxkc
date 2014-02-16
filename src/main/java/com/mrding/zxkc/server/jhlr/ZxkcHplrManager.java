package com.mrding.zxkc.server.jhlr;

import java.sql.SQLException;
import java.util.*;

import com.mrding.common.CommonUtils;
import com.mrding.zxkc.dao.jhlr.ZxkcHplrDao;
import com.mrding.zxkc.model.ZxkcYwHpxx;
import com.mrding.zxkc.vo.jhlr.ZxkcHplrVo.ZxkcHplrVo;

public class ZxkcHplrManager {
    
    ZxkcHplrDao dao = new ZxkcHplrDao();

    /**
     * 查询所有货品信息
     * @return
     */
    public List<ZxkcYwHpxx> listHpxx() {
	return dao.listHpxx();
    }

    /**
     * 添加货品
     * @param model
     * @throws SQLException 
     */
    public void addHp(ZxkcHplrVo model) throws SQLException {
	dao.save(model);
    }

    /**
     * 删除货品
     * @param ukey
     * @throws SQLException 
     */
    public void deleteHp(String ukey) throws SQLException {
	dao.deleteByPk(ukey);
    }

    /**
     * 根据货品名称模糊查询
     * @param hpmc
     * @return
     */
    public List<ZxkcYwHpxx> queryHpxxByMc(String hpmc) {
	if (CommonUtils.strIsNotBlank(hpmc)) {
            return dao.queryHpxxByMc(hpmc);
	} else {
	    return dao.listHpxx();
	}
    }

}
