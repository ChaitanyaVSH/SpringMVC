package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import main.services.ArithmeticService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.Logger;

@Controller
public class ArithmeticController {

    private final static Logger LOGGER = Logger.getLogger(ArithmeticController.class.getName());

    //Autowired searches for the object in the spring container.
    @Autowired
    private ArithmeticService arithmeticService;

    @RequestMapping("/add")
    public ModelAndView add(HttpServletRequest request, HttpServletResponse response){

        LOGGER.info("Performing the Addition");
        int i = Integer.parseInt(request.getParameter("t1"));
        int j = Integer.parseInt(request.getParameter("t2"));

//        All the service or business logics has to be performed in the service packages.
//        1. Create a service package with necessary services.
//        2. Import them here and invoke them with necessary parameters.
//        int result = i + j;

        ModelAndView mv = new ModelAndView();
        mv.setViewName("display");
        mv.addObject("result",arithmeticService.add(i,j));

        return mv;
    }

    @RequestMapping("/subtract")
    public ModelAndView subtract(HttpServletRequest request, HttpServletResponse response){

        LOGGER.info("Performing the Subtraction");
        int i = Integer.parseInt(request.getParameter("s1"));
        int j = Integer.parseInt(request.getParameter("s2"));

        ModelAndView mv = new ModelAndView();
        mv.setViewName("display");
        mv.addObject("result", arithmeticService.subtract(i,j));

        return mv;
    }
}
