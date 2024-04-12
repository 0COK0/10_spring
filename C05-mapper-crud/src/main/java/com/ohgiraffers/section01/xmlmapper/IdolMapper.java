package com.ohgiraffers.section01.xmlmapper;


import com.ohgiraffers.common.IdolDTO;
import com.ohgiraffers.common.SearchCriteria;

import java.util.List;

public interface IdolMapper {


    List<IdolDTO> selectResultAllMap();

    List<IdolDTO> searchIdolBySuqGroup(SearchCriteria searchCriteria);
}
