package br.com.poc.factory.pattern.utils;

import org.apache.logging.log4j.ThreadContext;

import com.google.gson.Gson;

public class Logger {
    private static org.apache.logging.log4j.Logger LOGGER = org.apache.logging.log4j.LogManager.getLogger(Logger.class);

    public Logger(Class<?> clazz) {
        LOGGER = org.apache.logging.log4j.LogManager.getLogger(clazz);
    }

    public void info(String message, Object... objects) {
        this.mdc(objects);

        LOGGER.info(this.prettyPring(message));
    }

    public void error(String message, Object... objects) {
        this.mdc(objects);

        LOGGER.error(this.prettyPring(message));
    }

    private void mdc(Object... objects) {
        ThreadContext.put("payload", this.getPayload(objects));
    }

    private String getPayload(Object... objects) {
        final Gson gson = new Gson().newBuilder().create();

        try {
            return gson.toJson(objects);
        } catch (Exception e) {
            LOGGER.error("Failed to convert logging to JSON: {}", e.getMessage());
            return null;
        }
    }

    private String prettyPring(String message) {
        final StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        final String event = String.format("%s.%s()", stackTraceElement.getClassName(),
                stackTraceElement.getMethodName());

        return String.format(
                "{\"event\": \"%s\", \"details\": \"%s\", \"body\": {\"payload\": %s}, \"requestId\": \"%s\"}", event,
                message,
                ThreadContext.get("payload"),
                ThreadContext.get("requestId"));
    }

}
