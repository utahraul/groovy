class buildRequest {

    static String main(args) {
    
    //def properties = (com.eviware.soapui.impl.wsdl.teststeps.WsdlPropertiesTestStep) context.getTestCase().getTestStepByName("Properties");
    // generate new email
    def random = new Random(new Date().getTime())
    def email = ("test" + Math.abs(random.nextInt() % 10000) + "@myaccount.com"); 
    // get password, name, surname1 and surname2 and dninumber property from TestCase Properties
    def password = "password"; 
    def name = "name";
    def surname1 = "surname1";
    def surname2 = "surname2";
    def dninumber = "dninumber";
    //properties.setPropertyValue("email", email);
    //properties.saveProperties("email");
        //generate date ISO8601 for birthDate
        def now = new Date()
        //def birthDate = now.format("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"); log.info birthDate 
        def birthDate = now.format("yyyy-MM-dd"); //log.info birthDate 
        //def birthDate = "1980-01-01"; log.info birthDate 
    def gender = "";
    def country = "";
    def documentType = "";


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
    .append('     "documentNumber": "' + dninumber +'"\n')          
    .append('   }')     
    .append(' }');
    
    return (sb);
//properties.setPropertyValue("request", sb.toString()); 
//properties.saveProperties("request");// log.info sb

    }

}