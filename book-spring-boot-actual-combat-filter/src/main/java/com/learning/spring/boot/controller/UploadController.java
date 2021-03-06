package com.learning.spring.boot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;

/**
 * @author beibei.huang
 * @Title: UploadController
 * @ProjectName book-spring-boot-actual-combat-parent
 * @Description: 文件上传控制器
 * @date 2018/11/8    14:58
 */
@RestController
@RequestMapping("/upload")
@Api("文件上传API")
public class UploadController {

    @ApiOperation(value = "跳转至J2EE文件上传页面" , notes = "跳转至J2EE文件上传页面")
    @GetMapping("/j2ee/page")
    public ModelAndView jumpJ2eePage(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/upload/j2ee");
        return mv;
    }

    @ApiOperation(value = "跳转至apache文件上传页面" , notes = "跳转至apache文件上传页面")
    @GetMapping("/apache/page")
    public ModelAndView jumpApachePage(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/upload/apache");
        return mv;
    }

    @ApiOperation(value = "使用java自带实现文件上传功能" , notes = "使用java自带实现文件上传功能")
    @PostMapping("/j2ee")
    @ResponseBody
    public String uploadByJ2ee(@RequestParam MultipartFile file){
        if (file.isEmpty()){
            return "上传文件不能为空，请选择上传文件！";
        }
        try {
            file.transferTo(new File("d://newJ2eeFile.txt"));
        } catch (IOException e) {
            return "文件上传失败！";
        }
        return String.format(file.getClass().getName())+"方式文件上传成功！";
    }


    @ApiOperation(value = "使用apache的fileupload实现文件上传功能" , notes = "使用apache的fileupload实现文件上传功能")
    @PostMapping("/apache")
    @ResponseBody
    public String uploadByApache(@RequestParam MultipartFile file){
        if (file.isEmpty()){
            return "上传文件不能为空，请选择上传文件！";
        }
        try {
            file.transferTo(new File("d://newApacheFile.txt"));
        } catch (IOException e) {
            return "文件上传失败！";
        }
        return String.format(file.getClass().getName())+"方式文件上传成功！";
    }

}
