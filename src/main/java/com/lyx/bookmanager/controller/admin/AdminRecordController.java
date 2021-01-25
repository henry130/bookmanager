package com.lyx.bookmanager.controller.admin;

import com.lyx.bookmanager.mapper.RecordMapper;
import com.lyx.bookmanager.pojo.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/record")
public class AdminRecordController {
    @Autowired
    private RecordMapper recordMapper;

    @RequestMapping("/getAll")
    public String getAll(Model model) {
        List<Record> records = recordMapper.getAllRecord();
        model.addAttribute("records", records);
        return "admin/records";
    }
}
