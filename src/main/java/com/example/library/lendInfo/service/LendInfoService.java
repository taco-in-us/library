package com.example.library.lendInfo.service;

import com.example.library.lendInfo.model.LendInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class LendInfoService {

    @Autowired
    private CheckoutRepository checkoutRepository;

    public LendInfo createLendInfo(LendInfo lendInfo) {
        lendInfo.setLendDate(LocalDateTime.now());
        lendInfo.setDueDate(LocalDateTime.now().plusDays(14)); //??
        return checkoutRepository.save(lendInfo);
    }

    //필요? or private?
    public LendInfo getLendInfoByBookId(String bookId) {
        return checkoutRepository.findByBookId(bookId);
    }

    public List<LendInfo> getLendInfoByUserId(String userId) {
        return checkoutRepository.findByUserId(userId);
    }

    public List<LendInfo> getAllLendInfo() {
        return checkoutRepository.findAll();
    }

    public LendInfo updateLendInfo(String bookId, LocalDateTime localDateTime) {
        LendInfo lendInfo = getLendInfoByBookId(bookId);
        lendInfo.setReturnDate(localDateTime);
        return checkoutRepository.save(lendInfo);
    }
}
