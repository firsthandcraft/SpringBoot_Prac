package com.example.demo.down;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DownService {
	private DownMapper mapper;
	public void uploadFile(DownFile f) {
		mapper.addFile(f);
	}
	public DownFile getFile(int num) {
		return mapper.getFile(num);
	}
	public List getFiles() {
		return mapper.getAll();
	}
	public void ediotFileInfo(DownFile f) {
		mapper.editFile(f);
	}
	public void editHit(int num) {
		mapper.editHit(num);
	}
	
}
