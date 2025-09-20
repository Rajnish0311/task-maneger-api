package code.rajnish.task_maneger.task_maneger.dto;

public class ApiResponse<T> {
    private String status;
    private T data;
    private String message;

    public ApiResponse(String status, T data, String message) {
        this.status = status;
        this.data = data;
        this.message = message;
    }

    public String getStatus() { return status; }
    public T getData() { return data; }        // <-- works now
    public String getMessage() { return message; }
}
