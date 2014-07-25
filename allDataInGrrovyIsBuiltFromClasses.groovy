/* All data in Groovy is built from "classes" 
and instances of them. Class names by convention begin
 with an uppercase character: */

assert Byte.MAX_VALUE == 127
  //a class can have attached variables, called 'fields'
assert Byte.parseByte('34') == 34
  //a class can have attached functions, called 'methods'
def b= new Byte('34')
assert b.intValue() == 34