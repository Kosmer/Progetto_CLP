move SP FP 
pushr FP 
move SP AL 
pushr AL 
push function0
pushr FP 
move SP FP 
addi FP 1 
move AL T1
pushr T1 
storei A0 2
 pushr A0
move FP AL 
subi AL 1 
jsub function0
move AL T1 
subi T1 1
load A0 0(T1) 
pushr A0 
move AL T1 
subi T1 1
store A0 0(T1) 
halt

function0:
pushr RA 
storei A0 5
move AL T1 
subi T1 3
load A0 0(T1) 
pushr A0 
move AL T1 
subi T1 3
store A0 0(T1) 
addi SP 1
popr RA 
addi SP 1
pop 
store FP 0(FP) 
move FP AL 
subi AL 1 
pop 
rsub RA 
