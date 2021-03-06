---
layout: dev
title: "Development manual for tictactoe"
---
# Development manual for tictactoe

##Download gradle
To get version 3.1 running do the following commands.
~~~~~~~~
curl -s https://get.sdkman.io | bash
source "~/.sdkman/bin/sdkman-init.sh"
sdk install gradle 3.1
~~~~~~~~

##Get Java 8
To have the Java 8 running on your machine do the following.
~~~~~~~~
sudo add-apt-repository ppa:webupd8team/java
sudo apt-get update
sudo apt-get install oracle-java8-installer
~~~~~~~~

##Clone the reposetory
In preferred shell enviroment type
~~~~~~~~
git clone https://github.com/Bjarnabofar/tictactoe.git
~~~~~~~~

##Setup Heroku
Make an account at Heroku
Download appropriate Heroku version:
https://devcenter.heroku.com/articles/heroku-command-line#download-and-install
login with heroku (not supported with Git Bash, use local command line):
~~~~~~~~
heroku login
~~~~~~~~

##Get geckodriver
Download geckodriver and add to path

##Build
When changes are made build can be done by typing gradle build
https://bjarnabofar.github.io/tictactoe/  see latest tests.

##Run locally
Type gradle run to run the program locally, and see the app at http://localhost:4567

##Push changes
To push changes sign in with the account
email: bjarnabofar@yahoo.com
password: hugbunadarfraedi

##Run Selenium tests locally
Make sure you have downloaded geckodriver.
Type ./gradlew selenium to run the selenium tests locally
