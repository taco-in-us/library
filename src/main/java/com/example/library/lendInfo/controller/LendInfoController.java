package com.example.library.lendInfo.controller;

import com.example.library.lendInfo.model.LendInfo;
import com.example.library.lendInfo.service.LendInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/checkout")
public class LendInfoController {

    @Autowired
    private LendInfoService lendInfoService;

    @PostMapping("/lend")
    public LendInfo createLendInfo(@RequestBody LendInfo lendInfo) {
        return lendInfoService.createLendInfo(lendInfo);
    }

    @GetMapping("/{bookId}")
    public LendInfo getLendInfoByBookId(@PathVariable String bookId) {
        return lendInfoService.getLendInfoByBookId(bookId);
    }

    @GetMapping("/{userId}")
    public List<LendInfo> getLendInfoByUserId(@PathVariable String userId) {
        return lendInfoService.getLendInfoByUserId(userId);
    }

    @GetMapping("/list")
    public List<LendInfo> getAllLendInfo() {
        return lendInfoService.getAllLendInfo();
    }

    @PutMapping("/{bookId}")
    public LendInfo updateLendInfo(@PathVariable String bookId, LocalDateTime localDateTime) {
        return lendInfoService.updateLendInfo(bookId, localDateTime);
    }


}
