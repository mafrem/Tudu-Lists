package tudu.web.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tudu.domain.RolesEnum;

import javax.servlet.http.HttpServletRequest;

/**
 * The Welcome controller.
 * 
 * @author Julien Dubois
 */
@Controller
@RequestMapping("/welcome")
public class WelcomeController {

    /**
     * Welcome action.
     */
    @RequestMapping(method = RequestMethod.GET)
    public String welcome(HttpServletRequest request) {

        if (request.isUserInRole(RolesEnum.ROLE_USER.toString())) {
            return "redirect:/lists";
        }
        return "welcome";
    }

}
