package com.idukbaduk.metoo9dan.studyGroup.service;

import com.idukbaduk.metoo9dan.common.entity.GameContents;
import com.idukbaduk.metoo9dan.common.entity.Member;
import com.idukbaduk.metoo9dan.common.entity.StudyGroups;
import com.idukbaduk.metoo9dan.studyGroup.dto.GameContentsListDTO;
import com.idukbaduk.metoo9dan.studyGroup.dto.GroupJoinListDTO;
import com.idukbaduk.metoo9dan.studyGroup.dto.GroupsDetailListDTO;
import com.idukbaduk.metoo9dan.studyGroup.dto.StudyGroupsListDTO;
import com.idukbaduk.metoo9dan.studyGroup.repository.GameContentRepository;
import com.idukbaduk.metoo9dan.studyGroup.repository.GroupRepository;
import com.idukbaduk.metoo9dan.studyGroup.repository.MemberRepository;
import com.idukbaduk.metoo9dan.studyGroup.repository.StudyGroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudyGroupService {
    private final StudyGroupRepository studyGroupRepository;
    private final GroupRepository groupRepository;
    private final GameContentRepository gameContentRepository;
    private final MemberRepository memberRepository;

    //학습그룹 목록 조회
    public List<StudyGroupsListDTO> getList(int member_no) {
        return studyGroupRepository.getGroupList(member_no);
    }

    //학습그룹 상세 조회
    public List<GroupsDetailListDTO> getDetailList(int group_no) {
        return studyGroupRepository.getGroupDetailList(group_no);
    }

    //학습그룹인원 정보 가져오기
    public List<GroupsDetailListDTO> getGroupInfo(int group_no) {
        return studyGroupRepository.getGroupInfo(group_no);
    }

    //학습그룹 등록
    public void add(String group_name, Integer group_size, Date group_start_date, Date group_finish_date, String group_introduce,  GameContents gameContents, Member member) {
        StudyGroups studyGroups = new StudyGroups();
        studyGroups.setGroupName(group_name);
        studyGroups.setGroupSize(group_size);
        studyGroups.setGroupStartDate(group_start_date);
        studyGroups.setGroupFinishDate(group_finish_date);
        studyGroups.setGroupIntroduce(group_introduce);
        studyGroups.setGameContents(gameContents);
        studyGroups.setMember(member);
        //studyGroups.setGameContents(gameContentRepository.findById(game_content_no).orElse(null));
        //studyGroups.setMember(memberRepository.findById(member_no).orElse(null));
        groupRepository.save(studyGroups);
    }

    //게임콘텐츠 리스트
    public List<GameContentsListDTO> getGameList(int member_no) {
        return studyGroupRepository.getGameList(member_no);
    }

    //학습그룹 삭제
    public void delete(StudyGroups studyGroups) {
        groupRepository.delete(studyGroups);
    }

    //학습그룹 가져오기
    public StudyGroups getGruop(int group_no) {
        Optional<StudyGroups> studyGroups = groupRepository.findById(group_no);
        return studyGroups.get();
    }

    //학습그룹 수정하기
    public void modify(StudyGroups studyGroups,String group_name, Integer group_size, Date group_start_date, Date group_finish_date, String group_introduce, Member member) {
        studyGroups.setGroupName(group_name);
        studyGroups.setGroupSize(group_size);
        studyGroups.setGroupStartDate(group_start_date);
        studyGroups.setGroupFinishDate(group_finish_date);
        studyGroups.setGroupIntroduce(group_introduce);
        studyGroups.setMember(member);
        groupRepository.save(studyGroups);
    }

    //학습그룹 가입신청 리스트
    public List<GroupJoinListDTO> getGroupJoinList() {
        return studyGroupRepository.getGroupJoinList();
    }
}
