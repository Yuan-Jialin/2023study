
process.stdin.setEncoding('utf8')
String.prototype.code = String.prototype.charCodeAt
let buffer = ''
process.stdin.on('readable', () => {
    let chunk = process.stdin.read()
    if (chunk) buffer += chunk.toString()
})

const solve = () => {
    // todo
    let data = buffer.split('\n'),idx = 0
    let [a,b] = data[0].trim().split(' ').map(Number)
    let res = a ** b
    console.log(res > 1e9 ? -1 : res)
}
process.stdin.on('end', solve)

