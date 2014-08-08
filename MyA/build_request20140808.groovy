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
def nationality = "nationality"; log.info nationality
def communicationLanguage = "ES"; log.info communicationLanguage
// generate new loginEmail
def random = new Random(new Date().getTime())
def loginEmail = ("test" + Math.abs(random.nextInt() % 10000) + "@myaccount.com"); log.info loginEmail
def isValidatedLoginEmail = "isValidatedLoginEmail"; log.info isValidatedLoginEmail
def commercialEmail = "commercialEmail"; log.info commercialEmail
def isValidatedCommercialEmail = "isValidatedCommercialEmail"; log.info isValidatedCommercialEmail
def addressSet = "addressSet"; log.info addressSet
def phone1 = "phone1"; log.info phone1
def phone2 = "phone2"; log.info phone2
def phone3 = "phone3"; log.info phone3
def phone4 = "phone4"; log.info phone4
def eciCardNumber = "eciCardNumber"; log.info eciCardNumber
def isValidatedEciCard = "isValidatedEciCard"; log.info isValidatedEciCard
def loyaltyCardNumber = "loyaltyCardNumber"; log.info loyaltyCardNumber
def membershipSet = "membershipSet"; log.info membershipSet
def subscriptionSet = "subscriptionSet"; log.info subscriptionSet
def preferenceSet = "preferenceSet"; log.info preferenceSet
def collectiveSet = "collectiveSet"; log.info collectiveSet
def authorization = "authorization"; log.info authorization
def emailToken = "emailToken"; log.info emailToken
def passwordToken = "passwordToken"; log.info passwordToken
def uatg = "uatg"; log.info uatg
def encryptedPassword = "encryptedPassword"; log.info encryptedPassword

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
	.append('     "nationality": "' + nationality +'",\n')
	.append('     "communicationLanguage": "' + communicationLanguage +'",\n')
	.append('     "loginEmail": "' + loginEmail +'",\n')
	.append('     "communicationLanguage": "' + communicationLanguage +'",\n')
	.append('     "loginEmail": "' + loginEmail +'",\n')
	.append('     "isValidatedLoginEmail": "' + isValidatedLoginEmail +'",\n')	
	.append('     "commercialEmail": "' + loginEmail +'",\n')
	.append('     "isValidatedCommercialEmail": "' + isValidatedLoginEmail +'",\n')
	.append('     "addressSet": "' + addressSet +'",\n')
	.append('     "phone1": "' + phone1 +'",\n')
	.append('     "phone2": "' + phone2 +'",\n')
	.append('     "phone3": "' + phone3 +'",\n')
	.append('     "phone4": "' + phone4 +'",\n')
	.append('     "eciCardNumber": "' + eciCardNumber +'",\n')
	.append('     "isValidatedEciCard": "' + isValidatedEciCard +'",\n') 	
	.append('     "loyaltyCardNumber": "' + loyaltyCardNumber +'",\n') 		 	
	.append('     "membershipSet": "' + membershipSet + '",\n') 	
	.append('     "subscriptionSet": "' + subscriptionSet + '",\n')	
	.append('     "preferenceSet": "' + preferenceSet + '",\n')
	.append('     "collectiveSet": "' + collectiveSet + '",\n')
	.append('     "authorization": "' + authorization + '",\n')
	.append('     "emailToken": "' + emailToken + '",\n')
	.append('     "passwordToken": "' + passwordToken + '",\n')
	.append('     "uatg": "' + uatg + '",\n')
	.append('     "encryptedPassword": "' + encryptedPassword +'"\n')  	
	.append('   }') 	
	.append(' }'); 
properties.setPropertyValue("request", sb.toString()); 
properties.saveProperties("request"); log.info sb