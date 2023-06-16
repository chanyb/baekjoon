package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class Question2577 {
    constructor () {
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        val bw = BufferedWriter(OutputStreamWriter(System.`out`))
        val sb = StringBuilder()

        val a = br.readLine().toInt()
        val b = br.readLine().toInt()
        val c = br.readLine().toInt()

        val value = a*b*c

        val arr = IntArray(10)


        for(c in value.toString()) {
            when (c) {
                '0' -> arr[0]++
                '1' -> arr[1]++
                '2' -> arr[2]++
                '3' -> arr[3]++
                '4' -> arr[4]++
                '5' -> arr[5]++
                '6' -> arr[6]++
                '7' -> arr[7]++
                '8' -> arr[8]++
                '9' -> arr[9]++
            }
        }
        for(i in 0..9) {
            sb.append(arr[i])
            sb.append("\n")
        }
        sb.setLength(sb.length-1)
        bw.write(sb.toString())
        bw.flush()
    }
}