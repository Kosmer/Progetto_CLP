move SP FP 
pushr FP 
move SP AL 
pushr AL 
subi SP 1 
push function1
storei A0 10
move AL T1 
subi T1 1
load A0 0(T1) 
pushr FP 
move SP FP 
addi FP 1 
move AL T1
pushr T1 
move AL T1 
subi T1 1
store A0 0(T1) 
 pushr A0
move FP AL 
subi AL 1 
jsub function1
pushr A0 
move AL T1 
subi T1 1
store A0 0(T1) 
popr T1 
add A0 T1 
popr A0 
halt

function0:
pushr RA 
storei A0 1
move AL T1 
store T1 0(T1) 
subi T1 3
load A0 0(T1) 
move AL T1 
store T1 0(T1) 
subi T1 3
store A0 0(T1) 
pushr A0 
move AL T1 
subi T1 1
store A0 0(T1) 
popr T1 
mul A0 T1 
popr A0 
addi SP 0
popr RA 
addi SP 1
pop 
store FP 0(FP) 
move FP AL 
subi AL 1 
pop 
rsub RA 

function1:
pushr RA 
subi SP 1 
subi SP 1 
push function0
storei A0 3
move AL T1 
subi T1 4
load A0 0(T1) 
pushr FP 
move SP FP 
addi FP 1 
move AL T1
pushr T1 
move AL T1 
subi T1 1
store A0 0(T1) 
 pushr A0
move FP AL 
subi AL 1 
jsub function0
pushr A0 
move AL T1 
subi T1 4
store A0 0(T1) 
popr T1 
add A0 T1 
popr A0 
addi SP 3
popr RA 
addi SP 1
pop 
store FP 0(FP) 
move FP AL 
subi AL 1 
pop 
rsub RA 
