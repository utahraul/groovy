// get username property from TestSuite
def username = testRunner.testCase.testSuite.getPropertyValue( "Username" )

// write the email to the HTTP Request
testRunner.testCase.testSteps["createNewCustomer"].setPropertyValue( "email", email )