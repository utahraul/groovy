def properties = (com.eviware.soapui.impl.wsdl.teststeps.WsdlPropertiesTestStep) context.getTestCase().getTestStepByName("Properties");
def random = new Random(new Date().getTime())
def email = ("test" + Math.abs(random.nextInt() % 10000) + "@myaccount.com")
log.info email
// get name property from TestSuite
def name = testRunner.testCase.testSuite.getPropertyValue( "name" )
def name = testRunner.testCase.testSuite.getPropertyValue( "surname1" )
def name = testRunner.testCase.testSuite.getPropertyValue( "surname2" )
log.info name
def sb = new StringBuffer()
	.append(' {\n')
	.append('   "document": {\n')
	.append('     "email": "' + email +'",\n')
	.append('     "password": "123456789012345678901234567890",\n')
	.append('     "name": "' + name +'",\n')
	.append('     "surname1": "' + surname1 +'",\n')
	.append('     "surname2": "' + surname2 +'",\n')
	.append('     "gender": "' + context.expand('${gender}') + '",\n')
	.append('     "birthDate": "2021-08-26T10:20:01.390Z",\n')
	.append('     "nationality": "' + context.expand('${country}') + '",\n')
	.append('     "countryOfResidence": "' + context.expand('${country}') + '",\n')
	.append('     "documentType": "DNI",\n')
	.append('     "documentNumber": "23234234X"\n')
	.append('   }')
	.append(' }');
properties.setPropertyValue("request", sb.toString());
properties.saveProperties("request");
log.info sb