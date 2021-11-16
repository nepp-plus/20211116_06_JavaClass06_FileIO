package codes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainDrive {
	
	public static void main(String[] args) {
		
		
		writeToFile();
		
	}
	
	static void writeToFile() {
		
//		파일 SAVE (Output) 실습
		
//		1. 어디에 파일을 저장할지? 경로 설정.
		
		File myFile = new File("mytest.txt");
		
//		2. 파일 작성 클래스 활용. => 위험소지 : try / catch로 엮어서 사용.
		
		try {
			
//			한 글자를 2byte 다룬다. -> 한번에 한글자씩만 처리함.
			FileWriter fw = new FileWriter(myFile);
			
//			"안녕하세요" 문장을 통째로 다루게 도와주는 클래스 사용.
			
			BufferedWriter bw = new BufferedWriter(fw);
			
			
//			실제 문장 기록 : bw를 이용하자.
			bw.append("안녕하세요.");
			
//			파일은 다 쓰면 닫아주자. (다른곳에서도 사용 가능하게)
			
			bw.close();
			fw.close();
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}





