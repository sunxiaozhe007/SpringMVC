package domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserCustom {

    private List<User> userList;
    private User user;
    private Map<String,Object> maps = new HashMap<String, Object>();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }
}
