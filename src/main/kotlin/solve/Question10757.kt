package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

class Question10757 {
    constructor() {
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        val bw = BufferedWriter(OutputStreamWriter(System.`out`))
        val sb = StringBuilder()
        val st = StringTokenizer(br.readLine())
        val a = st.nextToken().reversed()
        val b = st.nextToken().reversed()
        val commonLength = if(a.length < b.length) a.length else b.length

        var up = 0
        for(idx in 0 until commonLength) {
            var value = Character.getNumericValue(a[idx]) + Character.getNumericValue(b[idx]) + up
            if(value > 9) {
                value -= 10
                up = 1
            } else {
                up = 0
            }
            sb.append(value.toString())
        }

        val extra = if(a.length<b.length) b else a

        for(idx in commonLength until extra.length) {
            var value = Character.getNumericValue(extra[idx]) + up
            if(value > 9) {
                value -= 10
                up = 1
            } else {
                up = 0
            }
            sb.append(value)
        }

        if(up == 1) {
            sb.append("1")
        }

        bw.write(sb.toString().reversed())
        bw.flush()
    }
}