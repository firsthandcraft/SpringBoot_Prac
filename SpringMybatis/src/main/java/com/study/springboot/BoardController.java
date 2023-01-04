package com.study.springboot;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.study.springboot.model.board.Board;
import com.study.springboot.model.board.BoardService;

@Controller
public class BoardController {

	@Autowired
	private BoardService service;

	@RequestMapping("/board/list")
	public void list(Map<String, ArrayList<Board>> map) {
		ArrayList<Board> list = service.getAll();
		map.put("list", list);
	}

	@GetMapping("/board/write")
	public void writeForm() {
	}

//	@GetMapping("/board/write")
//	public String writeForm() {
//		return "board/write.jsp";
//	}

	@PostMapping("/board/write")
	public String write(Board b) {
		service.addBoard(b);
		return "redirect:/board/list";
	}

	@GetMapping("/board/edit")
	public void editForm(@RequestParam("num") int num, Model model) {
		Board b = service.getById(num);
		model.addAttribute("b", b);
	
	}

	@PostMapping("/board/edit")
	public String edit(Board b) {
		service.editBoard(b);
		return "redirect:/board/list";
	}

    @RequestMapping("/board/del")
    public String delete(@RequestParam("num") int num) {
        service.delBoard(num);
        return "redirect:/board/list";
    }
}
