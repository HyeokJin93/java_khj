package kr.green.green.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kr.green.green.dao.BoardDAO;
import kr.green.green.utils.UploadFileUtils;
import kr.green.green.vo.BoardVO;
import kr.green.green.vo.FileVO;
import kr.green.green.vo.MemberVO;

	

@Service
public class BoardServiceImp implements BoardService{
	
	@Autowired
	BoardDAO boardDao;

	String uploadPath = "C:\\JAVA\\upload";
	
	@Override
	public List<BoardVO> getBoardList(String bd_type) {
		return boardDao.selectBoardList(bd_type);
	}

	@Override
	public BoardVO getBoard(Integer bd_num) {
		if(bd_num == null || bd_num <= 0)
			return null;
		return boardDao.selectBoard(bd_num);
	}

	@Override
	public void registerBoard(BoardVO board, MemberVO user, List<MultipartFile> files) {
		// 흐름 상 없어도 되지만 서비스임플 입장에서는 모를 수 있기 때문에 적어줌.
		if(board == null || user == null)
			return;
		
		if(board.getBd_title() == null || board.getBd_title().trim().length() == 0)
			return;
		if(user.getMe_id() == null || user.getMe_id().trim().length() == 0)
			return;
		board.setBd_me_id(user.getMe_id());
		boardDao.insertBoard(board);
		
		uploadFile(files, board.getBd_num());
	}

	@Override
	public void modifyBoard(BoardVO board, MemberVO user, List<MultipartFile> files2, Integer[] fileNums) {
		if(board == null || user == null
				|| board.getBd_num()<=0)
			return;
		
		BoardVO dbBoard = boardDao.selectBoard(board.getBd_num());
		
		if(dbBoard == null)
			return;
		
		if(!dbBoard.getBd_me_id().equals(user.getMe_id()))
			return;
		
		boardDao.updateBoard(board);
		
		// 첨부파일을 삭제(수정화면에서 x버튼 눌러서 취소한 파일들)
		// 게시글의 첨부파일들을 가져옴
		List<FileVO> fileList = boardDao.selectFileList(board.getBd_num());
		List<FileVO> remainFileList = new ArrayList<FileVO>();
		// 가져온 첨부파일들 중에서 fileNums와 일치하는 번호가 있으면 remainFileList에 추가
		// 유지해야할 첨부파일이 있는 경우
		if(fileNums != null && fileNums.length != 0) {
			for(FileVO tmp : fileList) {
				for(Integer tmpNum : fileNums) {
					if(tmp.getFi_num() == tmpNum) {
						remainFileList.add(tmp);
					}
				}
			}
			// 게시글의 전체 첨부파일 중 유지해야할 첨부파일을 제외한 첨부파일 만듦
			fileList.removeAll(remainFileList);
		}
		// 실제 서버에서 삭제 후 DB에서 삭제 처리
		if(fileList != null && fileList.size() != 0) {
			for(FileVO tmp : fileList) {
				String fileName = tmp.getFi_name().replace("/", File.separator);
				File file = new File(uploadPath + fileName);
				boardDao.deleteFile(tmp);
				if(file.exists()) {
					file.delete();
					
				}
			}
		}
		// 새로 추가한 첨부파일을 업로드
		uploadFile(files2, board.getBd_num());
	}

	@Override
	public void deleteBoard(MemberVO user, Integer bd_num) {
		if(bd_num == null || bd_num <= 0)
			return;
		BoardVO board = boardDao.selectBoard(bd_num);
		if(board == null)
			return;
		if(user == null || !board.getBd_me_id().equals(user.getMe_id()))
			return;
		boardDao.deleteBoard(bd_num);
	}

	@Override
	public List<FileVO> getFileList(Integer bd_num) {
		if(bd_num == null || bd_num <= 0) 
			return null;
		return boardDao.selectFileList(bd_num);
		
	}
		

	private void  uploadFile(List<MultipartFile> files, int bd_num) {
		if(files == null || files.size() == 0)
			return;
		for(MultipartFile tmpFile : files) {
			if(tmpFile != null && tmpFile.getOriginalFilename().length() != 0) {
				try {
					String path = UploadFileUtils.uploadFile(
							uploadPath, 
							tmpFile.getOriginalFilename(), 
							tmpFile.getBytes());
					FileVO file = new FileVO(tmpFile.getOriginalFilename(),path,bd_num);
					boardDao.insertFile(file);
				} catch (IOException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	private void deleteFile() {
		
	}

}
