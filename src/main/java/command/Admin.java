package command;

import javax.servlet.http.HttpServletRequest;

public class Admin implements Command{
    @Override
    public String getURIinfo(HttpServletRequest request) {
        return "/admin_base.jsp";
    }
}
