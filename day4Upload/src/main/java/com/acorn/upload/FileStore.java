package com.acorn.upload;
 
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class FileStore {

    private String fileDir="c:\\test\\upload\\";
    
    //전체경로 얻어오기
    public String getFullPath(String filename) {
        return fileDir + filename;
    }

    //List<MultipartFile>  =>  List<UploadFile> 
    public List<UploadFile> storeFiles(List<MultipartFile> multipartFiles) throws IOException {
        List<UploadFile> storeFileResult = new ArrayList<UploadFile>();
        for (MultipartFile multipartFile : multipartFiles) {
            if (!multipartFile.isEmpty()) {	// multipartFile이 비어있지않으면
                storeFileResult.add(storeFile(multipartFile));	//  계속 추가
            }
        }
        return storeFileResult;
    }
    
    private String extractExt(String originalFilename) {
    	int pos = originalFilename.lastIndexOf(".");	// 문자열 내에서 특정 문자 또는 부분 문자열의 마지막 발생 위치(인덱스)를 찾고
    	return originalFilename.substring(pos + 1);		// +1은 substring 메서드의 시작 인덱스를 나타내며, 그 인덱스 이후부터 문자열을 추출하기 위해 사용
    }
    
    // 새로운 파일 이름 생성
    private String createStoreFileName(String originalFilename) {
    	String ext = extractExt(originalFilename);
    	String uuid = UUID.randomUUID().toString();
    	return uuid + "." + ext;
    }

    public UploadFile storeFile(MultipartFile multipartFile) throws IOException {      
        String originalFilename = multipartFile.getOriginalFilename();
        String storeFileName = createStoreFileName(originalFilename);
        multipartFile.transferTo(new File(getFullPath(storeFileName)));	// transferTo로 새로운 경로에 저장시킴
        return new UploadFile(originalFilename, storeFileName);
    }


}
