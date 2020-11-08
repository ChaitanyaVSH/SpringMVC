package main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.Logger;


@Controller
public class AddController {

    private final static Logger LOGGER = Logger.getLogger(AddController.class.getName());

    @RequestMapping("/add")
    public ModelAndView add(HttpServletRequest request, HttpServletResponse response){

        LOGGER.info("Performing the Addition");
        int i = Integer.parseInt(request.getParameter("t1"));
        int j = Integer.parseInt(request.getParameter("t2"));

        int result = i + j;

        ModelAndView mv = new ModelAndView();
        mv.setViewName("display.jsp");
        mv.addObject("result",result);

        return mv;
    }

    @RequestMapping("/subtract")
    public ModelAndView subtract(HttpServletRequest request, HttpServletResponse response){

        LOGGER.info("Performing the Subtraction");
        int i = Integer.parseInt(request.getParameter("s1"));
        int j = Integer.parseInt(request.getParameter("s2"));

        int result = i-j;

        ModelAndView mv = new ModelAndView();
        mv.setViewName("display.jsp");
        mv.addObject("result", result);

        return mv;
    }
}
