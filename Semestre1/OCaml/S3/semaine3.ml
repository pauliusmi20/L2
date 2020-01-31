(*let rec merge ( f : 'a -> 'a -> bool ) (l1 : 'a list) (l2: 'a list): 'a list =
	match l1 , l2 with
	  [] , [] -> []
	| [] , x::xs -> l2
	| x::xs , [] -> l1
 | x::xs , y::ys -> match x with
*)

let rec merge ( f : 'a -> 'a -> bool ) (l1 : 'a list) (l2: 'a list): 'a list =
	match l1 , l2 with
	  [] , [] -> []
	| [] , x::xs -> l2
	| x::xs , [] -> l1
 | x::xs , y::ys -> if f x y = true then x::(merge (f) xs l2) else y::(merge (f) l1 ys)


let merge_t ( f : 'a -> 'a -> bool ) (l1 : 'a list) (l2: 'a list): 'a list =
  let rec loop  (t1 : 'a list ) (t2: 'a list) (tf: 'a list) =
		match t1, t2  with
			[],[] -> tf |
			[], x::xs -> tf@t2 |
			x::xs , [] -> tf@t1 |
   x::xs, y::ys ->
   if f x y = true then x::(loop xs t2 tf) else y::(loop  t1 ys tf) in loop  l1 l2 []

let split (l:'a list) : ('a list * 'a list) =
  let rec f ll  = match ll with [] -> [] |
    x::xs-> match xs with [] -> [x] |
    y::ys -> x::(f y )
