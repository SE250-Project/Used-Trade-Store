package com.se250.store.controller;

import com.se250.store.entity.ProdInfo;
import com.se250.store.service.ProdInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


/**
 * (ProdInfo)表控制层
 *
 * @author makejava
 * @since 2022-10-25 18:59:30
 */
@Controller
@RequestMapping("home")
public class ProdInfoController {
    private static final Logger log = LoggerFactory.getLogger(ProdInfoController.class);

    private final ProdInfoService prodInfoService;

    @Autowired
    public ProdInfoController(ProdInfoService prodInfoService){
        this.prodInfoService =prodInfoService;
    }

//    @RequestMapping("lists")
    @GetMapping
    public String lists(Model model){
        log.debug("查询所有商品信息");
        List<ProdInfo> prodInfoList = prodInfoService.lists();
        model.addAttribute("prodInfoList",prodInfoList);
        //return "home/category";
        return "home";
    }
    //这个只用来做Test使用
    @RequestMapping("prodInfo")
    public String prodInfo(Model model){
        log.debug("prodInfo ok");
        model.addAttribute("prodInfo","hello!");
        return "Test";
    }


}

/*@RestController
@RequestMapping("prodInfo")
public class ProdInfoController {
    *//**
     * 服务对象
     *//*
    @Resource
    private ProdInfoService prodInfoService;

    *//**
     * 分页查询
     *
     * @param prodInfo 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     *//*
    @GetMapping
    public ResponseEntity<Page<ProdInfo>> queryByPage(ProdInfo prodInfo, PageRequest pageRequest) {
        return ResponseEntity.ok(this.prodInfoService.queryByPage(prodInfo, pageRequest));
    }

    *//**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     *//*
    @GetMapping("{id}")
    public ResponseEntity<ProdInfo> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.prodInfoService.queryById(id));
    }

    *//**
     * 新增数据
     *
     * @param prodInfo 实体
     * @return 新增结果
     *//*
    @PostMapping
    public ResponseEntity<ProdInfo> add(ProdInfo prodInfo) {
        return ResponseEntity.ok(this.prodInfoService.insert(prodInfo));
    }

    *//**
     * 编辑数据
     *
     * @param prodInfo 实体
     * @return 编辑结果
     *//*
    @PutMapping
    public ResponseEntity<ProdInfo> edit(ProdInfo prodInfo) {
        return ResponseEntity.ok(this.prodInfoService.update(prodInfo));
    }

    *//**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     *//*
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.prodInfoService.deleteById(id));
    }

}*/

