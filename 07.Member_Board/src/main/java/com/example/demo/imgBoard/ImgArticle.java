package com.example.demo.imgBoard;

import java.util.ArrayList;

import org.springframework.web.multipart.MultipartFile;

import com.example.demo.reply.Reply;

import lombok.Data;
@Data
public class ImgArticle {
	private int num;
	private String path;
	private String writer_id;
	private String title;
	private MultipartFile file;
	private ArrayList<Reply> reps;
}
