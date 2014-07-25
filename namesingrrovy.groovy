def abc= 4
def a23c= 4
def ab_c= 4
def _abc= 4

def ABC= 4
assert abc == ABC //although their values are the same...
assert ! abc.is( ABC ) //...the variables 'abc' and 'ABC' are different,
                       //the names being case-sensitive

/*these each produce compile errors when uncommented...
def abc //already defined
def a%c= 4 //not a valid name because it contains a symbol other than _
def 2bc= 4 //may not contain a digit in first position
*/