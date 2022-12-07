package br.com.poc.factory.pattern.utils;

import org.slf4j.MDC;

import com.google.gson.Gson;

public class Logger {
    private static org.slf4j.Logger LOGGER;

    public Logger(Class<?> clazz) {
        LOGGER = org.slf4j.LoggerFactory.getLogger(Logger.class);
    }

    public void info(String message, Object... objects) {
        this.mdc(objects);

        LOGGER.info(message);
    }

    public void error(String message, Object... objects) {
        this.mdc(objects);

        LOGGER.error(message);
    }

    private void mdc(Object... objects) {
        final StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        final String event = String.format("%s.%s()", stackTraceElement.getClassName(),
                stackTraceElement.getMethodName());

        MDC.put("event", event);
        MDC.put("payload", this.getPayload(objects));
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

}
