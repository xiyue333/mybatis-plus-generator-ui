package com.github.davidfantasy.mybatisplus.generatorui.example.controller.test;

import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.github.davidfantasy.mybatisplus.generatorui.example.service.test.AppDownloadService;
import com.github.davidfantasy.mybatisplus.generatorui.example.entity.test.AppDownload;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 应用下载信息 前端控制器
 * </p>
 *
 * @author kaiser
 * @since 2024-10-16
 */
@Controller
@RequestMapping("/app-download")
public class AppDownloadAction {


    @Autowired
    private AppDownloadService appDownloadService;

    @GetMapping(value = "/")
    public ResponseEntity<Page<AppDownload>> list(@RequestParam(required = false) Integer current, @RequestParam(required = false) Integer pageSize) {
        if (current == null) {
            current = 1;
        }
        if (pageSize == null) {
            pageSize = 10;
        }
        Page<AppDownload> aPage = appDownloadService.page(new Page<>(current, pageSize));
        return new ResponseEntity<>(aPage, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<AppDownload> getById(@PathVariable("id") String id) {
        return new ResponseEntity<>(appDownloadService.getById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<Object> create(@RequestBody AppDownload params) {
        appDownloadService.save(params);
        return new ResponseEntity<>("created successfully", HttpStatus.OK);
    }

    @PostMapping(value = "/delete/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") String id) {
        appDownloadService.removeById(id);
        return new ResponseEntity<>("deleted successfully", HttpStatus.OK);
    }

    @PostMapping(value = "/update")
    public ResponseEntity<Object> update(@RequestBody AppDownload params) {
        appDownloadService.updateById(params);
        return new ResponseEntity<>("updated successfully", HttpStatus.OK);
    }
}
