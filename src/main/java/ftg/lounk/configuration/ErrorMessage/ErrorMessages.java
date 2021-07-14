package ftg.lounk.configuration.ErrorMessage;

import org.springframework.http.HttpStatus;

public class ErrorMessages extends RuntimeException{
    private HttpStatus httpStatus;
    public ErrorMessages(String message, HttpStatus status){
        super(message);
        this.httpStatus = status;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }
}
