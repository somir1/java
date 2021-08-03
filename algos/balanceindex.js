const balIdx = arr => {
    const length = arr.length
    let current = 0
    let total = 0

    for ( let i = 0; i < length - 2; i++ ) {
        current += arr.splice( 0, 1 )[ 0 ]
        total = 0

        total += arr.reduce( ( a, b ) => a + b ) - arr[ 0 ]

        if ( current === total ) return i + 1
    }

    return -1
}

const arr1 = [ 1, 2, 3, 4, 3, 10 ]
const arr2 = [ 3, 4, 7, 2, 9 ]
const arr3 = [ 3, 4, 7, 2, -2, 9, 14 ]

console.log( balIdx( arr1 ), balIdx( arr2 ), balIdx( arr3 ) )