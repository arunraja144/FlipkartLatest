$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("flipkart.feature");
formatter.feature({
  "line": 2,
  "name": "Flipkart home page",
  "description": "",
  "id": "flipkart-home-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Flipkart"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Flipkart moblile order validation test",
  "description": "",
  "id": "flipkart-home-page;flipkart-moblile-order-validation-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Open flipkart browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "escape key is pressed",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "flipkart home page should be loaded and validated",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user searches mobile in search bar and hit enter",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "list of given mobile phones should appear",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks first searched result link",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "searched mobile should appear with details",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "mobile details should be captured for validation",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "delivery details is entered and item added to cart",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "mobile details should be validated and compared with previous data",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "screen is closed if the mobile details matches",
  "keyword": "And "
});
formatter.match({
  "location": "Flipkart.open_flipkart_browser_and_validate_it()"
});
formatter.result({
  "duration": 11887742900,
  "status": "passed"
});
formatter.match({
  "location": "Flipkart.escape_key_is_pressed()"
});
formatter.result({
  "duration": 10139641200,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: //button[@class\u003d\u0027_2AkmmA _29YdH8\u0027]\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-TMBATB0\u0027, ip: \u0027192.168.1.8\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 81.0.1, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20200930150533, moz:geckodriverVersion: 0.26.0, moz:headless: false, moz:processID: 15164, moz:profile: C:\\Users\\Arun\\AppData\\Local..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: a6562244-5dd5-403d-9076-e1b7b638c1af\n*** Element info: {Using\u003dxpath, value\u003d//button[@class\u003d\u0027_2AkmmA _29YdH8\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat pages.FlipkartFirstWindow.escKey(FlipkartFirstWindow.java:38)\r\n\tat testcases.Flipkart.escape_key_is_pressed(Flipkart.java:20)\r\n\tat ✽.When escape key is pressed(flipkart.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Flipkart.flipkart_home_page_should_be_loaded_and_validated()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Flipkart.user_searches_mobile_in_search_bar_and_hit_enter()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Flipkart.list_of_given_mobile_phones_should_appear()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Flipkart.user_clicks_first_searched_result_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Flipkart.searched_mobile_should_appear_with_textprice_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Flipkart.mobile_textprice_should_be_captured_for_validation()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Flipkart.delivery_details_is_entered_and_item_added_to_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Flipkart.mobile_textprice_should_be_validated_and_compared_with_previous_data()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Flipkart.screen_is_closed_if_the_textprice_matches()"
});
formatter.result({
  "status": "skipped"
});
});