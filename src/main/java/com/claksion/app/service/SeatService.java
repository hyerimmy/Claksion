package com.claksion.app.service;

import com.claksion.app.data.dto.request.UpdateSeatUserRequest;
import com.claksion.app.data.dto.response.GetSeatAndUserResponse;
import com.claksion.app.data.entity.SeatEntity;
import com.claksion.app.frame.BaseService;
import com.claksion.app.repository.SeatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.oxm.ValidationFailureException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SeatService implements BaseService<Integer, SeatEntity> {

    final SeatRepository seatRepository;

    @Override
    public int add(SeatEntity seatEntity) throws Exception {
        return seatRepository.insert(seatEntity);
    }

    @Override
    public int del(Integer integer) throws Exception {
        return seatRepository.delete(integer);
    }

    @Override
    public int modify(SeatEntity seatEntity) throws Exception {
        return seatRepository.update(seatEntity);
    }

    @Override
    public SeatEntity get(Integer integer) throws Exception {
        return seatRepository.selectOne(integer);
    }

    @Override
    public List<SeatEntity> get() throws Exception {
        return seatRepository.select();
    }

    public boolean deleteByClassroomId(Integer classroomId) throws Exception {
        seatRepository.deleteByClassroomId(classroomId);
        return true;
    }

    public List<SeatEntity> getByClassroomId(Integer classroomId) throws Exception {
        return seatRepository.selectByClassroomId(classroomId);
    }

    public List<GetSeatAndUserResponse> getSeatAndUserByClassroomId(Integer classroomId) throws Exception {
        return seatRepository.selectSeatAndUserByClassroomId(classroomId);
    }

    public void setUserOnEmptySeat(UpdateSeatUserRequest request) throws ValidationFailureException {
        // 이미 선택된 좌석이 있다면 에러 처리
        boolean existUserId = seatRepository.existUserId(request.getSeatId());
        if(existUserId){
            throw new ValidationFailureException("NOT_AVAILABLE_SEAT");
        }

        // 좌석에 주인으로 지정
        seatRepository.updateUserId(request);
    }

    public boolean existSeatByUserId(Integer userId) throws Exception {
        return seatRepository.getCountByUserId(userId) > 0;
    }
}
