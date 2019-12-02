# Dialogflow Action

[![License](http://img.shields.io/:license-apache-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)
[![Deploy to Heroku](https://img.shields.io/badge/deploy%20to-Heroku-6762a6.svg?longCache=true)](https://heroku.com/deploy)

This sample project demonstrates the implementation of a Dialogflow Webhook (external action) using:
- [Actions on Google Java/Kotlin Client Library](https://github.com/actions-on-google/actions-on-google-java)
- [Spring Boot](https://spring.io/projects/spring-boot)

1. The project contains a sample [bot](./bot) (DialogflowAction.zip), which can be imported into Dialogflow. 
2. Further, this project can be deployed to [Heroku](https://heroku.com/deploy).
3. Finally, the external action provides a Webhook (Dialogflow Fulfillment) under 'https://***/actions/'.

> For a local testing tunnel, use [ngrok](https://ngrok.com) or [serveo](http://serveo.net/).

## Maintainer
- [Andreas Martin](https://andreasmartin.ch)

## License

- [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)