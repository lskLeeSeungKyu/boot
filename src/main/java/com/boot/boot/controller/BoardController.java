package com.boot.boot.controller;

import com.boot.boot.dto.BoardDTO;
import com.boot.boot.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/selectBoard")
    public BoardDTO selectBoard(@RequestParam int boardId) {
        return boardService.selectBoard(boardId);
    }

    @GetMapping("/selectBoardAll")
    public List<BoardDTO> selectBoardAll() {
        return boardService.selectBoardAll();
    }

    @PostMapping("/writeBoard")
    public Map<String, String> writeBoard(BoardDTO boardDTO) {
        return boardService.writeBoard(boardDTO);
    }
}
