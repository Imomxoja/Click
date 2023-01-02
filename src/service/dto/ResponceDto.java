package service.dto;

import service.model.User;

public class ResponceDto {
    private String answer;
    private boolean isSuccess;
    private User user;

    public ResponceDto(String answer, boolean isSuccess) {
        this.answer = answer;
        this.isSuccess = isSuccess;
    }


    public User getUser() {
        return user;
    }

    public String getAnswer() {
        return answer;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
