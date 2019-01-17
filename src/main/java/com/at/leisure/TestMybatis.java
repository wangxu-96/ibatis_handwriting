package com.at.leisure;

import com.at.leisure.bean.User;
import com.at.leisure.mapper.UserMapper;
import com.at.leisure.sqlSession.MySqlsession;

public class TestMybatis {

    public static void main(String[] args) {
        MySqlsession sqlsession=new MySqlsession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);
        User user = mapper.getUserById("1");
        System.out.println(user);
    }
}
