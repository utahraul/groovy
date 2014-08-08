def properties = (com.eviware.soapui.impl.wsdl.teststeps.WsdlPropertiesTestStep) context.getTestCase().getTestStepByName("Properties");
def cuc = "cuc"; log.info cuc
def cucSet = "cucSet"; log.info cucSet
def now = new Date()
def registrationDate = now.format("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"); log.info registrationDate
def businessLine = "businessLine"; log.info businessLine
def customerStatus = "customerStatus"; log.info customerStatus
def registrationCampaign = "registrationCampaign"; log.info registrationCampaign
def recordType = "recordType"; log.info recordType
def customerRecordSet = "customerRecordSet"; log.info customerRecordSet
def documentType = context.expand( '${Properties#documentType}' )
def documentNumber = "documentNumber"; log.info documentNumber
def isValidatedDocumentNumber = "isValidatedDocumentNumber"; log.info isValidatedDocumentNumber
def name = testRunner.testCase.getPropertyValue( "name" ); log.info name 
def surname1 = testRunner.testCase.getPropertyValue( "surname1" ); log.info surname1
def surname2 = testRunner.testCase.getPropertyValue( "surname2" ); log.info surname2
def gender = context.expand( '${Properties#gender}' )
def birthDate = now.format("yyyy-MM-dd"); log.info birthDate


def sb = new StringBuffer()
 	.append(' {\n') 	
	.append('   "document": {\n')
	.append('     "cuc": "' + cuc +'",\n')
	.append('     "cucSet": "' + cucSet +'",\n')
	.append('     "registrationDate": "' + registrationDate +'",\n')
	.append('     "businessLine": "' + businessLine +'",\n')
	.append('     "customerStatus": "' + customerStatus +'",\n')
	.append('     "registrationCampaign": "' + registrationCampaign +'",\n')
	.append('     "recordType": "' + recordType +'",\n')
	.append('     "customerRecordSet": "' + customerRecordSet +'",\n')
	.append('     "documentType": "' + documentType + '",\n')
	.append('     "documentNumber": "' + documentNumber +'",\n')
	.append('     "isValidatedDocumentNumber": "' + isValidatedDocumentNumber +'",\n')
	.append('     "name": "' + name +'",\n') 	
	.append('     "surname1": "' + surname1 +'",\n') 	
	.append('     "surname2": "' + surname2 +'",\n')
	.append('     "gender": "' + gender + '",\n')
	.append('     "birthDate": "' + birthDate +'",\n') 	
	
	.append('     "addressSet": "' + addressSet +'",\n')
	.append('     "encryptedPassword": "' + encryptedPassword +'",\n') 
	.append('     "loginEmail": "' + loginEmail +'",\n')
	.append('     "phone1": "' + phone1 +'",\n')	
	.append('     "recordType": "' + recordType +'",\n')
//	.append('     "email": "' + email +'",\n') 	
//	.append('     "password": "' + password +'",\n') 		
	 	
	.append('     "nationality": "' + country + '",\n') 	
//	.append('     "countryOfResidence": "' + country + '",\n')	
	.append('     "documentNumber": "' + dninumber +'"\n') 	 	
	.append('   }') 	
	.append(' }'); 
properties.setPropertyValue("request", sb.toString()); 
properties.saveProperties("request"); log.info sb