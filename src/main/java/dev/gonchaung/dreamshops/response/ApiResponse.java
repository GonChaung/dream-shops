package dev.gonchaung.dreamshops.response;


import lombok.Data;


@Data
public class ApiResponse {
    private String message;
    private Object data;

    public ApiResponse() {}

    public ApiResponse(String message, Object data) {
        this.message = message;
        this.data = data;
    }
}
