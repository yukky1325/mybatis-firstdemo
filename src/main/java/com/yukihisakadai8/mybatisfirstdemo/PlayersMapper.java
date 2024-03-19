package com.yukihisakadai8.mybatisfirstdemo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PlayersMapper {

    @Select("SELECT * FROM players")
    List<Player> findAll();
}
