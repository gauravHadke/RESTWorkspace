package com.example.comtrolelr;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.response.FileUploadResponse;

@RestController
public class FileUploadController {
	@PostMapping("/uploadFile")
	public ResponseEntity<FileUploadResponse> uploadFile(@RequestParam("file") MultipartFile multipartFile) throws IOException
	{
		// String fileName = org.springframework.util.StringUtils.cleanPath(multipartFile.getOriginalFilename());
		 String fileName = multipartFile.getOriginalFilename();
		 long size = multipartFile.getSize();
		 
		 FileUploadUtil.saveFile(fileName, multipartFile);
		 
		 FileUploadResponse fur=new FileUploadResponse();
		 fur.setFileName(fileName);
		 fur.setSize(size);
		 fur.setDownloadUri("/downloadFile");
		 
		 return new ResponseEntity<>(fur,HttpStatus.OK);
	}
}
