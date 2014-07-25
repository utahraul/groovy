println 'hello, world' //the function 'println' prints a string then newline
print 'hello, world\n' //'print' doesn't print newline, but we can embed
                       //newlines ('\n' on Unix/Linux, '\r\n' on Windows)
println 'hello' + ', ' + 'world' // + joins strings together
print 'hello, '; println 'world'
                       //use semi-colons to join two statements on one line
println( 'hello, world' )
             //can put command parameter in parens, sometimes we might have to
def a= 'world'; println 'hello, ' + a
                       //'def' to define a variable and give it a value
print 'hello, world'; println()
  //empty parens must be used for no-arg functions; here, prints a blank line
def b= 'hello', c= 'world'; println "$b, ${c}"
                       //$ in print string captures variable's value