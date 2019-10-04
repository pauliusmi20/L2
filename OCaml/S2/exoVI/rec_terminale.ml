let rec pn (n : int) : float = 
		 if n = 1 then 1. else (1. /. (float_of_int n **2 ) ) +. pn (n - 1)  

let pnSqrt n = sqrt ( 6 * pn n  )
 
 		
let f (x:float a:float):float = ( x +. (a /. x ) ) /.2 

let f_rec a = 

let rec sqrt_n (n:int a:float x0:float) : float =
	if n = 1 then 1.0 else (sqrt_n (n-1) f (a x0) )  
	
	
	
	
