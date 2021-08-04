var x = [-8, 2, 5, 12, 14, 17, 21, 23, 32, 100, 122, 145, 164];

function findVal(val, arr) {
    console.log(arr)
    var midpoint = Math.floor(arr.length / 2);

    if (val == arr[midpoint]) {
        return true;
    }

    else if (val < arr[midpoint]) {
        if (arr.length == 1 & arr[midpoint] != val){
            return false
        }
        var blah = arr.slice(0,midpoint)
        console.log(blah)
        return findVal(val, blah)
    }

    else if (val > arr[midpoint]) {
        if (arr.length == 1 & arr[midpoint] != val) {
            return false
        }
        var blah2 = arr.slice(midpoint)
        return findVal(val, blah2)
    }
    console.log(midpoint)
    return false
}

console.log(findVal(13, x))
console.log(findVal(122, x))
console.log(findVal(17, x))


// function binarySearch(input, target) {
//     if (target < input[0] || target > input[input.length - 1]) {
//         return false
//     }
//     if (target == input[0] || target == input[input.length - 1]) {
//         return true
//     }
//     var midpoint = Math.ceil((input.length / 2))
//     if (target == input[midpoint]) {
//         return true
//     }
//     else if (target < input[midpoint]) {
//         input = input.slice(0, midpoint)
//         return binarySearch(input, target)
//     }
//     else if (target > input[midpoint]) {
//         input = input.slice(midpoint, input.length)
//         return binarySearch(input, target)
//     }
// }

// console.log(binarySearch(x, 122))
// console.log(binarySearch(x, 350))