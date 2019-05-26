package command;

import javax.servlet.http.HttpServletRequest;

public class User implements Command {
    @Override
    public String getURIinfo(HttpServletRequest request) {
        return "/user_base.jsp";
    }
}
