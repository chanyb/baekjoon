package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

class Question2745 {
    constructor() {
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        val bw = BufferedWriter(OutputStreamWriter(System.`out`))
        val st = StringTokenizer(br.readLine())
        val str = st.nextToken()
        val notation = st.nextToken().toInt()
        var position = 1
        var decimal = 0
        for (ch in str.reversed()) {
            var valueByDecimal = 0
            if (ch.code >= 65) {
                valueByDecimal = ch.code - 55
            } else {
                valueByDecimal = ch.code - 48
            }
            decimal += valueByDecimal * position // 합
            position *= notation // position 변경
        }

        bw.write(decimal.toString())
        bw.flush()
    }
}