package com.example.demo.model;

public class ResultModel {
    String error;
    String success;

    public ResultModel(String error, String success) {
        this.error = error;
        this.success = success;
    }

    public ResultModel() {
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }
}
