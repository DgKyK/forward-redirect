package command;

import javax.servlet.http.HttpServletRequest;

public class UserStatistic implements Command {
    @Override
    public String getURIinfo(HttpServletRequest request) {
        return "/user_statistic.jsp";
    }
}
