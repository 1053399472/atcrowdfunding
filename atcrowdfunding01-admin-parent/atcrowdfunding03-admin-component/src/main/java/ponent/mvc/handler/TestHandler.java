package ponent.mvc.handler;

import crowd.entity.Admin;
import crowd.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ponent.service.api.AdminService;
import util.ResultEntity;

import java.util.List;
@Controller
public class TestHandler {
    @Autowired
    private AdminService adminService;

    @RequestMapping("/test/ssm.html")
    public String testSSM(ModelMap modelMap){
        System.out.println(10/0);
        List<Admin> adminList = adminService.getAll();
        modelMap.addAttribute("adminList",adminList);

        return "target";
    }
    //通过@RequestParam接收数组
    @ResponseBody
    @RequestMapping("/send/array/one.html")
    public String testAjax01(@RequestParam("array") Integer[] array){
        for(Integer num : array){
            System.out.println("num:"+num);
        }
        return "success";
    }

    //通过@RequestBody接收数组
    @ResponseBody
    @RequestMapping("/send/array/two.html")
    public String testAjax02(@RequestBody Integer[] array){
        for(Integer num : array){
            System.out.println("num:"+num);
        }
        return "success";
    }

    //通过@RequestBody接收复杂对象
    @ResponseBody
    @RequestMapping("/send/compose/object.html")
    public String testSendComposeObject(@RequestBody Student student){
        System.out.println(student);
        return "success";
    }

    //通过一个工具类（ResultEntity<T>）统一返回数据的格式
    @ResponseBody
    @RequestMapping("/send/compose/object.json")
    public ResultEntity<Student> testResultEntity(@RequestBody Student student){

        return ResultEntity.successWithData(student);
    }
}
