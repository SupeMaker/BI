package com.huaxing.bi.controller;
import com.huaxing.bi.entiry.Shell;
//import com.huaxing.bi.service.ShellService;
import com.huaxing.bi.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/shell")
public class ShellController {

    @Autowired
//    private final ShellService shellService;
//
//    @Autowired
//    public ShellController(ShellService shellService) {
//        this.shellService = shellService;
//    }


    @RequestMapping(value="/list")
    public ResponseVO<List<Shell>> list() {
        return null;
//        QueryWrapper<Shell> shellQueryWrapper = new QueryWrapper<>();

//        return ResponseVO.ok(shellService.);
    }
}
