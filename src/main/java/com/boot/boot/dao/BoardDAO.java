package com.boot.boot.dao;

import com.boot.boot.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface BoardDAO {
    void writeBoard(BoardDTO boardDTO);

    void deleteBoard(Map<String,Integer> map);

    BoardDTO selectBoard(int boardId);

    List<BoardDTO> selectBoardAll();
}

