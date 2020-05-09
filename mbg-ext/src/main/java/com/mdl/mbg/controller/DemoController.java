package com.mdl.mbg.controller;

import com.mdl.mbg.common.CommonResult;
import com.mdl.mbg.dao.BiResumeMapperExt;
import com.mdl.mbg.model.BiResumeEntity;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Project : mybatis-generator
 * @Package Name : com.mdl.mbg.controller
 * @Description : TODO
 * @Author : xiekun
 * @Create Date : 2020年05月09日 15:43
 * @ModificationHistory Who   When     What
 * ------------    --------------    ---------------------------------
 */

@Api(tags = "DemoController", description = "示例接口")
@Controller
public class DemoController {

    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

    @Autowired
    private BiResumeMapperExt biResumeMapperExt;

    @RequestMapping(value = "/resume", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult getResume(String id) {
        BiResumeEntity biResume = biResumeMapperExt.selectByPrimaryKey(id);
        logger.debug("111111");
        logger.info("222222");
        logger.trace("333333");
        logger.error("444444");
        logger.info("【biResume】:{}", biResume);
        String jobSeekerName = biResume.getJobSeekerName();
        List<BiResumeEntity> biResumes = biResumeMapperExt.findByName(jobSeekerName);
        logger.info("【List<BiResume>】:{}", biResumes);
        CommonResult commonResult = CommonResult.success(biResumes);
        return commonResult;
    }

}
