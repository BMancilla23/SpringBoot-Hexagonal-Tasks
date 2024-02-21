package com.hexagonal.tasks.domain.models;

public class AdditionalTaskInfo {
    private final Long userId;
    private final String username;
    private final String useEmail;
   
    public AdditionalTaskInfo(Long userId, String username, String useEmail) {
        this.userId = userId;
        this.username = username;
        this.useEmail = useEmail;
    }

    public Long getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getUseEmail() {
        return useEmail;
    }

}
