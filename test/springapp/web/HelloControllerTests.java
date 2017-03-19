package web;

import junit.framework.TestCase;
import org.springframework.web.servlet.ModelAndView;
import springapp.web.HelloController;

/**
 * Created by ionut on 3/19/2017.
 */
public class HelloControllerTests extends TestCase {

    public void testHandleRequestView() throws Exception{
        HelloController controller = new HelloController();
        ModelAndView modelAndView = controller.handleRequest(null, null);
        assertEquals("hello.jsp", modelAndView.getViewName());
    }
}