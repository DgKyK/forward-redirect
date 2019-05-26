package command;

import javax.servlet.http.HttpServletRequest;

public class AdminStatistic implements Command {
    @Override
    public String getURIinfo(HttpServletRequest request) {
        return "/admin_statistic.jsp";
    }
}
