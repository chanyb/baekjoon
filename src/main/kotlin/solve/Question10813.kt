package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

class Question10813 {
    constructor() {
        var br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        var bw = BufferedWriter(OutputStreamWriter(System.`out`))

        var st = StringTokenizer(br.readLine(), " ")

        var n = st.nextToken().toInt()
        var m = st.nextToken().toInt()
        var bucket = IntArray(n+1)

        for (idx: Int in 0 until m) {
            st = StringTokenizer(br.readLine(), " ")
            var i = st.nextToken().toInt();
            var j = st.nextToken().toInt();

            if(bucket[i] == 0) bucket[i] = i
            if(bucket[j] == 0) bucket[j] = j

            bucket[0] = bucket[i]
            bucket[i] = bucket[j]
            bucket[j] = bucket[0]
        }

        var sb = StringBuilder()

        for (idx: Int in 1..n) {
            if(bucket[idx] == 0) bucket[idx] = idx
            sb.append(bucket[idx])
            sb.append(" ")
        }

        sb.setLength(sb.length-1)

        bw.append(sb.toString())
        bw.flush()
    }
}