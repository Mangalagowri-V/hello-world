$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("bddtest.feature");
formatter.feature({
  "line": 1,
  "name": "Login Feature",
  "description": "Verify if user is able to Login in to the site",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login as a authenticated user",
  "description": "",
  "id": "login-feature;login-as-a-authenticated-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user enter facebook page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter valid username and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "success message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "cucumbercode.enterurl()"
});
formatter.result({
  "duration": 15119784900,
  "status": "passed"
});
formatter.match({
  "location": "cucumbercode.enterusername()"
});
formatter.result({
  "duration": 10002072200,
  "status": "passed"
});
formatter.match({
  "location": "cucumbercode.printmessage()"
});
formatter.result({
  "duration": 405495400,
  "status": "passed"
});
});