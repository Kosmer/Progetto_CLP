move SP FP 
pushr FP 
move SP AL 
pushr AL 
storei A0 2
move AL T1 
subi T1 3
load A0 0(T1) 
pushr A0 
storei A0 1
storei T1 1 
beq A0 T1 label0
move AL T1 
subi T1 3
store A0 0(T1) 
move AL T1 
subi T1 1
load A0 0(T1) 
pushr A0 
move AL T1 
subi T1 3
store A0 0(T1) 
b label1
label0:
move AL T1 
subi T1 3
store A0 0(T1) 
move AL T1 
subi T1 1
load A0 0(T1) 
pushr A0 
move AL T1 
subi T1 3
store A0 0(T1) 
label1:
halt
