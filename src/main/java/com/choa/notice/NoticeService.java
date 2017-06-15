package com.choa.notice;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.choa.util.MakePage;
import com.choa.util.PageMaker;
import com.choa.util.RowMaker;

@Service
//NoticeService noticeService = new NoticeService();
public class NoticeService {
	
	@Inject //type으로 찾아라
	private NoticeDAO noticeDAO;
	
	//1.생성자 이용방식(Constructor)
	public NoticeService(NoticeDAO noticeDAO){
		this.noticeDAO = noticeDAO;
	}
	
/*	//2.setter
	public void setNoticeDAO(NoticeDAO noticeDAO) {
		this.noticeDAO = noticeDAO;
	}
	*/
	//view
	public NoticeDTO noticeView(int num) throws Exception{
		//NoticeDAO noticeDAO = new NoticeDAO();
		//이미 root-context 에서 선언 해줬으므로 안해줘도 됨
		//만약 하려고 한다고 해도 datasource 가져올 때
		//ctrl+spacebar 눌러도 안나옴
		return noticeDAO.noticeView(num);
	}

	//list
	public List<NoticeDTO> noticeList(int curPage) throws Exception{
		int result = noticeDAO.noticeCount();
		PageMaker pageMaker = new PageMaker(curPage);
		MakePage makePage = pageMaker.getMakePage(result);
		//한 번 쓰고 말 것은 여기 만들고, 다른 메서드에서 반복해서 쓸 것들은
		//지역변수 선언해야 함
		return noticeDAO.noticeList(pageMaker.getRowMaker());
	}
	
	//write
	public int noticeWrite(NoticeDTO noticeDTO) throws Exception{
		return noticeDAO.noticeWrite(noticeDTO);
	}
	
	//update
	public int noticeUpdate(NoticeDTO noticeDTO) throws Exception{
		return noticeDAO.noticeUpdate(noticeDTO);
	}
	
	//delete
	public int noticeDelete(int num) throws Exception{
		return noticeDAO.noticeDelete(num);
	}

}
