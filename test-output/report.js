$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/Features/switchtab.feature");
formatter.feature({
  "name": "Switching tabs in same window",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Use Window Handle to switch in same window",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User opens new tab",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.SwitchTabsInSameWindow.user_opens_new_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User switchs back to previous opened tab",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.SwitchTabsInSameWindow.user_switchs_back_to_previous_opened_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});