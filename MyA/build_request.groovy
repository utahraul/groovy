def properties = (com.eviware.soapui.impl.wsdl.teststeps.WsdlPropertiesTestStep) context.getTestCase().getTestStepByName("Properties");
def random = new Random(new Date().getTime())
def email = ("jose" + Math.abs(random.nextInt() % 10000) + "@gmail.com")
log.info email
def sb = new StringBuffer()
	.append(' {\n')
	.append('   "document": {\n')
	.append('     "email": "' + email +'",\n')
	.append('     "password": "1234blaBLABLA",\n')
	.append('     "name": "John",\n')
	.append('     "surname1": "Smith",\n')
	.append('     "surname2": "Smith",\n')
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