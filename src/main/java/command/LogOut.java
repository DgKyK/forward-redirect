package command;

import javax.servlet.http.HttpServletRequest;

public class LogOut implements Command {
    @Override
    public String getURIinfo(HttpServletRequest request) {
        return "redirect:/index.jsp";
    }
}
