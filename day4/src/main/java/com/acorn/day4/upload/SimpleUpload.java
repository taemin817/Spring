package com.acorn.day4.upload;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class SimpleUpload {

	String fileDir = "c:\\upload\\"; //물리적인 폴더를 만들어야 함
	
//	업로드 화면
	@GetMapping("/upload")
	public String uploadForm() {
		return "upload-form";
	}
	
//	클라이언트 사진 -> 서버에 사진 저장
	@PostMapping("/upload") //post라 맵핑이름 같아도 괜찮
	public String upload(String goodsCode,MultipartFile file, Model model) throws IllegalStateException, IOException {
		
		if(!file.isEmpty()) {	// 파일을 첨부하지 않고 전송버튼을 누르는 경우를 제외하고 = 파일이 첨부되고 전송버튼을 누르는 경우
			String fileRealName = file.getOriginalFilename();
			String fullPath = fileDir + fileRealName;
			file.transferTo(new File(fullPath)); // "c:\\upload\\" 이 경로 밑에 저장된다 
			model.addAttribute("filename", fileRealName);
		}
		return "upload-ok"; //뷰이름
	}
	@ResponseBody
	@GetMapping( value="/images/{fileName:.*}")	
	public Resource  imageView(@PathVariable String fileName) throws MalformedURLException {
												// 웹 요청의 url경로에서 특정 부분{fileName:.*}을 추출하여 fileName 매개변수로 전달
		return new UrlResource("file:c:\\upload\\"+ fileName);		
	}
}