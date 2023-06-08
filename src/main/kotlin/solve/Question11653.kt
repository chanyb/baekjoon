package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

class Question11653 {
    constructor() {
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        val bw = BufferedWriter(OutputStreamWriter(System.`out`))
        var sb = StringBuilder()
        var n = br.readLine().toInt()
        var idx = 2

        if(n==1) return;
        while (idx in 2..n) {
            if(n%idx == 0) {
                sb.append(idx)
                sb.append("\n")

                n /= idx
                idx = 1

            }
            idx++
        }

        bw.write(sb.substring(0, sb.length-1))
        bw.flush()
    }
}