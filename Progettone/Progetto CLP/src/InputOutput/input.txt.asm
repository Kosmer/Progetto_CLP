move SP FP 
pushr FP 
move SP AL 
pushr AL 
subi SP 1 
storei A0 2
move AL T1 
subi T1 1
load A0 0(T1) 
move AL T1 
subi T1 1
store A0 0(T1) 
pushr A0 
storei A0 5
popr T1 
add A0 T1 
popr A0 
halt
