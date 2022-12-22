package com.example.demo.controller;


import com.example.demo.core.entity.R;
import com.example.demo.dao.entity.Demo;
import com.example.demo.service.DemoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "DemoController", description = "测试模块")
public class DemoController {
    @Resource
    private DemoService demoService;

    @GetMapping("/all")
    @Operation(description = "获取所有")
    public R<List<Demo>> getAll() {
        return R.ok(demoService.getDemo());
    }

    @GetMapping("/count")
    @Operation(description = "计数")
    public R<Integer> count() {
        return R.ok(demoService.count());
    }

    @PutMapping("/add")
    @Operation(description = "添加")
    public R<Void> add(@RequestBody Demo demo) {
        demoService.add(demo);
        return R.ok();
    }

    @PostMapping("/update")
    @Operation(description = "修改")
    public R<Void> update(@RequestBody  Demo demo) {
        demoService.updateById(demo);
        return R.ok();
    }

    @DeleteMapping("/delete")
    @Operation(description = "修改")
    public R<Void> delete(@RequestBody @ParameterObject Long id) {
        demoService.deleteById(id);
        return R.ok();
    }


}
