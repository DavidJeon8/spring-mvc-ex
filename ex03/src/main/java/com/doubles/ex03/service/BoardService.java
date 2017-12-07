package com.doubles.ex03.service;

import com.doubles.ex03.domain.BoardVO;

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

    // 목록 : 기본
    public List<BoardVO> list() throws Exception;

    // 목록 : 페이징

    // 목록 : 페이징 + 검색

}