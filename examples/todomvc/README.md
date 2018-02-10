# FactUI TodoMVC

This is a very small example app using the traditional TodoMVC demo. It uses plain FactUI in a very basic, straightforward way; real applications may desire to add some additional plumbing ]for things like update handling (rather than calling `transact!` directly from event handlers, for example.


## Running the TodoMVC Example
1. Clone the FactUI repository

factui is not on clojars so:

in the root of the factui project 

`lein install`

then

running with figwheel...

2. Switch to the `examples/todomvc` subdirectory.
3. Run `lein figwheel`
4. Visit `http://localhost:3449/app.html`

running with shadow cljs...

2. `npm install`
3. `shadow-cljs watch app`

open localhost at port 8777

 
 


