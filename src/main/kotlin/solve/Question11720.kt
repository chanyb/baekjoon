package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class Question11720 {
    constructor () {
        var br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        var bw = BufferedWriter(OutputStreamWriter(System.`out`))
        var sum = 0
        var n = br.readLine().toInt()
        for (idx in 0 until n) {
            sum += br.read() - 48
        }
        bw.append(sum.toString())
        bw.flush()
    }

}