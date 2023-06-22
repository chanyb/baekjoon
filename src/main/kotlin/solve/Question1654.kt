package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

class Question1654 {
    init {
        // 랜선 자르기
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        val bw = BufferedWriter(OutputStreamWriter(System.`out`))
        val st = StringTokenizer(br.readLine(), " ")
        val k = st.nextToken().toInt()
        val n = st.nextToken().toInt()
        val cmk = Array(k){0L}
        var cmSum = 0L

        var maxCm = Long.MIN_VALUE
        for(idx in 0 until k) {
            // k개 랜선의 길이
            cmk[idx] = br.readLine().toLong()
            cmSum += cmk[idx]
            if(cmk[idx] > maxCm) maxCm = cmk[idx]
        }

        var max = maxCm

        var min = 1L
        while(true) {
            if(min==max || min+1==max) break

            var count = 0L
            val criteria = (min+max)/2
            for(each in cmk) {
                count += each/criteria
            }


            if(count >= n) {
                min = criteria
            }

            if(count < n) {
                max = criteria-1
            }
        }

        var count = 0L
        for(each in cmk) {
            count += each/max
        }

        if(count >= n) {
            bw.write(max.toString())
        } else {
            bw.write(min.toString())
        }
        bw.flush()

    }
}