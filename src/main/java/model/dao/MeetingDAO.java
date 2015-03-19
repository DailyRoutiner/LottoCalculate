package model.dao;

import java.util.List;

import model.domain.MeetingDTO;

public interface MeetingDAO {

	int insertMeeting(MeetingDTO meetingDTO);

	List<MeetingDTO> meetingList(int memno);
	
    MeetingDTO selectMeetNo(MeetingDTO md);
	
	int deleteMeeting(MeetingDTO md);

	MeetingDTO meetSelectNum(int meetno);
}
