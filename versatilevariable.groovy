def a
assert a == null
  //variables defined but not given a value have special value null
def b = 1
assert b == 1
b = 2
assert b == 2 //variables can be re-assigned to
b = 'cat'
assert b == 'cat' //they can be re-assigned different types/classes of data
b = null
assert b == null //they can be unassigned