package com.example.demo.controller.index;

import com.example.demo.exceptions.InnerException;
import com.example.demo.model.ResponseEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.assertj.core.util.Preconditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName IndexController
 * @Description: TODO
 * @Author chenshilong
 * @Date 2020/6/16 0016
 * @Version 1.0
 **/
@Api(tags = "PC首页")
@RestController
@RequestMapping("/mapi/index")
public class IndexController {


    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @ApiOperation("获取最新VC推送的票补活动-Pro")
    @RequestMapping(value = "/activity/new", method = RequestMethod.GET)
    @RequiresPermissions("index:activity:new")
    public ResponseEntity<String> queryNewActivity(@RequestParam @ApiParam(value = "影院Id", required = true) Integer cinemaId) {
        Preconditions.checkNotNull(cinemaId, "影院Id参数不能为空");
        Preconditions.checkArgument(cinemaId <= 0, "影院Id不正确");

        try {

        } catch (Exception e) {
            logger.error("首页获取热门活动：", e);
            throw new InnerException("首页获取热门活动",e);
        }
        return ResponseEntity.success("首页获取热门活动");
    }

}
