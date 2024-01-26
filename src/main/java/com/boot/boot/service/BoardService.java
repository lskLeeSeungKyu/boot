package com.boot.boot.service;

import com.boot.boot.dao.BoardDAO;
import com.boot.boot.dto.BoardDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardDAO boardDAO;

    @Transactional
    public Map<String, String> writeBoard(BoardDTO boardDTO) {
        Map<String, String> map = new HashMap<>();

        boardDAO.writeBoard(boardDTO);
        map.put("result", "success");
        return map;
    }

    @Transactional(readOnly = true)
    public BoardDTO selectBoard(int boardId) {
        return boardDAO.selectBoard(boardId);
    }

    @Transactional(readOnly = true)
    public List<BoardDTO> selectBoardAll() {
        return boardDAO.selectBoardAll();
    }
}
