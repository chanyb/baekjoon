package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

class Question10811 {
    constructor () {
        var br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        var bw = BufferedWriter(OutputStreamWriter(System.`out`))

        var st = StringTokenizer(br.readLine(), " ")

        var n = st.nextToken().toInt()
        var m = st.nextToken().toInt()
        var bucket = IntArray(n)

        for (idx: Int in 0 until n) {
            bucket[idx] = idx+1
        }

        var sb = StringBuilder()

        for (idx: Int in 0 until m) {
            st = StringTokenizer(br.readLine(), " ")
            var i = st.nextToken().toInt();
            var j = st.nextToken().toInt();
            i--
            j--

            for (jdx: Int in 0 .. (j-i)/2) {
                val tmp: Int = bucket[i+jdx]
                bucket[i+jdx] = bucket[j-jdx]
                bucket[j-jdx] = tmp
            }
        }


        for (idx: Int in bucket.indices) {
            sb.append(bucket.get(idx))
            sb.append(" ")
        }

        sb.setLength(sb.length-1)

        bw.append(sb.toString())
        bw.flush()
    }
}