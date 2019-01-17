package com.at.leisure.sqlSession;

public interface Excutor {
    public <T> T query(String statement,Object parameter);
}
