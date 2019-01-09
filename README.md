# MyTaxiMobileAppAutomationTest
MyTaxi Android automation code challenge

Just quick overview of what was done:
1. Idling resource for OkHttp client based on OkHttp3IdlingResource lib - so no Thread.sleep() at all
2. Fetching user credentials from provided link (no hardcoded credentials)
3. Helpers for different activities and ApllicationManager holding all helpers inside
4. Tests are running via CircleCI on TestLab (now there are 2 Login tests and 2 Search tests for verification how data is cleaned between runs)


