package com.huse.springbootexample.api.response;

import io.swagger.annotations.ApiModel;

import java.util.Objects;

@ApiModel
public class ResponseOfGet<T> {

    private T result;

    public ResponseOfGet(T result) {
        this.result = result;
    }

    public ResponseOfGet() {
    }

    public T getResult() {
        return this.result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof ResponseOfGet)) {
            return false;
        } else {
            ResponseOfGet<?> that = (ResponseOfGet)o;
            return Objects.equals(this.result, that.result);
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.result});
    }
}
