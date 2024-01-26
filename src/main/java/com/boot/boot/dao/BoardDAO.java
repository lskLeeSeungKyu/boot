package com.boot.boot.dao;

import com.boot.boot.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardDAO {
    void writeBoard(BoardDTO boardDTO);

    BoardDTO selectBoard(int boardId);

    List<BoardDTO> selectBoardAll();
}

