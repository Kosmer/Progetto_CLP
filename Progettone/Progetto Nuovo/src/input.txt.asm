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
move FP AL 
subi AL 1 
jsub function0
halt

function0:
pushr RA 
storei A0 1
move AL T1 
subi T1 2
load A0 0(T1) 
pushr A0 
move AL T1 
subi T1 2
store A0 0(T1) 
pop RA 
addi SP 0
pop 
store FP 0(FP) 
move FP AL 
subi AL 1 
pop 
rsub RA 