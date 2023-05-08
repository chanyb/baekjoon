package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

class Question10810 {
    constructor () {
        var br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        var bw = BufferedWriter(OutputStreamWriter(System.`out`))

        var st = StringTokenizer(br.readLine(), " ")

        var n = st.nextToken().toInt()
        var m = st.nextToken().toInt()
        var bucket = IntArray(n)

        for (idx: Int in 0 until m) {
            st = StringTokenizer(br.readLine(), " ")
            var i = st.nextToken().toInt();
            var j = st.nextToken().toInt();
            var num = st.nextToken().toInt();

            for (idx: Int in i..j) {
                bucket[idx-1] = num
            }
        }

        var sb = StringBuilder()

        for (idx: Int in bucket.indices) {
            sb.append(bucket.get(idx))
            sb.append(" ")
        }

        sb.setLength(sb.length-1)

        bw.append(sb.toString())
        bw.flush()

    }
}