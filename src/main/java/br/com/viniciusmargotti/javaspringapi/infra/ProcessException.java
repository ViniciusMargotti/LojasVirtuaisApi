package br.com.viniciusmargotti.javaspringapi.infra;
 
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ProcessException extends RuntimeException
{
    public ProcessException(String exception) {
        super(exception);
    }
}