$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Contact.feature");
formatter.feature({
  "line": 1,
  "name": "Contact Functionatity",
  "description": "This Feature deal with the contact functionality",
  "id": "contact-functionatity",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "User should be able to click on the contact link",
  "description": "",
  "id": "contact-functionatity;user-should-be-able-to-click-on-the-contact-link",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Launch \"\u003cURL\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "click on the contact link",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Verify user in the contact page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cURL\u003e",
      "offset": 8
    }
  ],
  "location": "ContactSteps.i_navigate_througe(String)"
});
formatter.result({
  "duration": 7649611200,
  "status": "passed"
});
formatter.match({
  "location": "ContactSteps.click_on_the_contact_link()"
});
formatter.result({
  "duration": 506924100,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});