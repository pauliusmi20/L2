(* Les 3 fonctions ci-dessous sont à utiliser pour la fin du tme. Vous
   compléterez les annotations de types des fonctions suivantes en utilisant les
   types que vous aurez définis pendant le tme *)

let i2b (n: int) =
  n <> 0

let i2q (n: int) =
  let b0 = i2b (n mod 2) in
  let b1 = i2b (n/2 mod 2) in
  let b2 = i2b (n/4 mod 2) in
  let b3 = i2b (n/8 mod 2) in
    (b3,b2,b1,b0)

let i2o (n: int) =
  let b0 = i2b (n mod 2) in
  let b1 = i2b (n/2 mod 2) in
  let b2 = i2b (n/4 mod 2) in
  let b3 = i2b (n/8 mod 2) in
  let b4 = i2b (n/16 mod 2) in
  let b5 = i2b (n/32 mod 2) in
  let b6 = i2b (n/64 mod 2) in
  let b7 = i2b (n/128 mod 2) in
    (b7,b6,b5,b4,b3,b2,b1,b0)
