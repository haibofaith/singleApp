package com.faith.singleapp.service.impl;

import com.faith.singleapp.model.UserInfo;
import com.faith.singleapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author:haibo.xiong
 * @date:2019/1/2
 * @description:
 */
@Service
public class ProductServiceImpl implements ProductService{
    @Qualifier("jdbcProductService")
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<UserInfo> getList() {
        String sql = "select id,name,sex from t_2";
        return (List<UserInfo>) jdbcTemplate.query(sql, new RowMapper<UserInfo>(){

            @Override
            public UserInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
                UserInfo userInfo = new UserInfo();
                userInfo.setId(rs.getInt("id"));
                userInfo.setName(rs.getString("name"));
                userInfo.setSex(rs.getString("sex"));
                return userInfo;
            }
        });
    }
}
