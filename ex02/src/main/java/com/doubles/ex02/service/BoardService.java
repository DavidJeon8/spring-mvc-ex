package com.doubles.ex02.service;

import com.doubles.ex02.domain.BoardVO;
import com.doubles.ex02.domain.Criteria;
import com.doubles.ex02.domain.SearchCriteria;

import java.util.List;

public interface BoardService {

    // 입력
    public void register(BoardVO boardVO) throws Exception;

    // 조회
    public BoardVO read(Integer bno) throws Exception;

    // 수정
    public void modify(BoardVO boardVO) throws Exception;

    // 삭제
    public void remove(Integer bno) throws Exception;

    // 목록
    public List<BoardVO> list() throws Exception;

    // 목록 페이징 1
    public List<BoardVO> list(int page) throws Exception;

    // 목록 페이징 2
    public List<BoardVO> list(Criteria criteria) throws Exception;

    // 목록 페이징 + 검색옵션, 키워드
    public List<BoardVO> list(SearchCriteria criteria) throws Exception;

    // 게시글 전체 갯수
    public int listCount(Criteria criteria) throws Exception;

    // 검색처리된 게시글의 갯수
    public int listCount(SearchCriteria criteria) throws Exception;
}
