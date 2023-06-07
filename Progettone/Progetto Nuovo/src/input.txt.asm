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
