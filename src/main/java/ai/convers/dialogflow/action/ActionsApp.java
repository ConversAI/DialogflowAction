/*
 * Copyright (c) 2019. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package ai.convers.dialogflow.action;

import com.google.actions.api.ActionRequest;
import com.google.actions.api.ActionResponse;
import com.google.actions.api.DialogflowApp;
import com.google.actions.api.ForIntent;
import com.google.actions.api.response.ResponseBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ActionsApp extends DialogflowApp {

    private static final Logger LOGGER = LoggerFactory.getLogger(ActionsApp.class);

    @ForIntent("Welcome Intent")
    public ActionResponse welcome(ActionRequest request) {
        LOGGER.info("Welcome Intent -> start");
        ResponseBuilder responseBuilder = getResponseBuilder(request);
        responseBuilder.add("Welcome to my app");
        return responseBuilder.build();
    }

    @ForIntent("Good Bye Intent")
    public ActionResponse bye(ActionRequest request) {
        LOGGER.info("Good Bye Intent -> start");
        ResponseBuilder responseBuilder = getResponseBuilder(request);
        responseBuilder.add("Ok see you later.").endConversation();
        LOGGER.info("Good Bye intent -> end");
        return responseBuilder.build();
    }
}
