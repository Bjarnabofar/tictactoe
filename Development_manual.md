---
layout: default
title: "Development manual for tictactoe"
---

##Download gradle##
To get version 3.1 running do the following commands.
curl -s https://get.sdkman.io | bash
source "~/.sdkman/bin/sdkman-init.sh"
sdk install gradle 3.1

##Get Java 8##
To have the Java 8 running on your machine do the following.
sudo add-apt-repository ppa:webupd8team/java
sudo apt-get update
sudo apt-get install oracle-java8-installer

##Clone the reposetory##
In preferred shell enviroment type
git clone https://github.com/Bjarnabofar/tictactoe.git

##Setup Heroku##
Make an account at Heroku
Download appropriate Heroku version:
https://devcenter.heroku.com/articles/heroku-command-line#download-and-install
login with heroku (not supported with Git Bash, use local command line):
~~~~~~~~
heroku login
~~~~~~~~

##Get Chrome Driver##
Download chromedriver.exe and add to Path

##Build##
When changes are made build can me done by typing
~~~~~~~~
gradle build
~~~~~~~~
And checking by
~~~~~~~~
gradle check
~~~~~~~~

##Push changes##
To push changes sign in with the account
email: bjarnabofar@yahoo.com
password: hugbunadarfraedi