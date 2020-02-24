package chapter8.solutions.ex10

import chapter8.RNG
import chapter8.State

data class SGen<A>(val forSize: (Int) -> Gen<A>)

data class State<S, out A>(val run: (S) -> Pair<A, S>)

data class Gen<A>(val sample: State<RNG, A>) {
    //tag::init[]
    fun unsized(): SGen<A> = SGen { this }
    //end::init[]
}
