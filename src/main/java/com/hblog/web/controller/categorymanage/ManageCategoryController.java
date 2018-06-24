package com.hblog.web.controller.categorymanage;

import com.google.common.collect.Maps;
import com.hblog.domain.CategoryInfo;
import com.hblog.service.category.ManageCategoryService;
import com.hblog.service.category.SimpleCategoryInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "manage/category")
public class ManageCategoryController {

    @Resource(name = "manageCategoryService")
    private ManageCategoryService manageCategoryService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    private String list(HttpServletRequest request, Model model) {
        List<SimpleCategoryInfo> simpleCategoryInfoList = manageCategoryService.list();

        model.addAttribute("simpleCategoryList", simpleCategoryInfoList);
        return "manage/category/list";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    private String insert(@ModelAttribute CategoryInfo categoryInfo, HttpServletRequest request) {
        manageCategoryService.insert(categoryInfo);

        return "redirect:list";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    private String update(@ModelAttribute CategoryInfo categoryInfo, HttpServletRequest request) {
        manageCategoryService.updateBySlug(categoryInfo);

        return "redirect:list";
    }
}
