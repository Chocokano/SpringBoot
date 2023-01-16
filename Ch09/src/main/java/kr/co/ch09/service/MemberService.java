package kr.co.ch09.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ch09.dao.MemberRepo;
import kr.co.ch09.vo.MemberVO;

@Service
public class MemberService {

	@Autowired
	private MemberRepo repo;
	
	public void insertMember(MemberVO vo) {
		repo.save(vo);
	}
	public void selectMember() {}
	public void selectMembers() {}
	public void updateMember() {}
	public void deleteMember() {}
}
