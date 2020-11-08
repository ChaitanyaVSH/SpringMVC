package main;

import main.services.LogicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.Logger;

@Controller
public class LogicalController {

    private final static Logger LOGGER = Logger.getLogger(LogicalController.class.getName());

    @Autowired
    private LogicalService logicalService;

    @RequestMapping("/logicaladd")
    public ModelAndView logicalAnd(HttpServletRequest request, HttpServletResponse response){

        LOGGER.info("Performing the logical AND");
        int i = Integer.parseInt(request.getParameter("l1"));
        int j = Integer.parseInt(request.getParameter("l2"));

        ModelAndView mv = new ModelAndView();
        mv.setViewName("display");
        mv.addObject("result",logicalService.logicaland(i,j));

        return mv;
    }

    @RequestMapping("/logicalor")
    public ModelAndView logicalor(HttpServletRequest request, HttpServletResponse response){

        LOGGER.info("Performing the logical OR");
        int i = Integer.parseInt(request.getParameter("l1"));
        int j = Integer.parseInt(request.getParameter("l2"));

        ModelAndView mv = new ModelAndView();
        mv.setViewName("display");
        mv.addObject("result", logicalService.logicalor(i,j));

        return mv;
    }

}
