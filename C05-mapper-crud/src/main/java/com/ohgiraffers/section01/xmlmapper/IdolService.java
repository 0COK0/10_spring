package com.ohgiraffers.section01.xmlmapper;


import com.ohgiraffers.common.IdolDTO;
import com.ohgiraffers.common.SearchCriteria;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.common.Template.getSqlSession;

public class IdolService {

    private IdolMapper mapper;


    public void selectResultAllMap() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(IdolMapper.class);

        List<IdolDTO> idolList = mapper.selectResultAllMap();

        for (IdolDTO idol : idolList) {
            System.out.println(idol);
        }

        sqlSession.close();

    }


    public void searchIdolBySuqGroup(SearchCriteria searchCriteria) {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(IdolMapper.class);

        List<IdolDTO> idolList = mapper.searchIdolBySuqGroup(searchCriteria);

        if (idolList != null && idolList.size() > 0) {
            for (IdolDTO idol : idolList) {
                System.out.println(idol);
            }
        } else {
            System.out.println("검색 결과가 존재하지 않습니다.");
        }
        sqlSession.close();
    }
}
