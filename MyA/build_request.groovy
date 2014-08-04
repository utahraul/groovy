def properties = (com.eviware.soapui.impl.wsdl.teststeps.WsdlPropertiesTestStep) context.getTestCase().getTestStepByName("Properties");
// generate new email
def random = new Random(new Date().getTime())
def email = ("test" + Math.abs(random.nextInt() % 10000) + "@myaccount.com"); log.info email 
// get password, name, surname1 and surname2 and dninumber property from TestCase Properties
def password = testRunner.testCase.getPropertyValue( "password" ); log.info password 
def name = testRunner.testCase.getPropertyValue( "name" ); log.info name 
def surname1 = testRunner.testCase.getPropertyValue( "surname1" ); log.info surname1
def surname2 = testRunner.testCase.getPropertyValue( "surname2" ); log.info surname2
def dninumber = testRunner.testCase.getPropertyValue( "dninumber" ); log.info dninumber 
properties.setPropertyValue("email", email);
properties.saveProperties("email");
//generate date ISO8601 for birthDate
def now = new Date()
def birthDate = now.format("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"); log.info birthDate 
//def birthDate = now.format("yyyy-MM-dd"); log.info birthDate 
//def birthDate = "1980-01-01"; log.info birthDate 
def gender = context.expand( '${Properties#gender}' )
def country = context.expand( '${Properties#country}' )
def documentType = context.expand( '${Properties#documentType}' )

//Añadidas nuevas propiedades
def mobilePhoneNumber = testRunner.testCase.getPropertyValue( "mobilePhoneNumber" ); log.info mobilePhoneNumber
def currentPassword = testRunner.testCase.getPropertyValue( "currentPassword" ); log.info currentPassword
def role = testRunner.testCase.getPropertyValue( "role" ); log.info role
def uatg = testRunner.testCase.getPropertyValue( "uatg" ); log.info uatg

def sb = new StringBuffer()
 	.append(' {\n') 	
	.append('   "document": {\n') 	
	.append('     "email": "' + email +'",\n') 	
	.append('     "password": "' + password +'",\n') 	
	.append('     "name": "' + name +'",\n') 	
	.append('     "surname1": "' + surname1 +'",\n') 	
	.append('     "surname2": "' + surname2 +'",\n') 	
	.append('     "gender": "' + gender + '",\n') 	
	.append('     "birthDate": "' + birthDate +'",\n') 	
	.append('     "nationality": "' + country + '",\n') 	
	.append('     "countryOfResidence": "' + country + '",\n')
	.append('     "documentType": "' + documentType + '",\n') 	
	.append('     "documentNumber": "' + dninumber +'",\n')
	.append('     "mobilePhoneNumber": "' + mobilePhoneNumber +'",\n')
	.append('     "currentPassword": "' + currentPassword +'",\n')
	.append('     "role": "' + role +'",\n')
	.append('     "uatg": "' + uatg +'"\n')	 	
	.append('   }') 	
	.append(' }'); 
properties.setPropertyValue("request", sb.toString()); 
properties.saveProperties("request"); log.info sb