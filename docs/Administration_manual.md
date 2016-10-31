---
layout: default
title: "Administration manual for tictactoe"
---
##Administration manual for tictactoe##
*Bjarnabofarnir</br>
*Emil Hjaltason</br>
*Hanna Ragnarsdóttir</br>
*Haukur Halldórsson</br>
*Hulda Lilja Hannesdóttir</br>
*Magnús Þorsteinsson</br>
*Þórhildur Þorleiksdóttir</br>

##See the staging app and selenium test results##
Go to tictactoe-staging.herokuapp.com to see the newest version in progress.
When it is on staging it has passed all unit tests, but not neccesarly all 
end-to-end tests (selenium tests).

##See the results of end-to-end tests##
Go to https://travis-ci.org/Bjarnabofar/tictactoe/ and check the newest job log.
At the bottom you can see a button / tag "after_deploy".
Click on it to see the results of the selenium tests.
If all selenium tests passed, it says "build successfull", otherwise it says what 
selenium test failed.

##Making the app live##
When the app is ready for production, after all selenium tests have passed, a pull
request must be made to merge master branch to production branch. 
When the pull request is accepted, the app goes live. The website for the production app
is tictactoe-production.herokuapp.com. 

Before making a pull request or accepting a pull request one must log in to git (see 
develop manual)



